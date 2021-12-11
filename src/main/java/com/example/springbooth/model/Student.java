package com.example.springbootthymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name="FIRSTNAME")
    @NotEmpty
    private String firstName;
    @Column(name="LASTNAME")
    @NotEmpty
    private String lastName;
    @Column(name = "AGE")
    @Min(18)
    private int age;
    @Column(name = "COURSE")
    @NotEmpty
    private String course;

}
