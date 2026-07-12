# Java Foundations — 2-Week Intensive Plan

**Course:** Telusko — Java Tutorial for Beginners (https://www.youtube.com/watch?v=BGTx91t8q50)
**Duration:** Day 0 setup + 14 days | **Commitment:** 6 hours/day
**Daily ratio:** ~1 hour of video, ~5 hours of hands-on coding. Watching is not learning. Typing is learning.

Every day maps to a package in this repo (`src/main/java/dayNN/`) with its own
README, exercises, and automated tests. Mechanics are in [README.md](README.md).

---

## Rules (non-negotiable)

1. **Type every line of code yourself.** No copy-paste from the video, GitHub, or anywhere else.
2. **No AI tools.** No Claude, no ChatGPT, no Copilot, no AI-powered autocomplete. You will get access to AI tools only after passing the final review — and you'll be far better with them because of this phase. Official docs, Google, and Stack Overflow are allowed.
3. **Break your code on purpose.** After every working example, change something and predict the error before running it. Reading error messages is a core skill.
4. **Keep a daily log** in `LOG.md` at the repo root: what you learned, what confused you, what error took the longest to fix. Bring it to reviews.
5. **Commit and push daily** to your own repo (created from the template — see README). Commit history is your proof of work.
6. **Never modify the tests** (`src/test/java/`). Green tests are the definition of done for each day's exercises.
7. **If stuck for more than 45 minutes on one bug**, write down (a) what you expected, (b) what happened, (c) three things you tried — then move on and raise it in the next check-in.

---

## Day 0 — Setup (before Day 1, ~2 hours)

Follow the "One-time setup" section of [README.md](README.md): JDK, git, your
own repo from the template, IDE, and the smoke test. Day 1 assumes this is done.

---

## Week 1 — Language Fundamentals

### Day 1 — First Programs & How Java Works
**Video:** Course intro, JDK/JVM/JRE, bytecode, JShell, first program.
**Focus:** Compile and run from the command line before touching the IDE — you must understand what the IDE hides. Get your first test green to prove your toolchain works.
**Exercises & challenges:** `src/main/java/day01/README.md`

### Day 2 — Variables, Data Types, Operators
**Video:** Primitives, literals, type conversion/casting, arithmetic/relational/logical operators.
**Focus:** Overflow, casting surprises, integer vs floating-point division. Predict before you run.
**Exercises & challenges:** `src/main/java/day02/README.md`

### Day 3 — Conditionals + User Input
**Video:** `if/else`, ternary, `switch`, reading input with `Scanner`.
**Focus:** The same logic written three ways; separating decision logic (testable methods) from input/output (`main`).
**Exercises & challenges:** `src/main/java/day03/README.md`

### Day 4 — Loops
**Video:** `while`, `do-while`, `for`, nested loops, `break`/`continue`.
**Focus:** Star patterns build nested-loop intuition faster than anything else. They feel silly; do them anyway.
**Exercises & challenges:** `src/main/java/day04/README.md`

### Day 5 — Arrays and Strings
**Video:** 1D arrays, enhanced for loop, Strings, string methods, immutability, `StringBuffer`/`StringBuilder`. (2D arrays are introduced in the video today; the 2D exercise lands on Day 6 so today stays sane.)
**Focus:** Manual array algorithms — no built-in helpers. The `+` vs `StringBuilder` experiment goes in your log.
**Exercises & challenges:** `src/main/java/day05/README.md`

### Day 6 — Methods + Intro to Classes and Objects
**Video:** Methods, overloading, classes and objects, `new`, stack vs heap.
**Focus:** Refactoring Day 4/5 logic into methods; your first real classes. Draw the stack and heap on paper; photograph it into your log.
**Exercises & challenges:** `src/main/java/day06/README.md`

### Day 7 — WEEK 1 PROJECT DAY (no new video, no stubs, no tests)
**Project: Student Record Manager** — build from a blank file.
**Spec and definition of done:** `src/main/java/day07/README.md`
Self-check questions for your log are in the spec.

---

## Week 2 — Object-Oriented Programming and Beyond

### Day 8 — Constructors, this, static, Encapsulation
**Video:** Constructors, `this`, constructor overloading, `static`, encapsulation, getters/setters.
**Exercises & challenges:** `src/main/java/day08/README.md`

### Day 9 — Inheritance and Polymorphism
**Video:** `extends`, `super`, overriding, compile-time vs runtime polymorphism, dynamic method dispatch.
**Exercises & challenges:** `src/main/java/day09/README.md`

### Day 10 — Abstract Classes, Interfaces, final, Object class
**Video:** `abstract`, interfaces, `final`, `Object` (`toString`/`equals`/`hashCode`), inner classes (light exposure).
**Exercises & challenges:** `src/main/java/day10/README.md`

### Day 11 — Exception Handling
**Video:** Errors vs exceptions, `try/catch/finally`, `throw` vs `throws`, checked vs unchecked, custom exceptions, try-with-resources.
**Exercises & challenges:** `src/main/java/day11/README.md`

### Day 12 — Collections: ArrayList, HashMap, and friends
**Video:** Collections overview, `ArrayList`, `LinkedList` (concept), `HashSet`, `HashMap`, iteration, `Comparator`/`Comparable`, generics basics, wrapper classes/autoboxing.
**Exercises & challenges:** `src/main/java/day12/README.md`

### Day 13 — Threads, Lambdas, Streams (EXPOSURE ONLY)
**Video:** `Thread`/`Runnable`, race conditions, `synchronized`, lambdas, functional interfaces, Stream API.
**Goal:** recognition, not fluency. These click properly only after months of real coding.
**Exercises & challenges:** `src/main/java/day13/README.md`

### Day 14 — FINAL PROJECT DAY (no new video, no stubs, no tests)
**Project: Library Management System** — build from a blank file.
**Spec and definition of done:** `src/main/java/day14/README.md`

---

## Final Review (Viva) — the gate to Phase 2

You will walk through your Day 14 project and answer questions live. Sample questions:

1. Walk me through exactly what happens when I choose "Issue Book" — from `Scanner` input to the data changing.
2. Why is this field private? What breaks if I make it public?
3. Point to where runtime polymorphism happens in your code.
4. If I remove the `throws` clause here, what happens? Why?
5. Why did you use a `HashMap` for members but an `ArrayList` for books? What is the lookup cost of each?
6. What is the difference between `String` and `StringBuilder` — and where in YOUR code did the choice matter?
7. I'm going to change one line in your code while you watch. Predict the output before we run it.

**Pass criteria:** you can answer without opening a browser. Fluency in explaining your own code is the bar — not perfection.

**What you unlock by passing:** Phase 2, where you learn to work with Claude as a tutor and code reviewer, and eventually Claude Code. The engineers who get the most out of AI are the ones who can judge its output. That judgment is what these two weeks built.

---

## Daily Rhythm (suggested)

| Time block | Activity |
|---|---|
| Hour 1 | Watch today's video segment. Pause and type along — never just watch. |
| Hours 2–3 | Redo every example from memory, then break each one deliberately. |
| Hours 4–5 | Today's exercises, in order, until the day's tests are green. Struggle is the point — 45-min rule applies. |
| Hour 6 | Revision: re-solve ONE exercise from 2 days ago from a blank file. Update `LOG.md`. Commit and push. |

**Pacing:** the 14 days are working days — take the weekend off (or use it to catch up if you're behind). A burned-out Day 10 produces nothing; protect your recovery.

**Check-ins:** 30 minutes on Day 4, Day 7, Day 11, Day 14. Bring your log and your repo — we'll run `./check-progress.sh` together and read your commit history.
