# Day 03 — Conditionals + User Input

## Today's goal
Make programs that decide. You will use `if`/`else`, the ternary operator, and `switch`, and you will read input from the keyboard with `Scanner`. Several exercises ask for the *same* logic written different ways so you feel the trade-offs.

## Watch
- `if` / `else if` / `else`
- The ternary operator `condition ? a : b`
- `switch` statements (and switching on a computed value like `marks / 10`)
- `Scanner` — reading `int`, `double`, and `String` from the user

## Warm-up (not tested)
1. **Interest calculator, now interactive.** Add a `main` to a scratch class (or reuse Day 02) that reads principal, rate, and years from a `Scanner` and prints the interest. Feel the read → compute → print loop.
2. **Interactive versions of today's exercises.** Each testable class has (or can have) a `main` — wire up `Scanner` input so you can play with `GradeAssigner`, `BillSplitter`, and especially `RockPaperScissors` against the computer using the provided `randomMove()`.

## Exercises (tested)

| Class | What you build | Run with |
|-------|----------------|----------|
| `GradeAssigner` | `gradeIfElse`, `gradeTernary`, `gradeSwitch` — identical grading, three constructs | `./mvnw test -Dtest="day03.GradeAssignerTest"` |
| `BillSplitter` | `perPersonShare(total, people)` — add 10% tip when total > 2000 | `./mvnw test -Dtest="day03.BillSplitterTest"` |
| `LeapYear` | `isLeap(year)` — the /4, /100, /400 rule | `./mvnw test -Dtest="day03.LeapYearTest"` |
| `RockPaperScissors` | `winner(p1, p2)` — case-insensitive, returns PLAYER 1/PLAYER 2/DRAW | `./mvnw test -Dtest="day03.RockPaperScissorsTest"` |
| `ElectricityBill` | `amount(units)` — slab pricing 3/5/8/10 | `./mvnw test -Dtest="day03.ElectricityBillTest"` |

## Break it on purpose
**Predict before you run.**

1. In `GradeAssigner.gradeSwitch`, delete a `break` or merge the wrong cases (e.g. lump `case 7` fully into `'B'`). Predict what `gradeSwitch(74)` returns, then run the test — this is exactly the 75/74 boundary the tests guard.
2. In `BillSplitter`, change `total > 2000` to `total >= 2000`. Predict what happens to `perPersonShare(2000, 4)` and watch that one test flip to red. Boundaries are where bugs live.

## Log prompts
- When would you choose `switch` over an `if`/`else` chain? When is the ternary clearer, and when is it just harder to read?
- What goes wrong if you compare two Strings with `==` instead of `.equals(...)`?

## Definition of done
- `./mvnw test -Dtest="day03.*"` is all green
- Warm-ups done (you built at least one interactive `Scanner` program)
- Learning log updated
