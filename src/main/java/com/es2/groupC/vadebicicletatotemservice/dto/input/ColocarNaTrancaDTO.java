package com.es2.groupC.vadebicicletatotemservice.dto.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ColocarNaTrancaDTO {
    private String numeroBicicleta;
    private Integer codOperacao;
}
