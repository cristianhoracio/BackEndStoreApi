package com.entrega_final.java_backend.repository;

import com.entrega_final.java_backend.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
