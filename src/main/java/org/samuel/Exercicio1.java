package org.samuel;

public class Exercicio1 {

  public static void main(String[] args) {
    int[] vetor = {10,10,10,7,5,6,7,8,9,10};
    int soma = 0;
    for (int i = 0; i < vetor.length; i++) {
      soma += vetor[i];
    }
    System.out.println("O resultado da soma é: " + soma);
  }
}
