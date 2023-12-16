package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L4_ex2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String signo = null, nome;
		int dia, mes, ano;
		System.out.println("Digite seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Digite o dia do seu nascimento: formato DD/MM/AAAA ");
		dia = teclado.nextInt();
		System.out.println("Digite o mês do seu nascimento: formato DD/MM/AAAA");
		mes = teclado.nextInt();
		System.out.println("Digite o ano do seu nascimento: formato DD/MM/AAAA");
		ano = teclado.nextInt();
		if (mes == 12 && dia >= 22 || mes == 1 && dia <= 20) {
			signo = "Capricórnio";
		}
		if (mes == 01 && dia >= 21 || mes == 02 && dia <= 18) {
			signo = "Aquário";
		}
		if (mes == 02 && dia >= 19 || mes == 03 && dia <= 20) {
			signo = "Peixes";
		}
		if (mes == 03 && dia >= 21 || mes == 04 && dia <= 20) {
			signo = "Áries";
		}
		if (mes == 04 && dia >= 21 || mes == 05 && dia <= 20) {
			signo = "Touro";
		}
		if (mes == 05 && dia >= 21 || mes == 06 && dia <= 20) {
			signo = "Gêmeos";
		}
		if (mes == 06 && dia >= 21 || mes == 07 && dia <= 22) {
			signo = "Câncer";
		}
		if (mes == 07 && dia >= 23 || mes == 8 && dia <= 22) {
			signo = "Leão";
		}
		if (mes == 8 && dia >= 23 || mes == 9 && dia <= 22) {
			signo = "Virgem";
		}
		if (mes == 9 && dia >= 23 || mes == 10 && dia <= 22) {
			signo = "Libra";
		}
		if (mes == 10 && dia >= 23 || mes == 11 && dia <= 21) {
			signo = "Escorpião";
		}
		if (mes == 11 && dia >= 22 || mes == 12 && dia <= 21) {
			signo = "Sagitário";
		}
		System.out.printf("%s é do signo de : %s", nome, signo);
		teclado.close();
	}
}
