package lista_5;

import java.util.Scanner;

public class Atividade_4_comSwitch {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = 0;
		int opcao = 1;
		while (opcao != 0) {
			System.out.print(" \nMENU\n          Digite:\n");
			System.out.println(" 1- M�DIA ARITM�TICA");
			System.out.println(" 2- FATORIAL");
			System.out.println(" 3- PAR OU �MPAR");
			System.out.println(" 4- PRIMO");
			System.out.println(" 0- SAIR");
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Informe quantas notas ser�o calculadas: ");
				n = teclado.nextInt();
				int soma = 0;
				for (int cont = 1; cont <= n; cont++) {
					System.out.println("Informe o " + cont + "� n�mero:");
					int numer1 = teclado.nextInt();
					soma = soma + numer1;
				}
				double media = soma / n;
				System.out.println("A m�dia �:" + media);
				break;
			case 2:
				System.out.println("Informe qual n�mero quer o fatorial:");
				int nu = teclado.nextInt();
				int fatorial = 1;
				for (int conte = nu; conte >= 1; conte--) {
					fatorial = fatorial * conte;
				}
				System.out.println("O fatorial de " + nu + " �: " + fatorial);
				break;
			case 3:
				int numero, resto;
				System.out.println("Informe um n�mero para saber se � PAR ou �MPAR: ");
				numero = teclado.nextInt();
				resto = numero % 2;
				if (resto == 0)
					System.out.println(numero + " � par.");
				else
					System.out.println(numero + " � �mpar.");
				break;
			case 4:
				boolean ehPrimo = true;
				System.out.println("Informe um n�mero para saber se � PRIMO ou N�O � PRIMO: ");
				int num = teclado.nextInt();
				int metadeN = num / 2;
				for (int contagem = 2; contagem <= metadeN; contagem++) {
					if (num % contagem == 0) {
						ehPrimo = false;
					}
				}
				if (ehPrimo)
					System.out.println(num + " � primo.");
				else
					System.out.println(num + " N�o � primo.");
				break;
			case 0:
				System.out.println("Programa finalizado");
				break;
			default:
				System.out.println("Op��o Inv�lida. Tente Novamente");
			}
		}
		teclado.close();
	}
}
