package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L5_ex2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// declarando as variáveis

		int n;

		System.out.println("Digite N: ");

		n = teclado.nextInt();

		// declarando um laço

		while (n <= 0) {

			System.out.println("Digite N POSITIVO: ");

			n = teclado.nextInt();

		}

		int num, inicio = 1;

		while (inicio <= n) {

			System.out.printf("Informe o %d º número positivo ou zero: \n", inicio);

			num = teclado.nextInt();

			while (num < 0) {

				System.out.printf("Informe o %d º número positivo ou zero: \n", inicio);

				num = teclado.nextInt();

			}

			int contagem = num;

			int fatorial = 1;

			while (contagem >= 1) {

				fatorial = fatorial * contagem;

				contagem--;

			}

			System.out.printf("O fatorial do %d º número  (%d) é: %d \n", inicio, num, fatorial);

			inicio++;

		}

		teclado.close();

	}

}
