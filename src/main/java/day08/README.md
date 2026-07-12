# Day 08 — Constructors, `this`, `static`, and Encapsulation

## Today's goal
Take control of how your objects are born and how they guard their data. You'll write constructors (default, parameterized, overloaded), use `this` to disambiguate and to chain constructors, share data across all instances with `static`, and lock a class down properly with encapsulation.

## Watch
Video topics for today: default vs parameterized constructors, `this`, constructor overloading, `static` variables/methods/blocks, encapsulation, getters and setters.

## Warm-up (not tested)
In a scratch file, take your Day 6 `Student` and `BankAccount` and add constructors to them — a no-arg one and a parameterized one. Notice how a parameterized constructor lets you create a ready-to-use object in a single line.

Then answer this in your log: **why can't a `static` method access a non-static (instance) variable?** Prove it — write a `static` method that tries to read an instance field, compile it, and paste the exact compiler error into your log. (Hint: a static method belongs to the class, but instance fields only exist inside a specific object — which one would it read?)

## Exercises (tested)

| Class | What you build | Run with |
|-------|----------------|----------|
| `Employee` | Auto-incrementing unique ids via a `static` counter | `./mvnw test -Dtest="day08.EmployeeTest"` |
| `BankAccountV2` | Fully encapsulated account, no balance setter, `static` account count | `./mvnw test -Dtest="day08.BankAccountV2Test"` |
| `StudentV2` | Constructor overloading with `this(...)` chaining | `./mvnw test -Dtest="day08.StudentV2Test"` |

### Notes that matter
- **`Employee`** — the id counter and the total count are `static`: one copy shared by every `Employee`. The constructor reads the next id, assigns it, then bumps the counter. Assign each id **once** at construction so it never changes.
- **`BankAccountV2`** — there is intentionally **no `setBalance`**. If outsiders could set the balance to anything, all your deposit/withdraw rules would be pointless — someone could just write `acc.setBalance(1000000)`. Encapsulation means money moves *only* through `deposit` and `withdraw`, which enforce the rules. Also: increment the account counter **after** validation passes, so a rejected construction doesn't count.
- **`StudentV2`** — the two-argument constructor must call `this(name, rollNo, new int[0])` as its **first statement**. Don't copy-paste the field assignments into both constructors; chaining keeps one source of truth.

## Break it on purpose
- In `Employee`, make the id counter an *instance* field instead of `static`. Watch every employee get the same id. Now you understand why it must be `static`.
- In `BankAccountV2`, move the counter increment to the top of the constructor, before validation. Run the "failed construction" test and watch it fail — the count went up for an account that was never created.
- In `StudentV2`, try putting a statement *before* the `this(...)` call. The compiler will stop you: `this(...)` must come first.

## Log prompts
- Why must a static method fail to read an instance variable? (Paste the compile error.)
- In your own words: what does encapsulation buy you here that public fields didn't?
- Where else in real code would an auto-incrementing static id be useful?

## Definition of done
`./mvnw test -Dtest="day08.*"` is all green, both warm-ups are done (including the pasted compile error), and your log is updated.
