package lista_5;

import java.util.Scanner;

public class Atividade_4_comSwitch {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = 0;
		int opcao = 1;
		while (opcao != 0) {
			System.out.print(" \nMENU\n          Digite:\n");
			System.out.println(" 1- MÉDIA ARITMÉTICA");
			System.out.println(" 2- FATORIAL");
			System.out.println(" 3- PAR OU ÍMPAR");
			System.out.println(" 4- PRIMO");
			System.out.println(" 0- SAIR");
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Informe quantas notas serão calculadas: ");
				n = teclado.nextInt();
				int soma = 0;
				for (int cont = 1; cont <= n; cont++) {
					System.out.println("Informe o " + cont + "º número:");
					int numer1 = teclado.nextInt();
					soma = soma + numer1;
				}
				double media = soma / n;
				System.out.println("A média é:" + media);
				break;
			case 2:
				System.out.println("Informe qual número quer o fatorial:");
				int nu = teclado.nextInt();
				int fatorial = 1;
				for (int conte = nu; conte >= 1; conte--) {
					fatorial = fatorial * conte;
				}
				System.out.println("O fatorial de " + nu + " é: " + fatorial);
				break;
			case 3:
				int numero, resto;
				System.out.println("Informe um número para saber se é PAR ou ÍMPAR: ");
				numero = teclado.nextInt();
				resto = numero % 2;
				if (resto == 0)
					System.out.println(numero + " É par.");
				else
					System.out.println(numero + " É ímpar.");
				break;
			case 4:
				boolean ehPrimo = true;
				System.out.println("Informe um número para saber se é PRIMO ou NÃO É PRIMO: ");
				int num = teclado.nextInt();
				int metadeN = num / 2;
				for (int contagem = 2; contagem <= metadeN; contagem++) {
					if (num % contagem == 0) {
						ehPrimo = false;
					}
				}
				if (ehPrimo)
					System.out.println(num + " É primo.");
				else
					System.out.println(num + " Não é primo.");
				break;
			case 0:
				System.out.println("Programa finalizado");
				break;
			default:
				System.out.println("Opção Inválida. Tente Novamente");
			}
		}
		teclado.close();
	}
}
