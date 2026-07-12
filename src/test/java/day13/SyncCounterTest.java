package day13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SyncCounterTest {

    @Test
    void twoThreadsEachIncrementingTenThousandTimesGivesTwentyThousand() throws InterruptedException {
        SyncCounter counter = new SyncCounter();

        Runnable job = () -> {
            for (int i = 0; i < 10_000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(job);
        Thread t2 = new Thread(job);
        t1.start();
        t2.start();
        t1.join(); // wait for both threads to finish before we check the count
        t2.join();

        assertEquals(20_000, counter.getCount(),
                "if this fails intermittently, your increment() isn't synchronized "
                        + "— that's a race condition, exactly what today is about");
    }

    @Test
    void singleThreadCountsCorrectly() {
        SyncCounter counter = new SyncCounter();
        for (int i = 0; i < 5; i++) {
            counter.increment();
        }
        assertEquals(5, counter.getCount(), "five increments on one thread → 5");
    }

    @Test
    void startsAtZero() {
        assertEquals(0, new SyncCounter().getCount(), "a brand-new counter reads 0");
    }
}
