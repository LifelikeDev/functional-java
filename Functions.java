package functionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Functions {

    public static void main(String[] args) {

        int normalResult = multiplyByTwoMethod(2);
        System.out.println("// using methods");
        System.out.println(normalResult);

        int functionResult = multiplyByTwoFunction.apply(2);
        System.out.println("// using functions");
        System.out.println(functionResult);

        double biFunctionResult = performBasicMath.apply(multiplyByTwoFunction, 7);
        System.out.println("// using bi-functions");
        System.out.println(biFunctionResult);

    }

    // using functions
    static private Function<Integer, Integer> multiplyByTwoFunction = num -> num * 2;

    // using bi-functions
    static private BiFunction<Function<Integer, Integer>, Integer, Double> performBasicMath
            = (function, num) -> (double) function.apply(num) / num * num;

    // using methods
    static private int multiplyByTwoMethod(int num) {
        return (num * 2);
    }
}
