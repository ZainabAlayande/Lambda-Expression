package Algorithm.stream;

import java.util.stream.IntStream;

public class DoubleElement {
    public static void main(String[] args) {
        System.out.printf("Sum of Even number from 1 through 20 = %d%n ",
                IntStream.rangeClosed(1, 10)
                        .map((int x)  -> {return x * 2;})
                        .sum());
    }
}
