package com.finanzas.trabajofinal.entities;

import com.finanzas.trabajofinal.util.PeriodoPago;
import com.finanzas.trabajofinal.util.TipoTasaCupon;
import com.finanzas.trabajofinal.util.TipoVencimiento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name="Bono")
public class Bono {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="valor_nominal",nullable = false)
    private Long valorNominal;
    @Column(name="tasa_cupon",nullable = false)
    private Long tasaCupon;
    @Column(name="tipo_tasa_cupon",nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoTasaCupon tipoTasaCupon;
    @Column(name="periodo_pago",nullable = false)
    @Enumerated(EnumType.STRING)
    private PeriodoPago periodoPago;
    @Column(name="vencimiento",nullable = false)
    private Integer vencimiento;
    @Column(name="tipo_vencimiento",nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoVencimiento tipoVencimiento;

}
