package com.entrega_final.java_backend.repository;

import com.entrega_final.java_backend.model.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarritoRepository extends JpaRepository<Carrito, Long> {
}
