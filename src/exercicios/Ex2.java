package exercicios;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.next();
        System.out.print("Digite o seu nome: ");
        String nome = entrada.next();
        String nomeCompleto = nome + ' ' + sobrenome;

        System.out.println(nomeCompleto);
        System.out.println("No. de caracteres do nome completo: "+nomeCompleto.length());
    }
}
