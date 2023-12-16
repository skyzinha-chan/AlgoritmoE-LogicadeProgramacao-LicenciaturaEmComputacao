package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L3_ex3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String produto;
		double custo, porcentagemCusto, porcentagemLucro, lucro;
		System.out.println("Nome do produto: ");
		produto = teclado.nextLine();
		System.out.println("Preço de custo: ");
		custo = teclado.nextDouble();
		System.out.println("Insira a porcentagem de lucro: ");
		porcentagemLucro = teclado.nextDouble();
		porcentagemCusto = 100 - porcentagemLucro;
		lucro = (custo * 100) / porcentagemCusto;
		System.out.printf("O %s que tem preço de custo de %.2f deve ser vendido por %.2f reais. ", produto, custo,
				lucro);
		teclado.close();
	}
}

/*
 * Faça um programa em Java onde o gerente de um supermercado pode informar o
 * nome de um produto, o preço de custo desse produto e a porcentagem de lucro
 * que ele deseja colocar no produto. O programa deve ao final imprimir os dados
 * informados do produto e qual será o preço de venda com a porcentagem de lucro
 * já atribuída ao preço de custo.
 * 
 * Exemplo de entrada:
 * 
 * Qual o nome do produto? Detergente Qual o preço de custo do produto? 1,4 Qual
 * a porcentagem de lucro? 30 A saída esperada deverá ser:
 * 
 * O Detergente que tem preço de custo de 1,4 deve ser vendido por 2 reais.
 * 
 * OBS: perceba que 70% de 2 reais é 1,4 reais
 */
