package Teste4;

import java.util.Scanner;

public class Elemento {
    public static void main(String[] args) throws InterruptedException {
        Scanner e = new Scanner(System.in);

        int numero = 0;
        while (numero != 7) {
            System.out.println("De qual sequencia quer descobrir o proximo elemento?");
            System.out.println("1 - 1, 3, 5, 7, __");
            System.out.println("2 - 2, 4, 8, 16, 32, 64, __");
            System.out.println("3 - 0, 1, 4, 9, 16, 25, 36, __");
            System.out.println("4 - 4, 16, 36, 64, __");
            System.out.println("5 - 1, 1, 2, 3, 5, 8, __");
            System.out.println("6 - 2,10, 12, 16, 17, 18, 19, __");
            System.out.println("7 - Sair");

            System.out.println("Digite o numero: ");
            double escolha = e.nextDouble();
            numero = (int) escolha;

            int num = 0;
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=");
            switch (numero) {
                case 1:
                    num = 1;
                    for (int i = 0; i < 4; i++) {
                        if (i != 4) {
                            System.out.println("Numero: " + num);
                        }
                        num += 2;
                    }
                    System.out.println("O proximo numero e " + num);
                    break;
                case 2:
                    num = 2;
                    for (int i = 1; i < 7; i++) {
                        if (i != 7) {
                            System.out.println("Numero: " + num);
                        }
                        num = num * 2;
                    }
                    System.out.println("Proximo numero e " + num);
                    break;
                case 3:
                    num = 0;
                    for (int i = 0; i < 8; i++) {
                        num = i * i;
                        if (i != 7) {
                            System.out.println("Numero: " + num);
                        } else {
                            System.out.println("Proximo numero e " + num);
                        }
                    }
                    break;
                case 4:
                    num = 2;
                    for (int i = 0; i < 4; i++) {
                        int quadrado = num * num;
                        if (i != 4) {
                            System.out.println("Numero: " + quadrado);
                        }
                        num += 2;
                    }
                    System.out.println("Proximo numero e " + num * num);
                    break;
                case 5:
                    int a = 0, b = 1;
                    num = 0;
                    System.out.println("Numero: " + 1);
                    for (int i = 2; i <= 7; i++) {
                        num = a + b;
                        if (i != 7) {
                            System.out.println("Numero: " + num);
                        } else {
                            System.out.println("O próximo número é " + num);
                        }
                        a = b;
                        b = num;
                    }
                    break;
                case 6:
                    System.out.println(
                            "Teoricamente deveria ser 20, mas a sequencia não é uma Progressão Geométrica e nem uma Progressão Aritmética.");
                    System.out.println(
                            "A resposta é 200, pois todos os numeros começam com a letra D, ou seja, não existe uma logica matematica entre os numeros!");
                    break;
                case 7:
                    System.out.println("Saiu!");
                    break;

                default:
                    System.out.println("Invalido!");
                    break;
            }
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=");
            Thread.sleep(5000);
        }

    }
}