package io.javabrains.javacollections;

/*
Generate a Person class with the member variables firstName, lastName, age, lastModifiedDate.
Generate equals and hashcode methods using member variables firstName, lastName, age
Compare two instances of Person that have the same data
*/

import java.util.Date;
import java.util.Objects;

public class EqualsAndHashCode {

    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 30, new Date());
        Person person2 = new Person("John", "Doe", 30, new Date());

        // Compare two instances of Person
        if (person1.equals(person2)) {
            System.out.println("person1 is equal to person2");
        } else {
            System.out.println("person1 is not equal to person2");
        }

        // Print hash codes
        System.out.println("Hash code of person1: " + person1.hashCode());
        System.out.println("Hash code of person2: " + person2.hashCode());

    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Date  lastModifiedDate;

    public Person(String firstName, String lastName, int age, Date lastModifiedDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        if (!(obj instanceof Person)) return false;
        Person person = (Person) obj;
        return this.age == person.age
                && Objects.equals(this.firstName, person.firstName)
                && Objects.equals(this.lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
           /* int result = firstName.hashCode();
            result = 31 * result + lastName.hashCode();
            result = 31 * result + age;
            return result;*/
    }
}
