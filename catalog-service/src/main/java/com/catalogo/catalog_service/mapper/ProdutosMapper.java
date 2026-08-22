package com.catalogo.catalog_service.mapper;

import com.catalogo.catalog_service.dto.ProdutosRequestDTO;
import com.catalogo.catalog_service.models.Produtos;
import org.springframework.stereotype.Component;

@Component
public class ProdutosMapper {

    public Produtos createProduto(ProdutosRequestDTO produtosRequestDTO)
    {
       return new Produtos(
               produtosRequestDTO.name(),
               produtosRequestDTO.price(),
               produtosRequestDTO.category(),
               produtosRequestDTO.stock()
       );
    }

    public Produtos updateProdutos(ProdutosRequestDTO produtosRequestDTO)
    {

    }
}
