package BasicStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class a04RemoveDuplicateObjectsinLIst {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("emi", 30));
        people.add(new Person("agus", 34));
        people.add(new Person("emi", 30));

        List<Person> uniqpeople = new ArrayList<>();
        uniqpeople= people.stream().distinct().collect(Collectors.toList());
        uniqpeople.forEach(System.out::println);

    }

}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
