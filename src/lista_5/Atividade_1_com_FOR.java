package lista_5;

import java.util.Scanner;

public class Atividade_1_com_FOR {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// declarando as variáveis
		int n;
		System.out.println("Informe um número: ");
		n = teclado.nextInt();
// declarando um laço para receber somente uma entrada positiva
		while (n <= 0) {
			System.out.println("Informe um número POSITIVO: ");
			n = teclado.nextInt();
		}
		// calculando o dobro
		for (int i = 1; i <= n; i++) {
            System.out.printf("Informe o número %d : \n", i);
            int num = teclado.nextInt();
            int dobro = num * 2;
            System.out.printf("O dobro de %d é: %d \n", num, dobro);
        }
		
		teclado.close();
	}
}
