package exercicios;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro entre 0 e 10: ");
        int num = input.nextInt();
        int res = 1;

        if (num > 10 || num < 0) {
            System.out.print("Número inválido.");
        } else {
            for (int i = 1; i <= num; i++) {
                res = res * i;
            }
            System.out.printf("O fatorial de %d é %d.", num, res);
        }
    }
}
