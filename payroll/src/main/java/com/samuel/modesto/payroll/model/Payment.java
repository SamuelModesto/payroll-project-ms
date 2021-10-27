package com.samuel.modesto.payroll.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    private String nome;
    private double valorDia;
    private int diasTrabalhados;

    public double getTotal(){
        return diasTrabalhados * valorDia;
    }
}
