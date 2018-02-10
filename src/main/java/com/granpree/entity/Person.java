package com.granpree.entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "person")
@Getter
@Setter(AccessLevel.PRIVATE)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String surName;

    public Person() {
    }

    public Person(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }
}
