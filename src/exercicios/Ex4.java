package exercicios;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.print("O número é par.");
        } else {
            System.out.print("O número é ímpar.");
        }
    }
}
