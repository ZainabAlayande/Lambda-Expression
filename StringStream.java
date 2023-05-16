//package Algorithm.stream;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class StringStream {
//    public static void main(String[] args) {
//        List<String> names = List.of(
//                "Pauline",
//                "Zainab",
//                "Joshua",
//                "Felix",
//                "Prof",
//                "Dayo"
//        );
//
////        System.out.println(names.stream()
////                .collect(Collectors.toMap(String:: toString, String::length)));
////
////        System.out.println(names.stream().map(x -> x.length()));
////
////        System.out.println(names.stream()
////                .map(String::toUpperCase)
////                .filter(x -> x.length() <= 5)
////                .toList());
////
////        System.out.println();
////        System.out.println();
//
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Zainab", 89);
//        map.put("Folahan", 36);
//        map.put("Timilehin", 19);
//        map.put("Michael", 45);
//        map.put("All-well", 22);
//
//        map.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue())
//                .collect(Collectors.toMap(
//                        entry -> entry.getKey(),
//                        entry -> entry.getValue(),
//                                (oldValue, newValue) -> oldValue)
//                        LinkedHashMap::new));
//
//        Map<String, Integer> sortedMap = map.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue())
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue,
//                        (oldValue, newValue) -> oldValue, // keep existing value for duplicate keys
//                        LinkedHashMap::new)); // return a LinkedHashMap to maintain insertion order
//
//        System.out.println(sortedMap);
//
//        System.out.println(sortedMap);
//
//
//    }
//}
