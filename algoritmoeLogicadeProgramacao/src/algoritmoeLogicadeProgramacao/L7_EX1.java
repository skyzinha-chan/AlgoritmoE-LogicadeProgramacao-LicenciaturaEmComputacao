package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L7_EX1 {

	public static void main(String[] args) {
		// ler
		Scanner teclado = new Scanner(System.in);
		int[] R = new int[10];
		int[] S = new int[20];
		int[] X = new int[30];
		int i, tamX = 0, j;
		boolean achou;

		for (i = 0; i < 10; i++) {
			// System.out.println("R["+i+"]:");
			R[i] = teclado.nextInt();
		}
		
		for (i = 0; i < 20; i++) {
			// System.out.println("S["+i+"]:");
			S[i] = teclado.nextInt();
		}
		
		for (i = 0; i < 10; i++) {
			achou = false;
			
			for (j = tamX - 1; j >= 0; j--) {
				if (X[j] == R[i]) {
					achou = true;
				}
			}
			
			if (achou == false) {
				X[tamX] = R[i];
				tamX++;
			}
		}
		
		for (i = 0; i < 20; i++) {
			achou = false;
			for (j = tamX - 1; j >= 0; j--) {
				if (X[j] == S[i]) {
					achou = true;
				}
			}
			if (achou == false) {
				X[tamX] = S[i];
				tamX++;
			}
		}
		
		for (i = 0; i < tamX; i++) {
			System.out.print(X[i] + " ");
		}
		teclado.close();
	}

}