# Day 04 — Loops

## Today's goal
Repeat work without repeating yourself. You will use `while`, `do-while`, and `for` loops, nest loops to draw shapes, and use `break`/`continue`. Loops are where beginners' programs start to feel powerful — and where off-by-one bugs love to hide.

## Watch
- `while` and `do-while`
- `for` loops (the counter, the condition, the step)
- Nested loops (a loop inside a loop) — rows and columns
- `break` (stop the loop now) and `continue` (skip to the next turn)

## Warm-up (not tested)
1. **Countdown 10 → 1, three ways.** Print the numbers 10 down to 1 using a `while`, then a `do-while`, then a `for`. Same output, three shapes — notice what each style makes easy.
2. **Interactive multiplication-table printer.** Read a number with `Scanner` and print its full times table with a loop.

## Exercises (tested)

| Class | What you build | Run with |
|-------|----------------|----------|
| `LoopBasics` | `sumOfEvens(n)`; `multiplicationTable(n)` as an exact 10-line String | `./mvnw test -Dtest="day04.LoopBasicsTest"` |
| `NumberOps` | `reverseDigits`, `isPrime`, `primesUpTo`, `fibonacci` | `./mvnw test -Dtest="day04.NumberOpsTest"` |
| `StarPatterns` | `rightTriangle`, `pyramid`, `diamond` — Strings joined by `\n`, no trailing newline | `./mvnw test -Dtest="day04.StarPatternsTest"` |
| `GuessingGame` | `hint(secret, guess)` returns HIGHER/LOWER/CORRECT | `./mvnw test -Dtest="day04.GuessingGameTest"` |

Watch the newline rule: patterns and the multiplication table join rows with `\n` and must have **no** trailing newline at the end. That single trailing `\n` is the most common reason these tests go red.

## Break it on purpose
**Predict before you run.**

1. In `LoopBasics.sumOfEvens`, change the loop start from `2` to `1` or the condition from `i <= n` to `i < n`. Predict `sumOfEvens(10)` in each case, then run the test. This is the off-by-one error, live.
2. In `StarPatterns`, append an extra `\n` after the last row (or start the loop building with a leading `\n`). Predict whether the test passes, then run it and read how the failure message shows the difference.

## Log prompts
- When would you reach for a `while` loop instead of a `for` loop?
- Describe an off-by-one bug you hit today and how you found it.

## Definition of done
- `./mvnw test -Dtest="day04.*"` is all green
- Warm-ups done (countdown three ways + interactive table)
- Learning log updated
