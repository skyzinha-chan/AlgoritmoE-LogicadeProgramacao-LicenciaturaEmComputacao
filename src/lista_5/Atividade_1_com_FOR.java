package lista_5;

import java.util.Scanner;

public class Atividade_1_com_FOR {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// declarando as vari�veis
		int n;
		System.out.println("Informe um n�mero: ");
		n = teclado.nextInt();
// declarando um la�o
		while (n <= 0) {
			System.out.println("Informe um n�mero POSITIVO: ");
			n = teclado.nextInt();
		}
		for (int i = 1; i <= n; i++) {
            System.out.printf("Informe o n�mero %d : \n", i);
            int num = teclado.nextInt();
            int dobro = num * num;
            System.out.printf("O dobro de %d �: %d \n", num, dobro);
        }
		
		teclado.close();
	}
}
