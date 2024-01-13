package functionalProgramming01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class clase01 {

    public static void main(String[] args) {

        //Print only females with funcional programming
        List<Person> people = List.of(
                new Person("Emiliano", Gender.MALE),
                new Person("Santiago", Gender.MALE),
                new Person("Agustina", Gender.FEMALE),
                new Person("Marcela", Gender.FEMALE),
                new Person("Rodrigo", Gender.MALE)
        );
        //Create array only with females.
        List<Person> females = people.stream().filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());

        //Print the females.
        females.forEach(System.out::println);

    }

    static class Person {
        final String name;
        final Gender gender;

        public String getName() {
            return name;
        }

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }


        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE;
    }
}



