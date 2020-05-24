package ru.volnenko.generator.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public final class Person {

    private String id = UUID.randomUUID().toString();

    private String firstName;

    private String lastName;

    private Gender gender;

}
