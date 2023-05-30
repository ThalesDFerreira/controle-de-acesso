package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Classe Relatorio.
 */
public class Relatorio {
  private ArrayList<Integer> listaDeIdades = new ArrayList<Integer>();

  public ArrayList<Integer> getListaDeIdades() {
    return listaDeIdades;
  }

  public void setListaDeIdades(ArrayList<Integer> listaDeIdades) {
    this.listaDeIdades = listaDeIdades;
  }

  /**
   * Método que gera relatório.
   */
  public void fazerRelatorio(int menores, int adultos, int adultosMaisVelhos, int tamanho) {

    float porcMenores = (float) (menores * 100) / tamanho;
    float porcAdultos = (float) (adultos * 100) / tamanho;
    float porcMaisVelhos = (float) (adultosMaisVelhos * 100) / tamanho;

    System.out.println("----- Quantidade -----");
    System.out.println("menores: " + menores);
    System.out.println("adultas: " + adultos);
    System.out.println("a partir de 50: " + adultosMaisVelhos);

    String porcMenoresFormatado = new DecimalFormat("##0.00").format(porcMenores);
    String porcAdultosFormatado = new DecimalFormat("##0.00").format(porcAdultos);
    String porcMaisVelhosFormatado = new DecimalFormat("##0.00").format(porcMaisVelhos);

    System.out.println("----- Percentual -----");
    System.out.println("menores: " + porcMenoresFormatado + "%");
    System.out.println("adultas: " + porcAdultosFormatado + "%");
    System.out.println("a partir de 50: " + porcMaisVelhosFormatado + "%");

    System.out.println("TOTAL: " + tamanho);
  }
}
