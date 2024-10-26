package trabalhoFINAL;

import java.util.Scanner;

public class trabalhofinal_Talita2 {

	public static void main(String[] args) {
		// Conteúdo: funções/procedimento e repetição
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantos cadastros deseja validar? ");
		int n = Integer.parseInt(teclado.nextLine());

		for (int i = 1; i <= n; i++) {
			System.out.printf("Informe os dados do cadastro %dº \n", i);
			System.out.println("Qual o nome?");
			String nome = teclado.nextLine();

			imprimeBoasVindas(nome);

			int escolha = imprimeMenu(nome);
			System.out.println(escolha);

			while (escolha < 0 || escolha > 3) {
				escolha = imprimeMenu(nome);
				System.out.println(escolha);
			}

			while (escolha == 0) {
				System.out.println("Qual o nome?");
				nome = teclado.nextLine();
				imprimeBoasVindas(nome);

				escolha = imprimeMenu(nome);
				System.out.println(escolha);

				while (escolha < 0 || escolha > 3) {
					escolha = imprimeMenu(nome);
					System.out.println(escolha);
				}

			}

			if (escolha == 3) {
				System.out.println("Cadastro encerrado!");
				break;
			} else {
				System.out.println("Qual o dia, mês e ano de nascimento?");
				int dia = Integer.parseInt(teclado.nextLine());
				int mes = Integer.parseInt(teclado.nextLine());
				int ano = Integer.parseInt(teclado.nextLine());
				boolean dataValida = verificaDataValida(dia, mes, ano);
				boolean bissextoValido = verificaBissexto(dia, mes, ano);

				while (dataValida == false && bissextoValido == false) {
					System.out.println("Informe uma data válida!");
					dia = Integer.parseInt(teclado.nextLine());
					mes = Integer.parseInt(teclado.nextLine());
					ano = Integer.parseInt(teclado.nextLine());
					dataValida = verificaDataValida(dia, mes, ano);
					bissextoValido = verificaBissexto(dia, mes, ano);
				}
				if (escolha == 1) {
					System.out.println(descobreSigno(dia, mes));

				} else {
					if (escolha == 2) {
						System.out.println(descobreEstacao(dia, mes));

					}

				}
			}

		}
		System.out.println("Fim do atendimento");

	}

	public static void imprimeBoasVindas(String nome) {
		System.out.println("Bem vindo(a), " + nome + "!");
		return;
	}

	public static int imprimeMenu(String nome) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(nome + ", escolha a opção desejada: ");
		System.out.println("0 - Corrigir o nome;");
		System.out.println("1 - Descobrir o seu Signo;");
		System.out.println("2 - Descobrir a estação do seu nascimento;");
		System.out.println("3 - Encerrar o programa;");
		int escolha = teclado.nextInt();
		return escolha;
	}

	public static boolean verificaBissexto(int dia, int mes, int ano) {
		boolean valido = false;
		if (mes == 2 && ano >= 0) {
			boolean bissexto = false;
			if ((ano % 400 == 0))
				bissexto = true;
			if (!(ano % 400 == 0) && (ano % 4 == 0) && !(ano % 100 == 0))
				bissexto = true;
			if (dia >= 1 && dia <= 28)
				valido = true;
			else {
				if (bissexto && dia >= 1 && dia <= 29)
					valido = true;
				else
					valido = false;
			}
		} else {
			valido = false;
		}
		return valido;
	}

	public static boolean verificaDataValida(int dia, int mes, int ano) {
		boolean validar = false;
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia >= 1 && dia <= 31 && ano >= 0)
				validar = true;
			else
				validar = false;

		} else {
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				if (dia >= 1 && dia <= 30 && ano >= 0)
					validar = true;
				else
					validar = false;

			}
		}
		return validar;
	}

	public static String descobreSigno(int dia, int mes) {
		String signo = null;
		if (mes == 12 && dia >= 22 || mes == 1 && dia <= 20)
			signo = "Capricórnio";
		else if (mes == 01 && dia >= 21 || mes == 02 && dia <= 18)
			signo = "Aquário";
		else if (mes == 02 && dia >= 19 || mes == 03 && dia <= 20)
			signo = "Peixes";
		else if (mes == 03 && dia >= 21 || mes == 04 && dia <= 20)
			signo = "Áries";
		else if (mes == 04 && dia >= 21 || mes == 05 && dia <= 20)
			signo = "Touro";
		else if (mes == 05 && dia >= 21 || mes == 06 && dia <= 20)
			signo = "Gêmeos";
		else if (mes == 06 && dia >= 21 || mes == 07 && dia <= 22)
			signo = "Câncer";
		else if (mes == 07 && dia >= 23 || mes == 8 && dia <= 22)
			signo = "Leão";
		else if (mes == 8 && dia >= 23 || mes == 9 && dia <= 22)
			signo = "Virgem";
		else if (mes == 9 && dia >= 23 || mes == 10 && dia <= 22)
			signo = "Libra";
		else if (mes == 10 && dia >= 23 || mes == 11 && dia <= 21)
			signo = "Escorpião";
		else if (mes == 11 && dia >= 22 || mes == 12 && dia <= 21)
			signo = "Sagitário";
		return signo;

	}

	public static String descobreEstacao(int dia, int mes) {
		String estacao = null;
		if ((mes == 3 && dia >= 20) || mes == 4 || mes == 5 || (mes == 6 && dia <= 20))
			estacao = "Outono";
		if ((mes == 6 && dia >= 21) || mes == 7 || mes == 8 || (mes == 9 && dia <= 22))
			estacao = "Inverno";
		if ((mes == 9 && dia >= 23) || mes == 10 || mes == 11 || (mes == 12 && dia <= 21))
			estacao = "Primavera";
		if ((mes == 12 && dia >= 22) || mes == 1 || mes == 2 || (mes == 3 && dia <= 20))
			estacao = "Verão";
		return estacao;
	}
}
