package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L7_EX4_dnovo {

	public static void main(String[] args) {
		//
		Scanner teclado = new Scanner(System.in);
		int[] R = new int[10];
		int[] S = new int[20];
		int[] X = new int[10];
		int i, k, tamX = 0, j;
		boolean repeteR, interseccao;

		for (i = 0; i < 10; i++) {
			// System.out.println("R["+i+"]:");
			R[i] = teclado.nextInt();
		}

		for (i = 0; i < 20; i++) {
			// System.out.println("S["+i+"]:");
			S[i] = teclado.nextInt();
		}

		for (i = 0; i < 10; i++) {
			interseccao = false;
			for (j = 0; j < 20; j++) {
				if (R[i] == S[j]) {
					interseccao = true;
					break;
				}
			}
			if (interseccao) {
				repeteR = false;
				for (k = 0; k < tamX; k++) {
					if (i != j && R[i] == X[k]) {
						repeteR = true;
						break;
					}
				}
				if (!repeteR) {
					X[tamX] = S[i];
					tamX++;
				}
			}

		}
		for (i = 0; i < tamX; i++) {
			System.out.print(X[i] + " ");
		}
		teclado.close();
	}

}