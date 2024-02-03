package com.abhi.springkafkajson.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter

@Setter
@ToString
public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private  String address;
}
