package Algorithm.stream;

import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamSampleOne {

    public static void main(String[] args) {
//        List<Integer> nums = List.of(1, 2, 3, 4);
//        List<Integer> integers = IntStream
//                .rangeClosed(0, 10)
//                .boxed()
//                .toList();
//        System.out.println(integers);

        System.out.println(IntStream
                .iterate(0, i -> i < 20, x -> x + 2)
                .boxed()
                .toList()
                .stream().toList());


    }

    public static List<Integer> mapMethod(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());
    }
}
