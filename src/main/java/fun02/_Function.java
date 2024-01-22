package fun02;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int num= plusOne.apply(8);
        System.out.println(num);

    }

    static Function<Integer, Integer> plusOne = x -> x+=3;
}
