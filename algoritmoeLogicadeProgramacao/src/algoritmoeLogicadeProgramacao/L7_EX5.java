package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L7_EX5 {

	public static void main(String[] args) {
		// ler x produtos e seus valores e realizar o valor total deles.
		Scanner teclado = new Scanner(System.in);
		double[] soma = new double[1];
		int[] Q = new int[10];
		for (int i = 0; i < 10; i++) {
			// System.out.printf("Informe a quantidade vendida do %dº produto: \n", i + 1);
			Q[i] = teclado.nextInt();
		}

		double[] P = new double[10];
		for (int i = 0; i < 10; i++) {
			// System.out.printf("Informe o preço de venda do %dº produto: \n", i + 1);
			P[i] = teclado.nextDouble();
		}
		// realizar o valor dos produtos pela quantidade entre vetores
		for (int i = 0; i < 10; i++) {
			soma[0] += Q[i] * P[i];
		}
		// System.out.println("O valor dos produtos vendidos mensal é: ");
		System.out.println(soma[0]);
		teclado.close();
	}
}
