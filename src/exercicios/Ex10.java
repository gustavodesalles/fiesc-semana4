package exercicios;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor inicial inteiro: ");
        int valorInicial = input.nextInt();
        System.out.print("Digite uma raiz inteira: ");
        int raiz = input.nextInt();

        System.out.print("Você deseja calcular a PA ou PG? (PA/PG)\n");
        String resposta = input.next();

        switch (resposta) {
            case "PA":
                for (int i = 0; i < 10; i++) {
                    System.out.println(valorInicial);
                    valorInicial += raiz;
                }
                break;
            case "PG":
                for (int i = 0; i < 10; i++) {
                    System.out.println(valorInicial);
                    valorInicial *= raiz;
                }
                break;
            default:
                System.out.print("Resposta inválida.\n");
        }
    }
}
