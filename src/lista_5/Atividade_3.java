package lista_5;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
// declarando as vari�veis
		Scanner teclado = new Scanner(System.in);
		int num, metadeN, contagem = 2;
		boolean ehPrimo = true;
		System.out.println("Informe um N�mero: ");
		num = teclado.nextInt();
// Informe se um n�mero � primo ou n�o!
		metadeN = num / 2;

		while (contagem <= metadeN) {
			if ((num % contagem == 0) || (num == 1 || num == 0)) {
				ehPrimo = false;
			}
			contagem++;
		}
		if (ehPrimo)

			System.out.println(num + " � primo.");

		else
			System.out.println(num + " N�o � primo.");
		teclado.close();

	}

}
