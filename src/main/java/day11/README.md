# Day 11 — Exception Handling

## Today's goal
Stop treating errors as the end of the world and start treating them as data.
By tonight you should be able to read a stack trace to the exact failing line,
choose between `try/catch/finally`, and — the big one — decide whether a problem
should be a **checked** or an **unchecked** exception, and defend the choice.

## Watch
Errors vs exceptions, `try/catch/finally`, multiple `catch` blocks, `throw` vs
`throws`, checked vs unchecked, custom exceptions, try-with-resources.

Two words that get confused all day:
- **`throw`** is a statement — you *do* it: `throw new InvalidAmountException("...");`
- **`throws`** is a clause on a method signature — a *warning label* saying "calling
  me might throw this checked exception, so be ready."

## Warm-up (not tested)
`StackTraceLab.java` — open it and work the TODOs one at a time. You will
deliberately cause five different exceptions (`ArithmeticException`,
`ArrayIndexOutOfBoundsException`, `NullPointerException`, `NumberFormatException`,
`InputMismatchException`). For each one: run it, read the **full** stack trace,
and write down the exception class **and the exact line number** the top frame
points to. Then wrap one in `try/catch` and add a `finally` block. This is not
busywork — reading stack traces fast is a daily-driver skill.

## Exercises (tested)
Two classes are **PROVIDED complete** — read them, don't change them. They are
the two exception types you will throw:

- `InsufficientBalanceException extends Exception` — **checked**. The compiler
  forces callers to handle it. Use it for a recoverable business situation.
- `InvalidAmountException extends RuntimeException` — **unchecked**. The compiler
  does not force anyone to catch it. Use it for a caller *bug* (bad argument).

Why the split? A checked exception is you telling every caller "this can
reasonably go wrong at runtime even in a correct program — you must have a plan."
An unchecked exception is you saying "you called me wrong; fix your code." Notice
that `withdraw` has `throws InsufficientBalanceException` in its signature and
`deposit` has no `throws` at all — that difference *is* the lesson.

| Class | What you build | Run with |
|---|---|---|
| `SafeBankAccount` | An account that throws the unchecked exception on bad amounts and the checked one on overdraw | `./mvnw test -Dtest="day11.SafeBankAccountTest"` |
| `SafeInput` | `readInt` that re-prompts until it gets a real int — you will REUSE this on Day 14 | `./mvnw test -Dtest="day11.SafeInputTest"` |

## Break it on purpose
- In `withdraw`, remove `throws InsufficientBalanceException` from the signature
  (but keep throwing it). Watch the compiler refuse. Now change the exception's
  parent from `Exception` to `RuntimeException` — the compiler goes quiet. That
  is checked vs unchecked in one experiment.
- In `SafeInput.readInt`, delete the `sc.next()` line. Run the `SafeInputTest`.
  It hangs forever — you never consumed the bad token, so `hasNextInt()` keeps
  saying false on the same "abc". Kill it, put the line back, understand why.
- Wrap a `try/catch` around a line, add a `finally`, and `return` from inside the
  `try`. Does `finally` still run? (Yes. Prove it.)

## Log prompts
- Write your own one-line rule for "when do I make an exception checked vs
  unchecked?" — in your own words, not the textbook's.
- Which stack trace in the warm-up took you longest to read, and why?
- Where does `finally` run that a normal line after the `try` would not?

## Definition of done
`./mvnw test -Dtest="day11.*"` all green, both warm-up TODO sets explored (with
line numbers written down), and `LOG.md` updated.
