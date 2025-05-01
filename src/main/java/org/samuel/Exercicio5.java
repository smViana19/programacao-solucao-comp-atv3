package org.samuel;

public class Exercicio5 {
  public static void main(String[] args) {
    double[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    double media = 0;
    int acimaDaMedia = 0;

    for (int i = 0; i < vetor.length; i++) {
      media += vetor[i];
    }
    media = media / vetor.length;
    for(int i = 0; i < vetor.length; i++) {
      if(vetor[i] > media) {
        acimaDaMedia++;
      }
    }
    System.out.println("media: " + media + "e foram: " + acimaDaMedia + " acima da media");
  }
}
