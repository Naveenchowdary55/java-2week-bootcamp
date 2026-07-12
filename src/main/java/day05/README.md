# Day 05 — Arrays and Strings

## Today's goal
Store many values in one place (arrays) and pick text apart one character at a
time (Strings). By the end you can walk an array with an index, mutate an array
in place, and count things inside a String — all with plain loops, no library
shortcuts. That "walk it yourself" muscle is what everything next week is built
on.

## Watch
- 1D arrays: declaring, `new int[n]`, indexing, `.length`
- The enhanced for loop (`for (int x : arr)`) and when you can't use it
- 2D arrays (watch now, you'll *build* one tomorrow on Day 6)
- Strings: `length()`, `charAt(i)`, comparing with `.equals()` not `==`
- String immutability, and `StringBuilder` / `StringBuffer`

## Warm-up (not tested)
Open `BuilderLab.java` and follow the TODOs: build a 10,000-character String with
`+` in a loop and time it, then do the same work with a `StringBuilder` and time
that. Write both timings in your log and one sentence on *why* they differ. This
is where "Strings are immutable" stops being a slogan and becomes a number.

## Exercises (tested)
Do these with **loops only** — no `Arrays.sort`, no streams, no `Collections`.
The Javadoc in each file says the same thing. Fighting the urge to reach for a
helper is the exercise.

| Class | What you build | Run with |
|-------|----------------|----------|
| `ArrayStats` | sum, average, max, min, and second-largest-distinct over an `int[]` | `./mvnw test -Dtest="day05.ArrayStatsTest"` |
| `ArrayOps` | reverse an array *in place* (mutate the same array) | `./mvnw test -Dtest="day05.ArrayOpsTest"` |
| `StringDrills` | count vowels/consonants/digits/spaces, palindrome check, character frequency | `./mvnw test -Dtest="day05.StringDrillsTest"` |

Notes worth reading twice:
- `secondLargest` wants the second largest **distinct** value in **one pass**.
  `[9, 9, 3]` is `3`, not `9`. If everything is equal, it throws.
- `reverseInPlace` returns `void`. The test checks that *your original array*
  changed — because an array variable points at one shared object in memory.
- `isPalindrome` ignores case but treats spaces as real characters, so
  `"Nurses Run"` is **not** a palindrome. Keep it simple.

## Break it on purpose
Predict the outcome *before* you run each one.
1. In `ArrayStats.max`, start your "biggest so far" at `0` instead of `arr[0]`,
   then run `max` on `[-3, -8]`. What comes out, and why is `0` a trap?
2. Compare two equal Strings with `==` instead of `.equals()` in a scratch
   `main` (e.g. `new String("hi") == new String("hi")`). Print the result.
   What does `==` actually compare for objects?

## Log prompts
- The two `BuilderLab` timings, and why the `+` loop is slower.
- Your one-pass idea for `secondLargest` in plain English — what two values did
  you track and when did each change?
- What did `==` print in the "break it" experiment, and what will you use next
  time you compare Strings?

## Definition of done
- `./mvnw test -Dtest="day05.*"` is all green.
- `BuilderLab` warm-up done and both timings recorded.
- Log updated with today's prompts.
