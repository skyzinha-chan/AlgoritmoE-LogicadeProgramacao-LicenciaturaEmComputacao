package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L4_ex4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n2, n3, n1;
		int aux;
		System.out.println("Digite o primeiro número: ");
		n1 = teclado.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = teclado.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = teclado.nextInt();
		if (n1 > n2) {
			aux = n2;
			n2 = n1;
			n1 = aux;
		}
		if (n2 > n3) {
			aux = n3;
			n3 = n2;
			n2 = aux;
		}
		if (n1 > n2) {
			aux = n2;
			n2 = n1;
			n1 = aux;
		}
		System.out.println("A ordem crescente é: " + n1 + " " + n2 + " " + n3);
		teclado.close();
	}
}
