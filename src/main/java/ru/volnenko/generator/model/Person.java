package ru.volnenko.generator.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public final class Person {

    private String firstName;

    private String lastName;

    private Gender gender;

}
