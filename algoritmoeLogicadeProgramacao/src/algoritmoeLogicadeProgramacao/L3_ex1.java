package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L3_ex1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double celsius, kelvin, fahr;
		System.out.println("Informe o grau de temperatura em Celsius: ");
		celsius = teclado.nextDouble();
		kelvin = celsius + 273;
		fahr = (celsius * 1.8) + 32;
		System.out.printf("%.1f � graus Celsius equivale a %.1f � graus Fahrenheit e %.1f � graus Kelvin", celsius,
				fahr, kelvin);
	teclado.close();
	}
}

/*
 * Fa�a um programa em Java que leia o grau de temperatura em Celsius (C) e
 * imprima a sua convers�o em Fahrenheit (F) e Kelvin (K). Considere que
 * 
 * F = C x 1,8 + 32 K=C+273
 * 
 * 
 * Exemplo de entrada: o Informe o grau de temperatura em Celsius: 39
 * 
 * Sa�da esperada: o 39 graus Celsius equivale a 102,2 graus Fahrenheit e 312
 * graus Kelvin
 */
