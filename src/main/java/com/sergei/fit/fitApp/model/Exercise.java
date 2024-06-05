package com.sergei.fit.fitApp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "exercises")
public class Exercise {
    @Id
    private String Id;

    private String name;
    private String description;
    private String muscleGroup;



}
