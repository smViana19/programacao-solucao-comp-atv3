package org.samuel;

import java.util.Scanner;

public class Exercicio4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] vetor = new int[8];

    for(int i = 0; i < vetor.length; i++) {
      System.out.println("Digite um numero inteiro: ");

      vetor[i] = scanner.nextInt();
    }

    for (int i = vetor.length - 1; i >= 0; i--) {
      System.out.println(vetor[i]);
    }
    scanner.close();
  }
}
