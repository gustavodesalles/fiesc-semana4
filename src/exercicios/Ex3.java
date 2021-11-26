package exercicios;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a sua altura: ");
        double altura = entrada.nextDouble();
        System.out.print("Digite o seu peso: ");
        double peso = entrada.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("IMC: %.2f",imc);
    }
}
