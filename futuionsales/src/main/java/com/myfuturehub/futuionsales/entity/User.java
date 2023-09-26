package com.myfuturehub.futuionsales.entity;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User extends MasterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 50)
    private String userName;

    @Column(unique = true, length = 50)
    private String email;

    @Column(length = 255)
    private String password;

    @Column( length = 50)
    private String roles = "user";

    @Column(length = 1)
    private Integer loggedIn = 0;

    @Column(length = 150)
    private String firstName;

    @Column(length = 150)
    private String lastName;

    @Column(length = 15)
    private String mobile;

    @Column(length = 50)
    private String street;

    @Column(length = 50)
    private String city;

    @Column(length = 50)
    private String state;

    @Column(length = 50)
    private String country;

    @Column(length = 50)
    private String pinCode;
}

