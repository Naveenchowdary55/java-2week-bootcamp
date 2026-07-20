# Day 09 — Inheritance and Polymorphism

## Today's goal
Let classes build on other classes. You'll use `extends` to inherit, `super` to reach the parent, `@Override` to replace a parent method, and you'll see **polymorphism** in action: one reference type, many runtime behaviors, chosen automatically at run time (dynamic method dispatch).

## Watch
Video topics for today: `extends`, `super`, method overriding, compile-time vs runtime polymorphism, dynamic method dispatch.

## Warm-up (not tested)
In a scratch file, write:
```java
Vehicle v = new Car();
System.out.println(v.describe());
```
Before running it, write down in your log which version of `describe()` you think runs — the `Vehicle` one or the `Car` one — and **why**. Then run it and check.

Next, try calling a `Car`-only method (add one, e.g. `openSunroof()`) through the `Vehicle` reference: `v.openSunroof();`. It won't compile. Paste the exact compile error into your log and explain it: the *reference type* (`Vehicle`) decides what methods you're allowed to call; the *object type* (`Car`) decides which version actually runs.

## Exercises (tested)

| Class | What you build | Run with |
|-------|----------------|----------|
| `Car`, `Bike`, `Truck`, `Garage` | Override `describe()`; `Garage.describeAll` over a mixed array | `./mvnw test -Dtest="day09.VehicleTest"` |
| `Circle`, `Rectangle`, `Triangle`, `ShapeUtils` | Override `area()`; `ShapeUtils.totalArea` over a mixed array | `./mvnw test -Dtest="day09.ShapeTest"` |
| `SavingsAccount`, `CurrentAccount` | Extend `Account`: add interest; override withdraw for overdraft | `./mvnw test -Dtest="day09.AccountHierarchyTest"` |

### Notes that matter
- **`Vehicle` and `Shape` and `Account` are PROVIDED** — read them, don't change them. You only write the subclasses (and the small utility classes).
- **`describeAll` / `totalArea`** take a `Vehicle[]` / `Shape[]`. Inside the loop you call `describe()` / `area()` on each element and Java automatically runs the correct subclass version. That's the whole magic of polymorphism: your loop doesn't need to know or care which concrete type each element is.
- **`super(...)`** — `Account` has no no-argument constructor, so each subclass constructor's first statement must be `super(openingBalance)`. That runs the parent's setup (including its negative-balance check) before your own.
- **`CurrentAccount.withdraw`** overrides the parent. The balance may go as low as `-overdraftLimit`. A withdrawal that would go past that fails with no change. Deposit is inherited unchanged.
- **`Shape.area()` returning 0.0 is a deliberate design smell.** A generic shape has no real area. Tomorrow you'll fix it by making `Shape` `abstract` so it can *require* every subclass to define `area()` without faking a value itself.

## Break it on purpose
- In `Car`, misspell the overriding method (`descrbe`) but keep `@Override`. The compiler will reject it — that's exactly what `@Override` is for: it catches overrides that don't actually match a parent method.
- Remove `@Override` and misspell it again — now it compiles as a brand-new method, and `v.describe()` silently runs the *old* `Vehicle` version. Notice how `@Override` would have saved you.
- In `CurrentAccount`, delete the overridden `withdraw`. It now inherits the strict parent version and can't overdraw at all — watch the overdraft test fail.

## Log prompts
- Which `describe()` ran through the `Vehicle` reference, and why? (Reference type vs object type.)
- What compile error did you get calling a `Car`-only method through a `Vehicle` reference?
- Why does `super(...)` have to be the first line of a subclass constructor?

## Definition of done
`./mvnw test -Dtest="day09.*Test"` is all green, both warm-ups are done (predictions + pasted compile error), and your log is updated.
