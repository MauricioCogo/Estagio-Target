package Teste2;

import java.util.Scanner;

public class LetraA {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.println("Contador de letras ás!");
        System.out.println("Digite uma frase:");
        String frase = e.nextLine();

        int count = 0;
        int minuscula = 0;
        int maiuscula = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == 'A') {
                count++;
                maiuscula++;
            }
            if (letra == 'a') {
                count++;
                minuscula++;
            }
        }

        if (count > 0) {
            System.out.println("A frase contem " + count + " ás no total");
            System.out.println(
                    "Ela contem " + maiuscula + " letras ás maisculas e " + minuscula + " letras ás minusculas!");
        } else {
            System.out.println("Não possui a letra A na frase!");
        }

    }
}
