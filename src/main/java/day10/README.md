# Day 10 — Abstract Classes, Interfaces, `final`, and the `Object` class

## Today's goal
Design with contracts. You'll make a class `abstract` so it can *require* behaviour without providing it, define `interface` contracts that unrelated classes can implement, and override methods from `Object` (`toString`) that every class inherits. This is the toolkit that frameworks like Spring are built on.

## Watch
Video topics for today: abstract classes and methods, interfaces, abstract class vs interface, `final`, the `Object` class (`toString` / `equals` / `hashCode`), and a light look at inner classes.

## Warm-up (not tested)
Answer in your log: **when do you reach for an abstract class vs an interface?** Give one concrete example of each. (Rough rule: an abstract class shares *code and state* among closely related classes and gives an "is-a" backbone; an interface is a pure *capability* that even unrelated classes can promise to provide — a `Payable` can be an employee or an invoice.)

Then try to instantiate the abstract `Shape` directly: `Shape s = new Shape();`. It won't compile. Paste the exact compiler error into your log — that's the language enforcing "there is no such thing as a generic shape."

## Exercises (tested)

| Class | What you build | Run with |
|-------|----------------|----------|
| `Circle`, `Rectangle` (extend abstract `Shape`) | Implement the required `area()`; inherit `describe()` | `./mvnw test -Dtest="day10.ShapeTest"` |
| `Contractor`, `SalariedEmployee`, `Payroll` | Implement the `Payable` interface; total pay over a mixed array | `./mvnw test -Dtest="day10.PayableTest"` |
| `EmailNotifier`, `SMSNotifier`, `PushNotifier`, `AlertService` | Implement the `Notifier` interface; broadcast to all | `./mvnw test -Dtest="day10.NotifierTest"` |
| `StudentV3` | Override `toString()` from `Object` | `./mvnw test -Dtest="day10.StudentV3Test"` |

### Notes that matter
- **`Shape` is now abstract** — the fix for yesterday's design smell. Instead of a fake `area()` returning `0.0`, `Shape` *declares* `public abstract double area();` with no body and lets each subclass fill it in. `Shape` still ships a concrete `describe()` that calls `area()` — proof that abstract classes can mix "you must implement this" with "here's shared code for free."
- **`Payable` and `Notifier` are interfaces** — pure contracts, PROVIDED. Your classes say `implements Payable` / `implements Notifier` and supply the method bodies. `Payroll.totalPay` and `AlertService.alertAll` work over the *interface* type, so they don't care which concrete class each element is.
- **This is the Spring pattern.** When you code against `Notifier` and let a concrete `EmailNotifier` be plugged in, you're doing by hand exactly what Spring's dependency injection will do for you automatically later. Same dispatch mechanism, same benefit: swap implementations without touching the caller.
- **`StudentV3.toString()`** — every class inherits `toString()` from `Object`, and the default is unreadable. Override it and `System.out.println(student)` prints your version automatically. Match the format exactly: `Student{name=Asha, rollNo=12}`.

## Break it on purpose
- Remove `area()` from `Circle`. The compiler refuses: a concrete class must implement every abstract method it inherits. That's the guarantee `abstract` gives you.
- Add `implements Payable` to a class but leave out `calculatePay()`. Same refusal — an interface is a promise the compiler enforces.
- Delete the `@Override` `toString()` from `StudentV3` and print a student. You'll see the ugly default (`day10.StudentV3@1b6d3586`) and understand why overriding it matters.

## Log prompts
- Abstract class vs interface — your rule of thumb, plus your two examples.
- What compile error did `new Shape()` produce?
- Where have you already seen the "code against an interface, plug in an implementation" idea? Where might Spring use it?

## Definition of done
`./mvnw test -Dtest="day10.*"` is all green, both warm-ups are done (abstract-vs-interface note + pasted `new Shape()` error), and your log is updated.
