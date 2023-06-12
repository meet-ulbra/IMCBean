package br.ulbra.imcbean;

/**
 *
 * @author André Oliveira
 */
public class Main {

    public static void main(String[] args) {
        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
        calculadoraIMC.setPeso(70);  // em kg
        calculadoraIMC.setAltura(1.75);  // em metros
        System.out.println("O IMC é: " + calculadoraIMC.calcularIMC());
    }
}
