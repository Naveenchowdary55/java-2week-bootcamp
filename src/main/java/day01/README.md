# Day 01 — First Programs & How Java Works

## Today's goal
Get Java running on your own machine and understand what actually happens when you "run" a program: source code becomes bytecode, and the JVM runs the bytecode. By the end you will have compiled and run a program from the command line, and made your first test go green.

## Watch
- Course intro and what the two weeks look like
- JDK vs JRE vs JVM — who does what
- What bytecode is and why Java is "write once, run anywhere"
- JShell — a scratchpad for trying Java one line at a time
- Hello World, and compiling from the command line with `javac` and `java`

## Warm-up (not tested)
Do these before you write any tested code. They build the muscle memory.

1. **Compile and run Hello from the terminal, before the IDE.** Open `day01/Hello.java`. From the `src/main/java` folder run:
   ```bash
   javac day01/Hello.java     # produces day01/Hello.class
   java day01.Hello           # prints: Hello, Bootcamp!
   ```
   Notice: you compile the `.java` file (with a slash and `.java`), but you run the class (with a dot and no `.class`). Understanding this now saves you a hundred confused minutes later.
2. **Five print programs.** Using only `System.out.println`, print: (a) a banner of your name, (b) a small star pattern, (c) your address block over several lines, (d) a row of numbers 1–10, (e) anything you like. Get comfortable typing, compiling, fixing, re-running.
3. **Daily schedule as a table.** Print your day as a neat table (times on the left, activity on the right) using only `println`. Line things up by hand with spaces — it is fiddly on purpose.

## Exercises (tested)
Implement the methods in `Warmup.java`. `Hello.java` is already complete — you only run it.

| Class | What you build | Run with |
|-------|----------------|----------|
| `Warmup` | `greeting(name)` returns a welcome sentence; `starLine(count)` returns that many `*` | `./mvnw test -Dtest="day01.WarmupTest"` |

## Break it on purpose
Learning what breaks teaches you how it works. **Predict the outcome before you run each one.**

1. In `Hello.java`, change `System.out.println` to `System.out.printLn` (capital L). Predict: does it fail when you compile, or only when you run? Compile it and see. (This teaches the difference between a compile error and a runtime error.)
2. Rename the file `Hello.java` to `Howdy.java` but leave `class Hello` inside. Predict what `javac` says. Java requires the public class name to match the file name — this is why.

## Log prompts
Write a few sentences in your learning log:
- In your own words, what is the difference between the JDK, the JRE, and the JVM?
- What surprised you when you compiled from the command line?

## Definition of done
- `./mvnw test -Dtest="day01.*Test"` is all green
- Warm-ups done (you compiled and ran Hello from the terminal)
- Learning log updated
