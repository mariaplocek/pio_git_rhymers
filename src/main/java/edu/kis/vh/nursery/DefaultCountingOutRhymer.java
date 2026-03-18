package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_SIZE = 12;
    public static final int TOTAL_INITIAL_VALUE = -1;
    private final int[] NUMBERS = new int[NUMBERS_SIZE];

    public int total = TOTAL_INITIAL_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL_INITIAL_VALUE;
    }

    public boolean isFull() {
        return total == NUMBERS_SIZE-1;
    }

    protected int peek() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}
