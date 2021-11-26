package exercicios;

import java.util.Scanner;

public class Ex5 {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numRandom = getRandomNumber(1, 5);
        System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando: ");
        int numero = input.nextInt();
        if (numero < 1 || numero > 5) {
            System.out.println("Número inválido.");
        } else if (numero == numRandom) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você errou; o número correto era "+numRandom+".");
        }
    }
}
