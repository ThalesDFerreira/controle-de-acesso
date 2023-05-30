package com.trybe.acc.java.controledeacesso;

import java.util.Scanner;

/**
 * Classe principal.
 */
public class Principal {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Pessoa pessoa = new Pessoa();
    Relatorio relatorio = new Relatorio();
    short opcao = 0;

    while (opcao == 0) {
      System.out.println("Entre com o número correspondente à opção desejada:\n"
          + "1 - Acessar o estabelecimento\n"
          + "2 - Finalizar sistema e mostrar relatório\n");
      opcao = scanner.nextShort();

      if (opcao == 1) {
        System.out.println("Entre com a sua idade:");
        int idade = Integer.parseInt(scanner.next());
        System.out.println(pessoa.verificaIdade(idade));
        opcao = 0;
      } else if (opcao == 0 || opcao > 2) {
        System.out.println("Entre com uma opção válida");
        opcao = 0;
      }
    }
    relatorio.fazerRelatorio(pessoa.getMenores(),
        pessoa.getAdultos(),
        pessoa.getAdultosMaisVelhos(),
        pessoa.getTamanho());
    scanner.close();
  }
}
