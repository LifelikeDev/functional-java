package functionalInterfaces;

import java.util.function.Predicate;

public class Predicates {
    // takes a single argument and returns a boolean

    public static void main(String[] args) {

        boolean phoneNumberOne = isPhoneNumberValid("+2335535562");
        boolean phoneNumberTwo = isPhoneNumberValid("+233276781212");

        System.out.println("// Conventional method");
        System.out.println(phoneNumberOne);
        System.out.println(phoneNumberTwo);
        System.out.println("// Using predicate");
        System.out.println(validatePhoneNumber.test("+2335535562"));
        System.out.println(validatePhoneNumber.test("+233276781212"));
    }

    // Using Predicate
    static Predicate<String> validatePhoneNumber = phoneNumber -> isPhoneNumberValid(phoneNumber);

    // illustration: the traditional procedure
    private static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+233") && phoneNumber.length() == 11;
    }

}
