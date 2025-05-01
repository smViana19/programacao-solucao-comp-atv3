package org.samuel;

public class Exercicio3 {
  public static void main(String[] args) {
    int[] vetor = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    int numeroPar = 0;
    for (int i = 0; i < vetor.length; i++) {
      if(vetor[i] % 2 == 0) {
        numeroPar++;
      }
    }
    System.out.println("Sao: " + numeroPar + " numeros pares");
  }
}
