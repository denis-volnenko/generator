package ru.volnenko.generator.builder;

import lombok.NonNull;
import ru.volnenko.generator.model.Gender;
import ru.volnenko.generator.model.Person;

public final class PersonBuilder {

    @NonNull
    private Person person = new Person();

    public PersonBuilder withPerson(@NonNull Person person) {
        this.person = person;
        return this;
    }

    @NonNull
    public PersonBuilder male() {
        person.setGender(Gender.MALE);
        return this;
    }

    @NonNull
    public PersonBuilder female() {
        person.setGender(Gender.FEMALE);
        return this;
    }

    @NonNull
    public PersonBuilder withFirstName(@NonNull String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    @NonNull
    public PersonBuilder withLastName(@NonNull String lastName) {
        person.setLastName(lastName);
        return this;
    }

    @NonNull
    public PersonBuilder withMiddleName(@NonNull String middleName) {
        person.setMiddleName(middleName);
        return this;
    }

    public Person getPerson() {
        return person;
    }

}
