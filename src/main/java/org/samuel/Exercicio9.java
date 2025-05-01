package org.samuel;

public class Exercicio9 {
  public static void main(String[] args) {
    int[] vetorA = {13, 22, 35, 41, 54, 88};
    int[] vetorB = {13, 4, 87, 54, 10, 88};

    int[] temNosDois = new int[6];
    for(int i = 0; i < vetorA.length; i++) {
      for(int j = 0; j < vetorB.length; j++) {
        if(vetorA[i] == vetorB[j]) {
          System.out.println(vetorA[i] + " ");
        }
      }
    }
  }
}
