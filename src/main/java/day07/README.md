# Day 07 — WEEK 1 PROJECT: Student Record Manager

## Today's goal
Put the whole week together into one program you built yourself, from a blank
file. No stubs, no tests handed to you — just a spec and your own judgement. This
is the day the pieces (arrays, Strings, loops, methods, classes, objects) stop
being separate exercises and become *a thing that works*.

## What you're building
A menu-driven console app that manages student records. It runs in a loop,
printing a menu and doing what the user asks until they choose Exit:

```
=== Student Record Manager ===
1. Add student
2. View all students
3. Search by roll number
4. Show topper
5. Class average
6. Exit
Enter choice:
```

## Where to build it
- Everything goes in package `day07`. Start from a **blank file**:
  `src/main/java/day07/StudentRecordManager.java` with a `public static void
  main(String[] args)`.
- You'll want a `Student` type. **Write it fresh** — don't import day06. You can
  reuse the *ideas* from `day06.Student` (name, roll number, marks, an average),
  but type it out again from memory. That rewrite is where the learning is. Put it
  in its own file (`src/main/java/day07/Student.java`) or make it a small class in
  the same file — your call.
- Read input with a `Scanner`:  `Scanner sc = new Scanner(System.in);`

## Requirements
### Storage
- Keep students in a **fixed-size array of 50**: `Student[] students = new
  Student[50];` plus an `int count` for how many slots are actually filled.
- When the array is full, adding another must print a clear message, not crash.

### Menu actions — each one is its OWN method
Give every action its own method (e.g. `addStudent(...)`, `viewAll(...)`,
`searchByRoll(...)`, `showTopper(...)`, `classAverage(...)`). `main` should mostly
be the loop that reads a choice and calls the right method. If a method is getting
long, that's a hint to split it further.

1. **Add student** — ask for name, roll number, and marks; store a new `Student`.
2. **View all** — print every student added so far (handle "none yet" gracefully).
3. **Search by roll number** — find and print the matching student, or report
   "not found".
4. **Show topper** — the student with the highest average. Say so if there are no
   students.
5. **Class average** — the average of all students' averages. Handle "no students
   yet" without dividing by zero.
6. **Exit** — leave the loop and print a goodbye.

### Input validation (this is most of the grade)
- **Reject negative marks.** Re-ask or refuse; never store them.
- **Reject duplicate roll numbers.** Two students must not share a roll number.
- **Bad menu choices must not crash the program.** Typing `9`, or `banana`, or
  just hitting Enter, should print "invalid choice" and show the menu again.
- Typing letters where a number is expected must not blow up with an ugly stack
  trace. (Look into checking input before you trust it — e.g. `sc.hasNextInt()` —
  and clearing bad input so you don't loop forever.)

## Definition of done
- A stranger can sit down, use every menu item, and **cannot crash it** no matter
  what they type.
- You can explain **every single line** you wrote without looking anything up.
- The program handles the empty cases (no students yet) and the full case (51st
  student) without exploding.

## Self-check questions (write answers in your LOG.md)
1. `public static void main(String[] args)` — explain **each word**: what does
   `public` mean, what does `static` mean, why `void`, what is `String[] args`?
2. When comparing two Strings for equality (like matching a name), why do you use
   `.equals()` instead of `==`? What does each one actually compare?
3. Walk through what happens in memory when you run `Student s = new
   Student(...)`. What sits on the stack, what sits on the heap, and what does `s`
   hold?

## How the mentor will review this
They will:
1. Run your program and use every menu item normally.
2. Then **type garbage at every prompt** — letters for numbers, negative marks,
   a duplicate roll number, an empty line, a menu choice like `99`. It must not
   crash.
3. Then ask you the three self-check questions above and expect a confident answer
   in your own words.

Build it so all three of those go well. Good luck — you've earned this one.
