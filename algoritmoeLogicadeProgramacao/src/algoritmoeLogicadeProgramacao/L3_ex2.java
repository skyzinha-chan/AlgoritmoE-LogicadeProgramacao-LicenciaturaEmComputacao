package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L3_ex2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int larg, comp, mtquadrado;
		System.out.println("Informe a largura do terreno: ");
		larg = teclado.nextInt();
		System.out.println("Informe o comprimento do terreno: ");
		comp = teclado.nextInt();
		mtquadrado = larg * comp;
		System.out.printf("O terreno %d x %d tem %d metros quadrados", larg, comp, mtquadrado);

		teclado.close();
	}

}

/*
 * Fa�a um programa em Java que calcula a �rea de um terreno para uma
 * imobili�ria.
 * 
 * Inicialmente deve-se imprimir uma mensagem pedindo para informar a largura e
 * comprimento do terreno e depois efetuar a leitura desses valores. Ao final o
 * programa deve imprimir a �rea total do terreno.
 * 
 * Exemplo de entrada:
 * 
 * Informe a largura do terreno: 36 Informe o comprimento do terreno: 60 A sa�da
 * esperada dever� ser:
 * 
 * O terreno 36x60 tem 2160 metros quadrados
 */
