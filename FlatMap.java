package Algorithm.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        List<String> list = List.of(
                "AAA", "BBB", "CCC", "DDD", "QWERTY"
        );
        System.out.println(Arrays.toString(list.stream()
                .flatMap(s -> Stream.of(s.split(""))).toList()
                .toArray()));
//                .forEach(System.out:: print);
    }
}
