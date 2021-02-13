package week_10;
//java homework#5

class Counter {

    private int count = 0;

    public void increment() {
        count++;
    }

    public int getValue() {
        return count;
    }
}

public class TestCounter {

    public static void main(String[] args) {
        Counter headCount, tailCount;
        tailCount = new Counter();
        headCount = new Counter();

        for (int flip = 0; flip < 100; flip++) {
            if (Math.random() < 0.5) {
                headCount.increment();
            } else {
                tailCount.increment();
            }
        }

        System.out.println("There were " + headCount.getValue() + " heads.");
        System.out.println("There were " + tailCount.getValue() + " tails.");
    }
}
