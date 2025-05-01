package org.samuel;

import java.util.Scanner;

public class Exercicio6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    System.out.print("Digite um número do vetor para ser excluído: ");
    int numeroParaExcluir = scanner.nextInt();

    int[] novoVetor = new int[vetor.length - 1];
    boolean removido = false;
    int j = 0;

    for (int i = 0; i < vetor.length; i++) {
      if (!removido && vetor[i] == numeroParaExcluir) {
        removido = true;
      } else {
        novoVetor[j] = vetor[i];
        j++;
      }
    }

    System.out.println("Vetor após remoção:");
    for (int i = 0; i < novoVetor.length; i++) {
      System.out.print(novoVetor[i] + " ");
    }

    scanner.close();
  }
}
