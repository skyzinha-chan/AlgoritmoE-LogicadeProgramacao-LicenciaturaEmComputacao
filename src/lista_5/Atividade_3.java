package lista_5;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
// declarando as variáveis
		Scanner teclado = new Scanner(System.in);
		int num, metadeN, contagem = 2;
		boolean ehPrimo = true;
		System.out.println("Informe um Número: ");
		num = teclado.nextInt();
// Informe se um número é primo ou não!
		metadeN = num / 2;

		while (contagem <= metadeN) {
			if ((num % contagem == 0) || (num == 1 || num == 0)) {
				ehPrimo = false;
			}
			contagem++;
		}
		if (ehPrimo)

			System.out.println(num + " É primo.");

		else
			System.out.println(num + " Não é primo.");
		teclado.close();

	}

}
