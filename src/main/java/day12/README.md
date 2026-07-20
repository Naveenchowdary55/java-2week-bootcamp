# Day 12 — Collections: ArrayList, HashMap, and friends

## Today's goal
Retire the raw array. After today you should reach for `ArrayList` when you need
an ordered, growable list, `HashMap` when you need fast key → value lookup, and a
`Set` when you need uniqueness — and you should be able to say *why* for each.

## Watch
Collections overview, `ArrayList`, `LinkedList` (concept only), `HashSet`,
`HashMap`, iteration, `Comparator`/`Comparable`, generics, wrapper classes and
autoboxing.

One idea that trips everyone: collections hold **objects**, not primitives. So a
list of numbers is `List<Integer>`, not `List<int>`. Java quietly boxes `int` →
`Integer` and back for you ("autoboxing") — convenient, but remember it is
happening.

## Warm-up (not tested)
Go back to your **Day 7 Student Record Manager** and rip out the array that
stored the students — replace it with an `ArrayList<...>`. Watch the manual
"track the count / grow the array / shift on delete" code simply vanish. Feel how
much smaller the class gets. That feeling is the whole reason collections exist.

## Exercises (tested)
`StudentRecord` is **PROVIDED complete** (immutable name + marks) — you store and
sort these; don't change it.

| Class | What you build | Run with |
|---|---|---|
| `WordFrequency` | `count(text)` → a `Map` of word → count | `./mvnw test -Dtest="day12.WordFrequencyTest"` |
| `Dedup` | `removeDuplicates(list)` keeping first-seen order | `./mvnw test -Dtest="day12.DedupTest"` |
| `PhoneBook` | a `HashMap`-backed name → number book | `./mvnw test -Dtest="day12.PhoneBookTest"` |
| `StudentSorter` | sort students by marks, highest first, with a `Comparator` | `./mvnw test -Dtest="day12.StudentSorterTest"` |

Notice the design rule showing up in two exercises: methods return **new**
collections and leave their inputs untouched. A method that silently mutates the
list you passed it is a classic source of bugs.

## Break it on purpose
- In `Dedup`, swap `LinkedHashSet` for a plain `HashSet`. The duplicates still
  vanish, but the order scrambles and the test fails. That one swap is the entire
  difference between the two Set types.
- In `PhoneBook.add`, delete the `containsKey` guard and just `put`. Now adding
  an existing name overwrites the old number. Watch that test go red and read
  what it was protecting.
- In `StudentSorter`, sort the input list directly instead of a copy. The
  "does not modify input" test fails — proof that `sort` mutates in place.
- In `WordFrequency`, split on `" "` (a single space) instead of `[^a-z]+`. Feed
  it `"dog."` and print the result — the period sticks to `"dog"`. See why the
  character class matters.

## Log prompts
- Looking up a value in an `ArrayList` means scanning it item by item; in a
  `HashMap` it is (roughly) instant. Write down, in your own words, why — and
  what that means for the `PhoneBook`.
- Where did autoboxing happen in today's code without you writing anything?
- `Comparator.comparingInt(...).reversed()` — what does `.reversed()` flip, and
  what would you change to sort ascending?

## Definition of done
`./mvnw test -Dtest="day12.*Test"` all green, the Day 7 array → `ArrayList` warm-up
done, and `LOG.md` updated with the lookup-cost note.
