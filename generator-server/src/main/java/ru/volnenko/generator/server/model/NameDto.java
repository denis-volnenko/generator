package ru.volnenko.generator.server.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NameDto {

    @NonNull
    private String name = "";

}
