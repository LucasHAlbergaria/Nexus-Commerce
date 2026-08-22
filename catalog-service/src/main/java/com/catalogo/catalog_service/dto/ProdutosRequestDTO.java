package com.catalogo.catalog_service.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record ProdutosRequestDTO(
        @NotNull(message = "O título deve ser informado.")
        String name,

        @NotNull(message = "O preço deve ser informado.")
        @Positive(message = "O preço deve ser positivo.")
        Double price,

        @NotNull(message = "A categoria deve ser informada.")
        String category,

        @NotNull(message = "A quantidade em estoque deve ser informada.")
        @Positive(message = "O estoque deve ser maior que zero.")
        Integer stock
)
{
}