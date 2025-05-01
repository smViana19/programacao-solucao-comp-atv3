package org.samuel;

import java.util.Scanner;

public class Exercicio7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] vetor = {1,2,2,2,5,6,7,8,8,9,10,11,12,13,14};
    int vezesQueAparece = 0;

    System.out.print("Digite um número do vetor: ");
    int numeroDigitado = scanner.nextInt();
    for(int i = 0; i < vetor.length; i++) {
      if(numeroDigitado == vetor[i]) {
        vezesQueAparece++;
      }
    }
    System.out.println("O numero digitado apareceu " + vezesQueAparece );
  }
}
