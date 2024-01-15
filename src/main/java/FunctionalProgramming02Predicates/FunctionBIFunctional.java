package FunctionalProgramming02Predicates;

import java.util.function.BiFunction;

public class FunctionBIFunctional {

    public static void main(String[] args) {
        System.out.println(incrementByOneAndMultiply.apply(2, 5));
    }

    //Yoy pass a number and then add 1 to that number and then multiply for the second number passed.
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiply =
            (baseNumberToAdd, numberToMultiply) -> (baseNumberToAdd + 1) * numberToMultiply;
}
