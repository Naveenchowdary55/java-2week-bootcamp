# Day 06 — Methods + Intro to Classes and Objects

## Today's goal
Stop writing everything as loose `static` helpers and start modelling things.
Today you build small **classes**, create **objects** with `new`, and give each
object its own data. You'll also meet **overloading** (same method name, different
arguments) and get a first feel for **stack vs heap** — where your variables and
your objects actually live.

## Watch
- Methods: parameters, return types, and calling one method from another
- Method overloading — how Java picks between same-named methods by argument type
- Classes vs objects: a class is the blueprint, an object is the built thing
- `new`, constructors, fields, and the `this` keyword
- Stack vs heap: local variables and references on the stack, objects on the heap

## Warm-up (not tested)
1. Open two of your **Day 4** solutions in a scratch file and refactor each into
   smaller helper methods — pull any chunk you can name into its own method with
   a clear name. Notice how the top-level logic gets easier to read.
2. On paper, draw the **stack and heap** for two objects of the same class (say
   two `Student`s). Show the two reference variables on the stack pointing at two
   separate objects on the heap. Photograph it into your log.

## Exercises (tested)

| Class | What you build | Run with |
|-------|----------------|----------|
| `Calculator` | three overloaded `add` methods (two ints, three ints, two doubles) | `./mvnw test -Dtest="day06.CalculatorTest"` |
| `Student` | constructor + getters, `average()`, and `grade()` on the Day 3 scale | `./mvnw test -Dtest="day06.StudentTest"` |
| `BankAccount` | `deposit` / `withdraw` with validation, `getBalance` / `getOwner` | `./mvnw test -Dtest="day06.BankAccountTest"` |
| `MatrixMath` | element-wise 2D-array addition into a new matrix | `./mvnw test -Dtest="day06.MatrixMathTest"` |

Things to notice:
- `Calculator`'s methods are **instance** methods, so you call them on an object:
  `new Calculator().add(2, 3)`. That's on purpose — practise `new`.
- `Student` and `BankAccount` stubs have **no fields** — you declare your own to
  remember the constructor arguments. Keep the balance `private`.
- `Student.grade()` should call your own `average()`, not recompute it.
- `MatrixMath` is the **2D-array** exercise. It moved here from Day 5 to balance
  the load: you watched 2D arrays yesterday, so today you build with them. Use
  two nested loops and build a brand-new result matrix.

## Break it on purpose
Predict first, then run.
1. In `BankAccount.withdraw`, drop the `amount > balance` check so any positive
   amount goes through. Now withdraw more than you have. What does the balance
   become, and why is a "negative balance" a bug the check was preventing?
2. Give `Calculator` only the `add(double, double)` version and delete the
   `add(int, int)` one. Call `add(2, 3)` with plain ints. Does it still compile?
   What does that tell you about how Java promotes `int` to `double`?

## Log prompts
- In your own words: what is the difference between a class and an object?
- From your stack/heap drawing: if you write `Student b = a;` (no `new`), how many
  objects exist on the heap — one or two? Why?
- What did the `BankAccount` sabotage do to the balance, and which single line
  prevented it?

## Definition of done
- `./mvnw test -Dtest="day06.*"` is all green.
- Both warm-ups done (refactor + stack/heap photo in the log).
- Log updated with today's prompts.
