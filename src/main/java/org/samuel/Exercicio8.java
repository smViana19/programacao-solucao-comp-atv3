package org.samuel;

public class Exercicio8 {
  public static void main(String[] args) {
    int[] vetorA = {13,22,35,41,54};
    int[] vetorB = {64,713,87,92,10};
    int[] vetorC = new int[vetorA.length + vetorB.length];

    for (int i = 0; i < vetorA.length; i++) {
      vetorC[i] = vetorA[i];
    }
    for (int i = 0; i < vetorB.length; i++) {
      vetorC[vetorA.length + i] = vetorB[i];
    }
    System.out.println("Juncao dos vetores");
    for (int i = 0; i < vetorC.length; i++) {
      System.out.print(vetorC[i] + " ");
    }

  }
}
