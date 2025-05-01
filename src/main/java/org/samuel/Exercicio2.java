package org.samuel;

public class Exercicio2 {
  public static void main(String[] args) {
    int[] vetor = {1,4,5,6,12,25,13,14,51,15,92,16,18,17,24};
    int maiorValor = vetor[0];
    int posicaoNoVetor = 0;
    for(int i = 0; i < vetor.length; i++) {
      if(vetor[i] > maiorValor) {
        maiorValor = vetor[i];
        posicaoNoVetor = i;
      }
    }
    System.out.println("Maior valor no array: " + maiorValor + " \ne sua posicao no vetor é: " + posicaoNoVetor);
  }
}
