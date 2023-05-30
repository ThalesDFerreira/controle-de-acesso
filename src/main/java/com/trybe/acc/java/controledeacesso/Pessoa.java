package com.trybe.acc.java.controledeacesso;

/**
 * Classe Pessoa.
 */
public class Pessoa {
  Relatorio relatorio = new Relatorio();
  private int menores = 0;
  private int adultos = 0;
  private int adultosMaisVelhos = 0;

  private int tamanho = 0;

  public int getAdultosMaisVelhos() {
    return adultosMaisVelhos;
  }

  public void setAdultosMaisVelhos(int adultosMaisVelhos) {
    this.adultosMaisVelhos = adultosMaisVelhos;
  }

  public int getMenores() {
    return menores;
  }

  public void setMenores(int menores) {
    this.menores = menores;
  }

  public int getAdultos() {
    return adultos;
  }

  public void setAdultos(int adultos) {
    this.adultos = adultos;
  }

  public int getTamanho() {
    return tamanho;
  }

  public void setTamanho(int tamanho) {
    this.tamanho = tamanho;
  }

  /**
   * Método verifica idade.
   */
  public String verificaIdade(int idade) {

    if (idade < 18) {
      addArrayTamanho(idade, relatorio);
      menores += 1;
      return "Pessoa cliente menor de idade, catraca liberada!";
    } else if (idade >= 18 && idade <= 49) {
      addArrayTamanho(idade, relatorio);
      adultos += 1;
      return "Pessoa adulta, catraca liberada!";
    }
    addArrayTamanho(idade, relatorio);
    adultosMaisVelhos += 1;
    return "Pessoa adulta a partir de 50, catraca liberada!";
  }

  private void addArrayTamanho(int idade, Relatorio r) {
    r.getListaDeIdades().add(idade);
    tamanho = r.getListaDeIdades().size();
  }
}
