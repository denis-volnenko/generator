package ru.volnenko.generator.server.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public final class PersonDto {

    @NonNull
    private String firstName = "";

    @NonNull
    private String lastName = "";

    @NonNull
    private String middleName = "";

}
