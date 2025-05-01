package org.samuel;

import java.util.Scanner;

public class Exercicio10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] vetor = new int[10];
    int aux = 0;
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("Digite o numero do vetor: ");
      vetor[i] = scanner.nextInt();
    }

    System.out.println("Vetor desordenado");
    for (int i = 0; i < vetor.length; i++) {
      System.out.println(vetor[i] + " ");
    }
    for (int i = 0; i < vetor.length; i++) {
      for (int j = 0; j < vetor.length - 1; j++) {
        if (vetor[j] > vetor[j + 1]) {
          aux = vetor[j];
          vetor[j] = vetor[j + 1];
          vetor[j + 1] = aux;
        }
      }
    }

    System.out.println("     ");
    System.out.println("Vetor ordenado: ");
    for(int i = 0; i < vetor.length; i++) {
      System.out.println(vetor[i] + " ");
    }


  }
}
