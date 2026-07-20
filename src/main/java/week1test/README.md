# Week 1 Test — Days 1–6

A timed, closed-book assessment of everything from Week 1. Five problems:
three **easy**, two **medium**. Everything lives in this one package.

**Time: 3 hours. Total: 70 marks.**

---

## The problems

| # | Class | Level | Topics | Marks |
|---|-------|-------|--------|-------|
| 1 | `TriangleClassifier` | Easy | conditionals, validation, boundaries (Day 3) | 10 |
| 2 | `LoopDrills` | Easy | loops, digit maths, building Strings (Day 2, 4) | 10 |
| 3 | `TextStats` | Easy | Strings, `charAt`, character walking (Day 5) | 10 |
| 4 | `ArrayPuzzles` | Medium | arrays, index maths, nested loops (Day 5) | 20 |
| 5 | `ParkingLot` | Medium | classes, fields, constructor overloading, array state (Day 6) | 20 |

Do them in order — they get harder. Problems 1–3 should take about 20 minutes
each. Problems 4 and 5 are the real test; budget 45 minutes each and keep the
last 20 minutes to re-read your code and run the full suite once more.

## Rules

- **Closed book on AI.** No ChatGPT, Claude, Copilot, or AI autocomplete. Turn
  the autocomplete extension off before you start.
- **Official Java docs are allowed.** So is your own `LOG.md` and your own code
  from Days 1–6. Nothing else — no Stack Overflow, no Google, for this test.
- **Never edit anything under `src/test/java/`.** The tests define the contract.
- **Loops only.** No `Arrays.sort`, no streams, no `Collections`, no `HashMap`,
  no `ArrayList`. Everything on this test is solvable with what Week 1 taught —
  plain loops, arrays, and `String` methods. Reaching for a library helper
  scores zero for that method even if the test goes green.
- Type every line yourself.

## How to run

```bash
./mvnw test -Dtest="week1test.*Test"             # the whole test
./mvnw test -Dtest="week1test.TextStatsTest"     # one problem
```

You start with every test red — the stubs all throw
`UnsupportedOperationException`. That is the correct starting state, not a
setup error. Green means done.

## What you are being marked on

Passing tests is most of it, but not all of it:

- **Correctness (70%)** — tests green.
- **Edge cases (15%)** — empty arrays, empty Strings, zero, negatives, and the
  boundary values. Several tests exist *only* to catch these. Read each spec's
  examples carefully; the awkward ones are there on purpose.
- **Readability (15%)** — sensible names, no dead code, no copy-pasted blocks
  you could have called a method for.

## Partial credit

A problem where four of five methods pass is worth far more than a blank file.
If you are stuck on one method, leave its `throw` in place, move on, and come
back. Never delete a method signature to make things compile — a missing method
breaks compilation for the whole package and costs you every mark in it.

## If you get stuck

Re-read the Javadoc — every method states its exact contract and shows worked
examples, including what to do with the empty/zero/invalid input. The test
failure message tells you what was expected and what your code returned. Those
two things together are enough. Decoding them without help is part of what is
being assessed.
