package exercicios;

import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate hoje = LocalDate.now();

        System.out.print("Digite sua data de nascimento: ");
        String dataNasc = input.next();
        LocalDate localDataNasc = LocalDate.parse(dataNasc, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        Period idade = Period.between(localDataNasc, hoje);
        int ano = idade.getYears();

        String res = (ano > 18) ? "Você é maior de idade." : "Você é menor de idade.";
        System.out.println(res);
    }
}
