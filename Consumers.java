package functionalInterfaces;

import java.util.function.Consumer;

public class Consumers {

    // represents an operation that takes in a single input argument
    // and returns no result

    public static void main(String[] args) {

        Consumer<Patron> patronConsumer = patron -> welcomeCustomer(patron);

        patronConsumer.accept(new Patron("Leah", "Wales"));
        patronConsumer.accept(new Patron("Unugukwara", "Nigeria"));

    }

    static void welcomeCustomer(Patron patron) {
        System.out.println("Welcome " + patron.name + " of " + patron.country + "!");
    }

    static class Patron {
        private final String name;
        private final String country;


        public Patron(String name, String country) {
            this.name = name;
            this.country = country;
        }
    }
}
