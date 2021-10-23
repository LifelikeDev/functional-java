package functionalInterfaces;

import java.util.List;
import java.util.stream.Collectors;

public class ABitOnStreams {

    public static void main(String[] args) {
        List<String> names = List.of("Jones", "Pete", "Mariam", "Anne", "Charles");

        // map method
        List<String> nameRecord = names.stream()
                                        .map(name -> name + " (human)")
                                        .collect(Collectors.toList());

        // any match method
        boolean findAnyMatch = names.stream().anyMatch(name -> name.equals("Pete"));

        // all match method
        boolean findAllMatch = names.stream().allMatch(name -> name.equals("Pete"));

        System.out.println(nameRecord);
        System.out.println("--------------");
        System.out.println(findAnyMatch);
        System.out.println(findAllMatch);
        System.out.println("--------------");

        // for each method
//        names.stream().forEach(name -> System.out.println(name));
        names.forEach(System.out::println);
    }

}
