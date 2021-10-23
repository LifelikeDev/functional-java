package functionalInterfaces;

import java.util.List;

public class ABitOnStreams {

    public static void main(String[] args) {
        List<String> names = List.of("Jones", "Pete", "Mariam", "Anne", "Charles");

        names.stream().forEach(name -> System.out.println(name));
    }

}
