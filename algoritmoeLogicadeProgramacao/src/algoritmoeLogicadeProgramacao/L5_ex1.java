package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L5_ex1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// declarando as vari�veis
		int n;
		System.out.println("Informe um n�mero: ");
		n = teclado.nextInt();
// declarando um la�o para receber somente uma entrada positiva
		while (n <= 0) {
			System.out.println("Informe um n�mero POSITIVO: ");
			n = teclado.nextInt();
		}
		// calculando o dobro
		for (int i = 1; i <= n; i++) {
			System.out.printf("Informe o n�mero %d : \n", i);
			int num = teclado.nextInt();
			int dobro = num * 2;
			System.out.printf("O dobro de %d �: %d \n", num, dobro);
		}

		teclado.close();
	}
}
