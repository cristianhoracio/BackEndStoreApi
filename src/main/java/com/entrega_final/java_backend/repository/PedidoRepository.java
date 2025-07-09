package com.entrega_final.java_backend.repository;

import com.entrega_final.java_backend.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
