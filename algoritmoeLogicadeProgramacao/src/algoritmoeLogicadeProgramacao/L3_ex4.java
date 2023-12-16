package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L3_ex4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o nome do fumante? ");
		String fumante = teclado.nextLine();
		System.out.println("H� quantos anos � fumante? ");
		int anosfum = teclado.nextInt();
		System.out.println("Quantos cigarros em m�dia por dia consome? ");
		int cigdia = teclado.nextInt();
		System.out.println("Qual o pre�o m�dio de cada carteira de cigarros? ");
		float valorcig = teclado.nextFloat();
		int meses = 12;
		int mes = 30;
		int cartcig = 20;
		int totaldias;
		totaldias = (anosfum * meses) * mes;
		totaldias = (totaldias * cigdia) / cartcig;
		float total = (float) totaldias * valorcig;
		System.out.printf(" %s j� gastou um total de %.2f reais. ", fumante, total);
		teclado.close();
	}
}

/*
 * Fa�a um programa em Java que calcula a quantidade dinheiro gasta por um
 * fumante. O programa deve ler o nome do fumante, o n�mero de anos que ele
 * fumou, o n� de cigarros fumados por dia e o pre�o de uma carteira com 20
 * cigarros. Considere que todos os meses possuem 30 dias.
 * 
 * � Exemplo de entrada:
 * 
 * o Qual o nome do fumante? Jo�o
 * 
 * o Quantos anos Jo�o fumou? 25
 * 
 * o Qual a quantidade m�dia de cigarros por dia? 12
 * 
 * o Qual o pre�o m�dio de cada carteira? 2,67
 * 
 * � Sa�da esperada:
 * 
 * o Jo�o j� gastou um total de 14.418 reais.
 */
