#!/usr/bin/env bash
# Mentor tool: per-day test pass summary for an intern's repo.
# Usage: ./check-progress.sh   (run from the repo root)
set -u
cd "$(dirname "$0")"

echo "Running all tests (failures are expected for unfinished days)..."
./mvnw -q test -Dmaven.test.failure.ignore=true >/dev/null 2>&1

REPORTS=target/surefire-reports
if [ ! -d "$REPORTS" ]; then
  echo "No test reports found — did the build fail to compile?"
  echo "Run './mvnw test-compile' to see the compilation error."
  exit 1
fi

echo
printf "%-10s %8s %8s   %s\n" "Day" "Passed" "Total" "Status"
printf "%-10s %8s %8s   %s\n" "---------" "------" "-----" "------"

for day in $(ls "$REPORTS" | grep -oE '^(day[0-9]+|week[0-9]+test)' | sort -u); do
  passed=0
  total=0
  for f in "$REPORTS"/${day}.*.txt; do
    [ -e "$f" ] || continue
    line=$(grep -E '^Tests run:' "$f" | head -1)
    run=$(echo "$line"  | sed -E 's/Tests run: ([0-9]+).*/\1/')
    fail=$(echo "$line" | sed -E 's/.*Failures: ([0-9]+).*/\1/')
    err=$(echo "$line"  | sed -E 's/.*Errors: ([0-9]+).*/\1/')
    skip=$(echo "$line" | sed -E 's/.*Skipped: ([0-9]+).*/\1/')
    total=$((total + run))
    passed=$((passed + run - fail - err - skip))
  done
  if [ "$total" -eq 0 ]; then
    status="no results"
  elif [ "$passed" -eq "$total" ]; then
    status="✅ complete"
  elif [ "$passed" -eq 0 ]; then
    status="⬜ not started"
  else
    status="🔶 in progress"
  fi
  printf "%-10s %8s %8s   %s\n" "$day" "$passed" "$total" "$status"
done

echo
echo "Days 7 and 14 are project days with no automated tests — review those by hand."
echo "Also check: git log --oneline | head -30   and LOG.md"
