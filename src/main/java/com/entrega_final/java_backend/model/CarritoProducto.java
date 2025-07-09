package com.entrega_final.java_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "carrito_producto")
@Data
public class CarritoProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "carrito_id")
    private Long carritoId;

    @Column(name = "producto_id")
    private Long productoId;

    private Integer cantidad;
    private Double subtotal;
}
