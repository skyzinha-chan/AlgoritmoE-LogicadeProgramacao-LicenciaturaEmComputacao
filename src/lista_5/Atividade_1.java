package lista_5;

import java.util.Scanner;

public class Atividade_1 {

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
		int cont = n;
		int num, inic = 1;
		while (inic <= cont) {
			System.out.printf("Informe o n�mero %d : \n", inic);
			num = teclado.nextInt();
			int dobro = num * 2;
			System.out.printf("O dobro de %d �: %d \n", num, dobro);
			inic++;
		}
		teclado.close();
	}
}
