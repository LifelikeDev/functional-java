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

        System.out.println(nameRecord);

        // for each method
//        names.stream().forEach(name -> System.out.println(name));
        names.stream().forEach(System.out::println);
    }

}
