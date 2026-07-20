# Day 02 — Variables, Data Types, Operators

## Today's goal
Understand Java's primitive types, how literals and casting work, and how the arithmetic operators behave — including the traps: integer division and overflow. You will write three small calculators and run an exploration lab that shows types misbehaving on purpose.

## Watch
- The eight primitives (`int`, `long`, `double`, `boolean`, `char`, `byte`, `short`, `float`) and when to reach for each
- Literals: `10`, `10L`, `3.14`, `'A'`, `true`
- Casting: widening (safe) vs narrowing (you must ask for it with `(int)`)
- Operators: `+ - * / %`, and why `7 / 2` is `3`, not `3.5`

## Warm-up (not tested)
Open `CastingLab.java` and work through its TODOs. **Predict every answer before you run it.**

1. Declare every primitive and print its min/max (`Integer.MAX_VALUE`, `Integer.MIN_VALUE`, `Long.MAX_VALUE`, `Byte.MAX_VALUE`, `Double.MAX_VALUE`, ...).
2. Overflow an `int` on purpose: take `Integer.MAX_VALUE` and add 1. Predict, then print. (The number wraps around to negative — that is overflow.)
3. Cast a `double` to an `int` (`(int) 9.99`) — does it round or chop? Then cast an `int` larger than 127 to a `byte` (`(byte) 200`) and explain the result.

## Exercises (tested)

| Class | What you build | Run with |
|-------|----------------|----------|
| `InterestCalculator` | `simpleInterest(p, r, y)` = p·r·y/100; `totalAmount(...)` = principal + interest | `./mvnw test -Dtest="day02.InterestCalculatorTest"` |
| `TemperatureConverter` | `celsiusToFahrenheit(c)`, `fahrenheitToCelsius(f)` | `./mvnw test -Dtest="day02.TemperatureConverterTest"` |
| `DigitSum` | `sumOfDigits4(n)` — sum the 4 digits using only `%` and `/`, no loops | `./mvnw test -Dtest="day02.DigitSumTest"` |

## Break it on purpose
**Predict before you run.**

1. In `TemperatureConverter`, change the return type and inputs to `int` instead of `double` and try `celsiusToFahrenheit(37)`. Predict the answer, then see how integer division mangles `9/5`. Change it back and feel why `double` matters here.
2. In `DigitSum`, try to be clever and use `+` where you meant `%`. Predict what `sumOfDigits4(1234)` gives, then run the test and read the failure message.

## Log prompts
- Why does `7 / 2` give `3` in Java? How do you make it give `3.5`?
- What actually happened when you overflowed an `int`? Why?

## Definition of done
- `./mvnw test -Dtest="day02.*Test"` is all green
- `CastingLab` warm-ups done, with predictions written down
- Learning log updated
