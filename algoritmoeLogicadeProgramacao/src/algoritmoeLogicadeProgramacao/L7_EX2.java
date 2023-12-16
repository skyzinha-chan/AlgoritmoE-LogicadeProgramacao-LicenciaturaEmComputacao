package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L7_EX2 {

	public static void main(String[] args) {
		//
		Scanner teclado = new Scanner(System.in);
		int[] R = new int[5];
		int[] S = new int[10];
		int i, j, tamX = 0;
		int[] X = new int[5];
		boolean achou;

		for (i = 0; i < 5; i++) {
			// System.out.println("R["+i+"]:");
			R[i] = teclado.nextInt();
		}

		for (i = 0; i < 10; i++) {
			// System.out.println("S["+i+"]:");
			S[i] = teclado.nextInt();
		}

		for (i = 0; i < 5; i++) {
			achou = false;
			for (j = 0; j < 10; j++) {
				if (R[i] == S[j]) {
					achou = true;
					break;
				}
			}
			if (achou == true) {
				X[tamX] = R[i];
				tamX++;
			}
		}

		for (i = 0; i < tamX; i++) {
			System.out.print(X[i] + " ");
		}
		teclado.close();
	}

}