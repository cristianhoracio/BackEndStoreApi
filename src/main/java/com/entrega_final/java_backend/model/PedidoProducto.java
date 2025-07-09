package com.entrega_final.java_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "pedido_producto")
@Data
public class PedidoProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pedido_id")
    private Long pedidoId;

    @Column(name = "producto_id")
    private Long productoId;

    private Integer cantidad;
    private Double subtotal;
}
