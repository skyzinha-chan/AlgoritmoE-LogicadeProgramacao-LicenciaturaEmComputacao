package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L7_EX3 {

	public static void main(String[] args) {
		//
		Scanner teclado = new Scanner(System.in);
		int[] B = new int[10];
		int i, j, tamX = 0;
		int[] C = new int[10];
		boolean repete;

		for (i = 0; i < 10; i++) {
			// System.out.println("R["+i+"]:");
			B[i] = teclado.nextInt();
		}
		for (i = 0; i < 10; i++) {
			repete = false;
			for (j = 0; j < 10; j++) {
				if (i != j && B[i] == B[j]) {
					repete = true;
					break;
				}
			}
			if (!repete) {
				C[tamX] = B[i];
				tamX++;
            }
		}

		for (i = 0; i < tamX; i++) {
			System.out.print(C[i] + " ");
		}
		teclado.close();
	}
}