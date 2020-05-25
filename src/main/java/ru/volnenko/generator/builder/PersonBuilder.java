package ru.volnenko.generator.builder;

import lombok.NonNull;
import ru.volnenko.generator.data.person.GeneratorGender;
import ru.volnenko.generator.error.GenderException;
import ru.volnenko.generator.model.Gender;
import ru.volnenko.generator.model.Person;

public final class PersonBuilder {

    @NonNull
    private Person person = new Person();

    public PersonBuilder withPerson(@NonNull Person person) {
        if (person == null) throw new GenderException();
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
    public PersonBuilder withFirstName() {
        return withFirstName(GeneratorGender.valueOf(person.getGender()).firstName().generate());
    }

    @NonNull
    public PersonBuilder withFirstName(@NonNull String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    @NonNull
    public PersonBuilder withLastName() {
        return withLastName(GeneratorGender.valueOf(person.getGender()).lastName().generate());
    }

    @NonNull
    public PersonBuilder withLastName(@NonNull String lastName) {
        person.setLastName(lastName);
        return this;
    }

    @NonNull
    public PersonBuilder withMiddleName() {
        return withMiddleName(GeneratorGender.valueOf(person.getGender()).middleName().generate());
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
