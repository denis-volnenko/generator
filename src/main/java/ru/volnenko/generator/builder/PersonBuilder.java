package ru.volnenko.generator.builder;

import ru.volnenko.generator.model.Gender;
import ru.volnenko.generator.model.Person;

public final class PersonBuilder {

    private Person person = new Person();

    public PersonBuilder withPerson(Person person) {
        this.person = person;
        return this;
    }

    public PersonBuilder male() {
        person.setGender(Gender.MALE);
        return this;
    }

    public PersonBuilder female() {
        person.setGender(Gender.FEMALE);
        return this;
    }

    public PersonBuilder withFirstName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    public PersonBuilder withLastName(String lastName) {
        person.setLastName(lastName);
        return this;
    }

    public Person getPerson() {
        return person;
    }

}
