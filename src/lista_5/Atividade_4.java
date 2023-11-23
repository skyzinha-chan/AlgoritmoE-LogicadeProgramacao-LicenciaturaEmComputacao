package lista_5;

import java.util.Scanner;

public class Atividade_4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n=9;
		int opcao = 1;
		while (opcao != 0) {
			System.out.print("  MENU\nDigite:\n");
			System.out.println("1-Média Aritmética");
			System.out.println("2-Fatorial");
			System.out.println("3-Par ou ímpar");
			System.out.println("4-Primo");
			System.out.println("0-Sair");
			opcao = teclado.nextInt();

			if (opcao == 1) {
				System.out.println("Informe Nop: ");
				try{
				n = teclado.nextInt();
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				int cont = 1;
				int soma = 0;
				while (cont <= n) {
					System.out.println("Informe o " + cont + "º número:");
					int numer1 = teclado.nextInt();
					soma = soma + numer1;
					cont++;
				}
				double media = soma / n;
				System.out.println("A média é:" + media);

			} else {
				if (opcao == 2) {
					System.out.println("Informe N2:");
					int nu = (int) teclado.nextInt();
					int conte = nu;
					int fatorial = 1;
					while (conte >= 1) {
						fatorial = fatorial * conte;
						conte--;
					}
					System.out.println("O fatorial de" + nu + " é:" + fatorial);

				} else {
					if (opcao == 3) {
						int numero, resto;
						System.out.println("Informe N3: ");
						numero = teclado.nextInt();
						resto = numero % 2;
						if (resto == 0)
							System.out.println(numero + " É par.");
						else
							System.out.println(numero + " É ímpar.");

					} else {
						if (opcao == 4) {
							int contagem = 2;
							boolean ehPrimo = true;
							System.out.println("Informe Nff: ");
							int num = teclado.nextInt();
							int metadeN = num / 2;
							while (contagem <= metadeN) {
								if (num % contagem == 0) {
									ehPrimo = false;
								}
								contagem++;
							}
							if (ehPrimo)
								System.out.println(num + " É primo.");
							else
								System.out.println(num + " Não é primo.");

						} else {
							if (opcao == 0) {
								System.out.println("Programa finalizado");
							} else {
								if (opcao != 1 || opcao != 2 || opcao != 3 || opcao != 4) {
									System.out.println("Opção Inválida. Tente Novamente");
								}

							}
						}
					}
				}
			}

		}
		teclado.close();
	}

}
