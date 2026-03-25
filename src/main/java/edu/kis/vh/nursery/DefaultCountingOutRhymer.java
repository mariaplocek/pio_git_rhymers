package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUMBERS_MAX_SIZE = 12;
    private static final int TOTAL_INITIAL_VALUE = -1;
    private static final int DEFAULT_RETURN_VALUE = -1;
    private final int[] NUMBERS = new int[NUMBERS_MAX_SIZE];

    public int total = TOTAL_INITIAL_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_RETURN_VALUE;
    }

    public boolean isFull() {
        return total == NUMBERS_MAX_SIZE -1;
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
