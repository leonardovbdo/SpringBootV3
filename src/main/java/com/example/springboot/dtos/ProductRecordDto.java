package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

// Os parametros tem que ter os atributos da classe da entidade
public record ProductRecordDto(@NotBlank String productName, @NotNull BigDecimal productValue) {
}