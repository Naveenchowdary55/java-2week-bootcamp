// Day 13 warm-up — NOT tested. See src/main/java/day13/README.md
package day13;

/**
 * Warm-up exploration — no test. Today is about SEEING two things with your own
 * eyes: (1) threads run in an order nobody promised you, and (2) when two
 * threads touch the same variable without protection, you silently lose data.
 *
 * <p>You are not expected to master threads today. You are expected to be able to
 * recognise a race condition when you meet one for real, months from now.
 */
public class ThreadLab {

    public static void main(String[] args) throws InterruptedException {

        // TODO 1 — Interleaving.
        // Create two threads, "A" and "B", each printing the numbers 1..100 with
        // the thread name, e.g. System.out.println(name + " " + i);
        // Start both. Then run the whole program TWICE and compare the output —
        // the interleaving is different each run. Nobody scheduled that; the OS did.
        //
        //   Runnable job = () -> {
        //       String name = Thread.currentThread().getName();
        //       for (int i = 1; i <= 100; i++) System.out.println(name + " " + i);
        //   };
        //   Thread a = new Thread(job, "A");
        //   Thread b = new Thread(job, "B");
        //   a.start();
        //   b.start();

        // TODO 2 — start() vs run().
        // Change a.start() to a.run(). Notice the numbers no longer interleave —
        // run() just calls the method on the CURRENT thread; only start() spins up
        // a new one. Put it back to start() when you have seen it.

        // TODO 3 — A real race condition.
        // Use an UNSYNCHRONISED counter shared by two threads. PREDICT the final
        // count first (two threads × 10000 increments = ?), THEN run it and look.
        // You will almost never get 20000, because count++ is really three steps
        // (read, add, write) and the two threads trample each other.
        //
        //   int[] box = {0};                       // a mutable holder both threads share
        //   Runnable bump = () -> { for (int i = 0; i < 10000; i++) box[0]++; };
        //   Thread t1 = new Thread(bump);
        //   Thread t2 = new Thread(bump);
        //   t1.start(); t2.start();
        //   t1.join(); t2.join();                  // wait for BOTH to finish
        //   System.out.println("final count = " + box[0] + " (expected 20000)");
        //
        // Run it several times. The number changes. THIS is what SyncCounter fixes.

        System.out.println("ThreadLab: uncomment the TODOs and observe.");
    }
}
