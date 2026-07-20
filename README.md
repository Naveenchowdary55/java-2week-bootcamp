# Java Foundations — 2-Week Bootcamp

Welcome! This repo is your home for the next two weeks. It contains a day-by-day
plan, hands-on exercises with automated tests, and two project days where you
build real programs from scratch.

**Read [PLAN.md](PLAN.md) first.** It has the full schedule, the rules, and the
daily rhythm. This file covers the mechanics: setup, workflow, and how to run
the tests.

---

## How this works

- Each day has a package under `src/main/java/dayNN/` with:
  - a **README.md** — that day's instructions, exercises, and log prompts
  - **stub classes** — method signatures with a spec; the bodies say
    `TODO: implement me`. You write the bodies.
- Each stub has a matching **JUnit test** under `src/test/java/dayNN/`.
  The tests are your instant feedback: red means keep going, green means done.
- Days 7 and 14 are **project days** — no stubs, no tests. You build from a
  blank file. The spec is in that day's README.

You do NOT need to understand Maven or JUnit to use this repo. You need exactly
one command (see below). We'll demystify the tooling in Phase 2.

---

## One-time setup (Day 0 — do this before Day 1)

> **New to all of this?** Follow **[INSTALL.md](INSTALL.md)** instead — it's
> the same setup as a click-by-click guide (JDK, VS Code, the Java extension
> pack, running your first test) with a watch-along video and troubleshooting
> table. Come back here for step 3 (getting your own repo).

1. **Install a JDK (version 17 or newer).** Get it from https://adoptium.net/
   Verify in a terminal:
   ```bash
   java --version
   javac --version
   ```
2. **Install git** and create a GitHub account if you don't have one.
   Verify: `git --version`
3. **Get your own copy of this repo:**
   - Open the template repo on GitHub and click **"Use this template" → "Create a new repository"**.
   - Name it `java-2week-bootcamp-<yourname>`, set it to **Private**.
   - On your new repo: **Settings → Collaborators → Add people** → add your mentor.
   - Clone YOUR repo (not the template):
     ```bash
     git clone https://github.com/<your-username>/java-2week-bootcamp-<yourname>.git
     cd java-2week-bootcamp-<yourname>
     ```
4. **Install an IDE:** IntelliJ IDEA Community Edition (recommended) or VS Code
   with the "Extension Pack for Java". Open the cloned folder; the IDE will
   recognize the Maven project automatically.
5. **Smoke test.** From the repo root:
   ```bash
   ./mvnw test -Dtest="day01.*Test"
   ```
   The first run downloads dependencies (needs internet, takes a few minutes).
   You should see test FAILURES — that's correct! The stubs aren't implemented
   yet. If you see compilation or download errors instead, fix your setup
   before Day 1 and ask for help early.
6. **Learn the 4 git commands you'll use daily:**
   ```bash
   git status                  # what changed?
   git add .                   # stage everything
   git commit -m "day03: bill splitter and leap year done"
   git push                    # publish to your GitHub repo
   ```

## Daily workflow

1. Open `src/main/java/dayNN/README.md` and follow it top to bottom.
2. Implement the stubs. Run the day's tests as often as you like:
   ```bash
   ./mvnw test -Dtest="day03.*Test"        # just today's tests
   ./mvnw test                          # everything so far
   ```
3. A test failure tells you what was expected vs. what your code returned.
   Read it carefully — decoding failures is a skill you're here to build.
4. Do the day's untested practice tasks and update your log (`LOG.md` — create
   it at the repo root on Day 1).
5. **Commit and push before you stop for the day.** Commit history is your
   proof of work. Several small commits beat one giant one.

## Rules (short version — full version in PLAN.md)

- Type every line yourself. No copy-paste.
- **No AI tools** — no ChatGPT, Claude, Copilot, or AI autocomplete. Official
  docs, Google, and Stack Overflow are allowed.
- Never edit anything under `src/test/java/` — the tests define the contract.
  If a test seems wrong, raise it at a check-in instead.
- Stuck > 45 minutes on one bug? Write down what you expected, what happened,
  and three things you tried. Move on, raise it at the next check-in.

## FAQ

- **`UnsupportedOperationException: TODO: implement me`** — you're running a
  stub you haven't implemented yet. That's the starting state, not an error.
- **`./mvnw: permission denied`** — run `chmod +x mvnw` once.
- **Windows** — use `mvnw.cmd` instead of `./mvnw`.
- **Where do I write throwaway experiments?** Anywhere in that day's package;
  extra files are fine and won't break the tests.

---

## For mentors

- Push this repo to GitHub (main branch only) and enable
  **Settings → General → Template repository**.
- Keep the `solutions` branch **local or in a separate private repo** — if you
  push it to the public template, interns will find it.
- Track an intern's progress:
  ```bash
  git clone <intern-repo-url> && cd <repo>
  ./check-progress.sh
  ```
  Prints a per-day pass/total table. Combine with `git log --oneline` for the
  effort picture, and the Day 4/7/11/14 check-ins + final viva (see PLAN.md)
  for depth.
