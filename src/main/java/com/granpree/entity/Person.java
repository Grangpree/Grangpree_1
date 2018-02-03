package com.granpree.entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter(AccessLevel.PRIVATE)
    private Long id;

    @Column
    @Getter
    @Setter(AccessLevel.PRIVATE)
    private String firstName;

    @Column
    @Getter
    @Setter(AccessLevel.PRIVATE)
    private String surName;

    public Person() {
    }

    public Person(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }
}
