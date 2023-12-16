package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L7_EX4 {

	public static void main(String[] args) {
		//
		Scanner teclado = new Scanner(System.in);
		int[] R = new int[10];
		int[] S = new int[20];
		int[] X = new int[10];
		int i, j, k, tamX = 0;
		boolean repeteR, interseccao;

		for (i = 0; i < 10; i++) {
			R[i] = teclado.nextInt();
		}

		for (i = 0; i < 20; i++) {
			S[i] = teclado.nextInt();
		}

		for (i = 0; i < 10; i++) {
			for (j = 0; j < 20; j++) {
				if (R[i] == S[j]) {
					interseccao = false;
					for (k = 0; k < tamX; k++) {
						if (X[k] == R[i]) {
							interseccao = true;
							break;
						}
					}
					if (!interseccao) {
						X[tamX] = R[i];
						tamX++;
					}
				}
			}
		}
		for (i = 0; i < tamX; i++) {
			System.out.print(X[i] + " ");
		}
		teclado.close();
	}
}