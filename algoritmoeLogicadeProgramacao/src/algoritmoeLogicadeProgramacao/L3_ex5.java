package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L3_ex5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double latao, cobre, zinco;
		System.out.println("Quantos kg de lat�o deseja produzir? ");
		latao = teclado.nextFloat();
		cobre = 0.7;
		zinco = 0.3;
		cobre = cobre * latao;
		zinco = zinco * latao;
		System.out.printf("Para %.1f kg de lat�o ser� necess�rio %.1f kg de cobre e %.1f kg de zinco.", latao, cobre,
				zinco);
		teclado.close();
	}
}

/*
 * Fa�a um programa em Java que calcula a quantidade de cobre e zinco necess�rio
 * para produzir o lat�o. Considere que o lat�o � composto por 70% de cobre e
 * 30% de zinco e a quantidade de lat�o que se deseja dever� ser lido pelo
 * teclado. O programa deve l� a quantidade em quilo do lat�o que deseja
 * produzir e depois imprimir quantos quilos ser� necess�rio de cobre e zinco.
 * 
 * � Exemplo de entrada:
 * 
 * o Quantos kg de lat�o deseja produzir? 408
 * 
 * � Sa�da esperada:
 * 
 * o Para 408 kg de lat�o ser� necess�rio 285.6 kg de cobre e 122.4 kg de zinco
 */
