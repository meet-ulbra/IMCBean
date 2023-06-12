package br.ulbra.imcbean;

import java.io.Serializable;
import java.text.DecimalFormat;

public class CalculadoraIMC implements Serializable {

    private double peso;
    private double altura;

    public CalculadoraIMC() {
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String calcularIMC() {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(this.peso / (this.altura * this.altura));
    }
}
