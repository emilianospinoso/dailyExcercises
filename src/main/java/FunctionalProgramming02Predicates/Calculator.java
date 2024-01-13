package FunctionalProgramming02Predicates;

import java.util.function.Function;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("I am going to create a calculator.");

        int alCUadrado = multiPorSiMismo.apply(8);
        System.out.println(alCUadrado);

        Function<Integer, Integer> todasOperacionesJuntas = suma1.andThen(resta1.andThen(multiPorSiMismo.andThen(divididoDos)));
        System.out.println(todasOperacionesJuntas.apply(9));

    }

    static Function<Integer, Integer> suma1 = x -> x + 1;
    static Function<Integer, Integer> resta1 = x -> x - 1;
    static Function<Integer, Integer> multiPorSiMismo = x -> x * x;
    static Function<Integer, Integer> divididoDos = x -> x / 2;


}
