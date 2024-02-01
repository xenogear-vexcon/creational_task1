package org.example;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        return city;
    }

    public void happyBirthday() {
        if (hasAge()) {
            this.age += 1;
        }
    }

    public boolean hasAge() {
        return age != 0;
    }

    public boolean hasAddress() {
        return city != null;
    }

    public void setAddress(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name).append(" ").append(surname).append(", возраст: ").append(age).append(", город: ").append(city);
        return builder.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, city);
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder builder = new PersonBuilder().setSurname(surname).setAddress(city);
        return builder;
    }
}
