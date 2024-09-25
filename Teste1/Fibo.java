package Teste1;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.println("Verificar se um numero é da Sequência de Fibonacci!");
        System.out.println("Digite um numero: ");

        double entrada = e.nextDouble();
        int num = (int) entrada;

        if (isFibo(num)) {
            System.out.println("O numero " + num + " é da sequencia fibonacci!");
        } else {
            System.out.println("O numero " + num + " não é da sequencia fibonacci!");
        }
    }

    private static boolean isFibo(int num) {
        if (num < 0) {
            return false;
        } else {
            ArrayList<Integer> sequencia = sequenciaFibonacci(num);
            return sequencia.contains(num);
        }

    }

    private static ArrayList<Integer> sequenciaFibonacci(int num) {
        ArrayList<Integer> sequencia = new ArrayList<>();
        sequencia.add(0);
        sequencia.add(1);

        while (sequencia.get(sequencia.size() - 1) < num) {
            int proximo = sequencia.get(sequencia.size() - 1) + sequencia.get(sequencia.size() - 2);
            sequencia.add(proximo);
        }
        return sequencia;
    }
}