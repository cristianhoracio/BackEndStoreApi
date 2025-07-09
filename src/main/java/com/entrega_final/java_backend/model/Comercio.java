package com.entrega_final.java_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "comercio")
@Data
public class Comercio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
}
