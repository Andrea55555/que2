import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Comparator;

/**
 * создал класс.
 */
public final class Test {
    /**
     * задал константу.
     */
    static final double GRAVITATIONAL_CONSTANT = 56;
    /**
     * задал константу.
     */
    static final double GRAVITATIONAL_CONSTANT2 = 67;
    /**
     * задал константу.
     */
    static final double GRAVITATIONAL_CONSTANT3 = 12;
    /**
     * задал константу.
     */
    static final double GRAVITATIONAL_CONSTANT4 = 35;
    /**
     * задал константу.
     */
    static final double GRAVITATIONAL_CONSTANT5 = 84;
    /**
     * задал константу.
     */
    static final double GRAVITATIONAL_CONSTANT6 = 36;
    /**
     * задал константу.
     */
    static final double GRAVITATIONAL_CONSTANT7 = 33;
    /**
     * задал константу.
     */
    static final double GRAVITATIONAL_CONSTANT8 = 71;
    /**
     * задал константу.
     */
    static final double OLD_AGE = 65;
    /**
     * задал возвраст пенсии.
     */

    static class AgeComparator implements Comparator<Integer> {
        @Override
        public int compare(final Integer o1, final Integer o2) {
            if (o2 >= OLD_AGE) {
                return 1;
            }
            return 0;
        }
    }
    /**
     * @args id
     */
    public static void main(final String[] args) {
        PriorityQueue<Integer> myPriorityQueue =
                new PriorityQueue<>(new AgeComparator());
        myPriorityQueue.add((int) GRAVITATIONAL_CONSTANT);
        myPriorityQueue.add((int) GRAVITATIONAL_CONSTANT2);
        myPriorityQueue.add((int) GRAVITATIONAL_CONSTANT3);
        myPriorityQueue.add((int) GRAVITATIONAL_CONSTANT4);
        myPriorityQueue.add((int) GRAVITATIONAL_CONSTANT5);
        myPriorityQueue.add((int) GRAVITATIONAL_CONSTANT6);
        myPriorityQueue.add((int) GRAVITATIONAL_CONSTANT7);
        myPriorityQueue.add((int) GRAVITATIONAL_CONSTANT8);
        System.out.println(myPriorityQueue.poll());
        System.out.println(myPriorityQueue.poll());
        Iterator iterator = myPriorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

