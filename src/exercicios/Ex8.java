package exercicios;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String operacao;
        double res = 0;

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();
        System.out.print("Digite a operação desejada (somar/subtrair/multiplicar/dividir): ");
        operacao = input.next();

//        while (operacao != "somar" && operacao != "subtrair" && operacao != "multiplicar" && operacao != "dividir") {
//            System.out.print("Operação inválida.");
//            System.out.print("Digite a operação desejada (somar/subtrair/multiplicar/dividir): ");
//            operacao = input.next();
//        }

        switch (operacao) {
            case "somar":
                res = num1 + num2;
                System.out.printf("Resultado : %f", res);
                break;
            case "subtrair":
                res = num1 - num2;
                System.out.printf("Resultado : %f", res);
                break;
            case "multiplicar":
                res = num1 * num2;
                System.out.printf("Resultado : %f", res);
                break;
            case "dividir":
                res = num1 / num2;
                System.out.printf("Resultado : %f", res);
                break;
            default:
                System.out.print("Operação inválida.\n");
        }
    }


}
