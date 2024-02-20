package main.com.effectivejava.item6.boxing;

public class MathSum {

    private static long sum() {
        Long sum = 0L;
        for(long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        sum();
    }
}
