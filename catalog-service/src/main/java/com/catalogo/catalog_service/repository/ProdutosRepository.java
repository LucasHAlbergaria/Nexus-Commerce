package com.catalogo.catalog_service.repository;

import com.catalogo.catalog_service.models.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
}
