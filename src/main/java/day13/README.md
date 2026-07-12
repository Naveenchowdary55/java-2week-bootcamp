# Day 13 — Threads, Lambdas, Streams (EXPOSURE ONLY)

## Today's goal — read this twice
Today is about **recognition, not mastery.** Threads, lambdas, and streams are
big topics that click properly only after months of real coding. Your job is NOT
to become fluent. Your job is to see each one work once, feel where it bites, and
be able to *recognise* it later. If you finish today a little confused but able to
point at a race condition and name it, that is a win. Do not rabbit-hole.

## Watch
`Thread` / `Runnable`, `start()` vs `run()`, race conditions, `synchronized`,
lambdas, functional interfaces, the Stream API (`filter` / `map` / `sorted` /
`reduce`).

A **lambda** is just a short way to write a throwaway function: `n -> n * n` is
"a function that takes n and gives back n squared." You have already been using
them today the moment you wrote a `Comparator`.

## Warm-up (not tested)
`ThreadLab.java` — the most important file today. Two experiments:
1. Two named threads each printing 1..100. Run the program **twice** and compare —
   the interleaving is different every time. No one promised you an order.
2. An **unsynchronised** shared counter hit by two threads. **Predict** the final
   count (two threads × 10000 = ?), then run it. You will not get 20000, because
   `count++` is secretly three steps and the threads trample each other. That is a
   **race condition** — the single most important thing to recognise today.

## Exercises (tested)

| Class | What you build | Run with |
|---|---|---|
| `SyncCounter` | a counter safe to increment from many threads (`synchronized`) | `./mvnw test -Dtest="day13.SyncCounterTest"` |
| `StreamDrills` | two one-line stream pipelines over numbers and students | `./mvnw test -Dtest="day13.StreamDrillsTest"` |

`SyncCounter` is the warm-up's race condition, fixed with one keyword. Its test
runs two threads doing 10,000 increments each and expects exactly 20,000 — if you
forget `synchronized`, it fails *sometimes*, which is exactly how race bugs behave
in the wild.

For `StreamDrills`, after each chain passes, write the plain `for`-loop version in
a comment underneath. Seeing the loop and the stream side by side is how streams
stop looking like magic.

## Break it on purpose
- Delete `synchronized` from `SyncCounter.increment()` and run its test 5–10
  times. Watch it pass sometimes and fail sometimes with a number just under
  20000. Intermittent failure is the signature of a race condition — burn that
  into memory.
- In `ThreadLab`, change `start()` to `run()`. The output stops interleaving,
  because `run()` never starts a new thread — it just runs on the current one.
- In `evensSquaredSum`, swap `filter` and `map` so you square first then keep
  "evens". The answer changes. Order in a stream pipeline matters.

## Log prompts
- Describe a race condition in one sentence you could say out loud to a friend.
- Why does an unsynchronised `count++` lose updates? (Name the three hidden steps.)
- A lambda vs a full method: when is the lambda clearly nicer, and when would you
  rather have a named method?

## Definition of done
`./mvnw test -Dtest="day13.*"` all green, the `ThreadLab` race reproduced with
your own eyes (prediction written down first), the plain-loop comments added to
`StreamDrills`, and `LOG.md` updated.
