# Day 14 — FINAL PROJECT: Library Management System

No new video. No stubs, no tests, no hand-holding. You build this from a **blank
file** in package `day14`, and then you defend it out loud at the viva. This is
the day everything from Week 2 comes together — constructors, encapsulation,
inheritance, polymorphism, interfaces, collections, exceptions, and a menu loop
that reads user input safely.

The bar is not "it compiles." The bar is: **a stranger can sit down, use the menu,
and not be able to crash it — and you can explain every design choice you made.**

## What you are building
A console Library Management System. A librarian runs it from a text menu: add
books, register members, issue and return books, search, and list what is out on
loan. Everything lives in memory (no database, no files) — the point is the OOP,
not persistence.

## Required classes (minimum)
Design these yourself. Signatures are up to you — that is part of the exercise.

- **`Book`** — id, title, author, and whether it is currently available. Private
  fields, validated setters, a sensible `toString()`.
- **`Member`** — an **abstract** base class: id, name, the list of books they
  currently hold, and an abstract method for their borrowing limit (see below).
- **`StudentMember extends Member`** — borrowing limit **2** books.
- **`FacultyMember extends Member`** — borrowing limit **5** books.
- **`Library`** — the engine. Holds the collections and all the operations. This
  is where issue/return/search logic lives.
- A **menu / main class** (e.g. `LibraryApp`) — the text menu loop that reads
  input and calls `Library`.

## Required concepts — each must appear because it *belongs*, not to tick a box
- **Inheritance + polymorphism.** `Member` is abstract with an abstract
  `int getBorrowingLimit()`; `StudentMember` returns 2, `FacultyMember` returns 5.
  When `Library` checks "is this member at their limit?", it calls
  `member.getBorrowingLimit()` without knowing or caring which subclass it is —
  **that call is your runtime polymorphism.** Be ready to point at that exact line
  in the viva.
- **At least one interface.** For example `FineCalculator` with
  `double calculateFine(int daysLate)`, implemented differently per member type
  (students fined less than faculty), or a `Searchable` interface on `Library`.
  Pick one that earns its place.
- **Encapsulation everywhere.** Every field `private`. No field is reachable or
  mutable except through a method that validates the change (a title cannot be
  blank; an id cannot be negative). If a field can be set to garbage, you have not
  finished.
- **Collections.**
  - Books → `ArrayList<Book>` (you iterate and scan them).
  - Members → `HashMap<Integer, Member>` keyed by member id (you look them up by
    id constantly — that is exactly what a Map is for).
  Be ready to explain in the viva *why* each container, and the lookup cost of
  each.
- **Custom exceptions.** At least these two:
  - `BookNotAvailableException` — thrown when issuing a book that does not exist
    or is already out on loan.
  - `MemberLimitExceededException` — thrown when a member already holds their
    maximum number of books.
  **You decide** whether each is checked (`extends Exception`) or unchecked
  (`extends RuntimeException`). There is a defensible answer either way — but you
  must be able to defend *yours* at the viva. (Hint: think about whether the menu
  loop can reasonably recover and re-prompt, versus whether it signals a bug.)
- **Safe input.** Every number the user types goes through a
  `SafeInput.readInt(...)`-style helper from Day 11 — never a raw `sc.nextInt()`
  that a stray letter can crash. Either `import day11.SafeInput;` and reuse it, or
  rewrite the same idea inside `day14`. Typing "banana" at the menu must re-prompt,
  not throw.

## Features the menu must support
1. **Add a book** — id, title, author; starts available.
2. **Register a member** — choose student or faculty; id and name.
3. **Issue a book** — by book id and member id. Reject (with the right custom
   exception, caught and shown as a friendly message) if the book is unavailable
   or the member is already at their limit. On success, mark the book unavailable
   and add it to the member's list.
4. **Return a book** — by book id and member id. Mark it available again and
   remove it from the member.
5. **Search by title** — print all matching books (partial match is a nice touch).
6. **List all issued books** — every book currently out, and who holds it.
7. **Exit** cleanly.

Bad menu choices, unknown ids, and non-numeric input must all be handled — the
program keeps running and re-prompts.

## Definition of done
- A stranger can drive the whole menu without crashing it. Wrong input, unknown
  ids, issuing an unavailable book, over-limit members — all handled gracefully
  with clear messages, never a raw stack trace.
- **Every OOP concept from Week 2 appears at least once — because it belongs
  there, not to tick a box.** Abstract class, subclass, overriding, an interface,
  encapsulated + validated fields, `ArrayList`, `HashMap`, and both custom
  exceptions thrown and caught somewhere real.
- The code is yours, typed from a blank file, and you can explain any line of it
  cold.

## Viva prep
This is the gate to Phase 2. You will walk through THIS code live and answer
questions about it — no browser, no notes. The seven sample questions in
[PLAN.md](../../../../PLAN.md) will be asked against your project. Do not save them
for the end: as you write each class, stop and ask yourself *"could I defend this
choice out loud right now?"* In particular, rehearse these before you show up:

1. Trace **"Issue Book"** end to end — from the `Scanner` read to the `Book`'s
   `available` flag flipping and the member's list growing. Every step.
2. Pick any private field and explain what breaks if you made it `public`.
3. Point at the **exact line** where runtime polymorphism happens
   (`member.getBorrowingLimit()` is your best candidate — know why).
4. Take the `throws` off one method and explain what the compiler does and why —
   which tells you whether that exception is checked or unchecked.
5. Why `HashMap` for members but `ArrayList` for books? State the lookup cost of
   each out loud.
6. Where did `String` vs `StringBuilder` actually matter in your code?
7. Be ready for the examiner to change one line while you watch and ask you to
   predict the output before running it.

If you can answer those without opening a browser, you are ready. Build it so you
can.
