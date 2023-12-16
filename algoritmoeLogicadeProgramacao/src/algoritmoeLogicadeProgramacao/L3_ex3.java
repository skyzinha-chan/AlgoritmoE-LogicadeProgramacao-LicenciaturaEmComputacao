package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L3_ex3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String produto;
		double custo, porcentagemCusto, porcentagemLucro, lucro;
		System.out.println("Nome do produto: ");
		produto = teclado.nextLine();
		System.out.println("Pre�o de custo: ");
		custo = teclado.nextDouble();
		System.out.println("Insira a porcentagem de lucro: ");
		porcentagemLucro = teclado.nextDouble();
		porcentagemCusto = 100 - porcentagemLucro;
		lucro = (custo * 100) / porcentagemCusto;
		System.out.printf("O %s que tem pre�o de custo de %.2f deve ser vendido por %.2f reais. ", produto, custo,
				lucro);
		teclado.close();
	}
}

/*
 * Fa�a um programa em Java onde o gerente de um supermercado pode informar o
 * nome de um produto, o pre�o de custo desse produto e a porcentagem de lucro
 * que ele deseja colocar no produto. O programa deve ao final imprimir os dados
 * informados do produto e qual ser� o pre�o de venda com a porcentagem de lucro
 * j� atribu�da ao pre�o de custo.
 * 
 * Exemplo de entrada:
 * 
 * Qual o nome do produto? Detergente Qual o pre�o de custo do produto? 1,4 Qual
 * a porcentagem de lucro? 30 A sa�da esperada dever� ser:
 * 
 * O Detergente que tem pre�o de custo de 1,4 deve ser vendido por 2 reais.
 * 
 * OBS: perceba que 70% de 2 reais � 1,4 reais
 */
