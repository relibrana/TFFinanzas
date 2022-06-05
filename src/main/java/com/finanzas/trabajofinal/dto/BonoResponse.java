package com.finanzas.trabajofinal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BonoResponse {
    private Long id;
    private Long valorNominal;
    private Long tasaCupon;
    private String periodoPago;
    private Integer vencimiento;
}
