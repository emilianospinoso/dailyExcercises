package func01;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Clase05 {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Yair", Gender.Masculine),
                new Person("Dai", Gender.Femenine),
                new Person("luzr", Gender.Masculine),
                new Person("Emir", Gender.Femenine)
        );
        Predicate<Person> predicate = x -> Gender.Femenine.equals(x.gender);
        System.out.println("PRINT ALL WOMEN");
        people.stream().filter(predicate)
                .collect(Collectors.toList()).forEach(System.out::println);

    }

    static class Person {
        final String name;
        final Gender gender;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }

    enum Gender {
        Masculine, Femenine;
    }
}
