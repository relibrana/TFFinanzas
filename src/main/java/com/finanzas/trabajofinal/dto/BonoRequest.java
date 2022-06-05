package com.finanzas.trabajofinal.dto;

import com.finanzas.trabajofinal.util.PeriodoPago;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BonoRequest {

    private Long id;
    private Long valorNominal;
    private Long tasaCupon;
    private String tipoTasaCupon;
    private String periodoPago;
    private Integer vencimiento;
    private String tipoVencimiento;
}
