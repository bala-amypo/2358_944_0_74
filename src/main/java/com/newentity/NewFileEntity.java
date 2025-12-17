package com.example.demo.newentity;

import jakarta.persistence.Id;
import jakarta.validation. constraints.NotBlank;

public class NewfileEntity{
@Id
private Long id;
@NotBlank
private String name;
private String email;
}