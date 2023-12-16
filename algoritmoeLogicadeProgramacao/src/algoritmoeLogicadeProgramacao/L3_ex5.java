package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L3_ex5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double latao, cobre, zinco;
		System.out.println("Quantos kg de latão deseja produzir? ");
		latao = teclado.nextFloat();
		cobre = 0.7;
		zinco = 0.3;
		cobre = cobre * latao;
		zinco = zinco * latao;
		System.out.printf("Para %.1f kg de latão será necessário %.1f kg de cobre e %.1f kg de zinco.", latao, cobre,
				zinco);
		teclado.close();
	}
}

/*
 * Faça um programa em Java que calcula a quantidade de cobre e zinco necessário
 * para produzir o latão. Considere que o latão é composto por 70% de cobre e
 * 30% de zinco e a quantidade de latão que se deseja deverá ser lido pelo
 * teclado. O programa deve lê a quantidade em quilo do latão que deseja
 * produzir e depois imprimir quantos quilos será necessário de cobre e zinco.
 * 
 * · Exemplo de entrada:
 * 
 * o Quantos kg de latão deseja produzir? 408
 * 
 * · Saída esperada:
 * 
 * o Para 408 kg de latão será necessário 285.6 kg de cobre e 122.4 kg de zinco
 */
