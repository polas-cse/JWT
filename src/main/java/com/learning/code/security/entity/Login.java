package com.learning.code.security.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
    @Id
    private Long id;
    private String username;
    private String password;
}
