package imperative;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Jorge", Gender.MALE),
            new Person("Mario", Gender.MALE),
            new Person("Isabel", Gender.FEMALE),
            new Person("Claudia", Gender.FEMALE),
            new Person("Victor", Gender.MALE)
        );

        //print women

        //Imperative aproach
        List<Person> females = new ArrayList<>();
        for ( Person p : people ) {
            if ( Gender.FEMALE.equals(p.gender) ) {
                females.add(p);
            }
        }

        for( Person female: females ){
            System.out.println(female);
        }

        System.out.println("Declarative");

        //Declarative aproach

        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);
        people.stream()
                .filter(personPredicate)
                .forEach(System.out::println);
        
    }

    static class Person {
        private final String name;
        private final Gender gender;

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
        MALE, FEMALE
    }

}
