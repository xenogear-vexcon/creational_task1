package org.example;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String city;

    public PersonBuilder setName(String name) {
        if (name.equals("")) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        } else {
            this.name = name;
            return this;
        }
    }

    public PersonBuilder setSurname(String surname) {
        if (surname.equals("")) {
            throw new IllegalArgumentException("Фамилия не может быть пустой");
        } else {
            this.surname = surname;
            return this;
        }
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        } else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String address) {
        if (address.equals("")) {
            throw new IllegalArgumentException("Адрес не может быть пустым");
        } else {
            this.city = address;
            return this;
        }
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Фамилия и имя не могут быть пустыми");
        } else {
            Person person = new Person(name, surname, age);
            person.setAddress(city);
            return person;
        }
    }
}
