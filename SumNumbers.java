package Algorithm.stream;

import java.util.stream.IntStream;

public class SumNumbers {

    public static void main(String[] args) {
        System.out.printf("Sum of 1 to 10: %d%n" ,
                IntStream.rangeClosed(1, 10). sum());

        System.out.printf("Sum of 1 to 9: %d" ,
                IntStream.range(1, 10). sum());
    }
}
