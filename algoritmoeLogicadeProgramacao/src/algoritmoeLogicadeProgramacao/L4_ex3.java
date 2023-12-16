package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L4_ex3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int diaB, anoB, horaB, minB, diaJ = 0, anoJ = 0, horaJ = 0, minJ = 0;
		String mesB, mesJ = "";
		// 2º passo leitura do teclado
		System.out.println("Qual a hora no Brasil?");
		horaB = teclado.nextInt();
		System.out.println("Qual o min no Brasil?");
		minB = teclado.nextInt();
		System.out.println("Qual o dia no Brasil?");
		diaB = teclado.nextInt();
		System.out.println("Qual o mês no Brasil?");
		mesB = teclado.next();
		System.out.println("Qual o ano no Brasil?");
		anoB = teclado.nextInt();
		if (horaB < 12) {
			horaJ = horaB + 12;
			minJ = minB;
			diaJ = diaB;
			mesJ = mesB;
			anoJ = anoB;
		} else {
			horaJ = horaB + 12 - 24;
			minJ = minB;
			if (mesB.equals("janeiro") || mesB.equals("Janeiro")) {
				if (diaB < 31) {
					diaJ = diaB + 1;
					mesJ = mesB;
					anoJ = anoB;
				} else {
					diaJ = 1;
					mesJ = "fevereiro";
					anoJ = anoB;
				}
			}
			if (mesB.equals("fevereiro")) {
				if (diaB < 28) {
					diaJ = diaB + 1;
					mesJ = mesB;
					anoJ = anoB;
				} else {
					diaJ = 1;
					mesJ = "março";
					anoJ = anoB;
				}
			}
			if (mesB.equals("março")) {
				if (diaB < 31) {
					diaJ = diaB + 1;
					mesJ = mesB;
					anoJ = anoB;
				} else {
					diaJ = 1;
					mesJ = "abril";
					anoJ = anoB;
				}
			}
			if (mesB.equals("abril")) {
				if (diaB < 30) {
					diaJ = diaB + 1;
					mesJ = mesB;
					anoJ = anoB;
				} else {
					diaJ = 1;
					mesJ = "maio";
					anoJ = anoB;
				}
			}
			if (mesB.equals("maio")) {
				if (diaB < 30) {
					diaJ = diaB + 1;
					mesJ = mesB;
					anoJ = anoB;
				} else {
					diaJ = 1;
					mesJ = "junho";
					anoJ = anoB;
				}
			}
			if (mesB.equals("junho")) {
				if (diaB < 31) {
					diaJ = diaB + 1;
					mesJ = mesB;
					anoJ = anoB;
				} else {
					diaJ = 1;
					mesJ = "julho";
					anoJ = anoB;
				}
			}
			if (mesB.equals("julho")) {
				if (diaB < 31) {
					diaJ = diaB + 1;
					mesJ = mesB;
					anoJ = anoB;
				} else {
					diaJ = 1;
					mesJ = "agosto";
					anoJ = anoB;
				}
			}
			if (mesB.equals("agosto")) {
				if (diaB < 31) {
					diaJ = diaB + 1;
					mesJ = mesB;
					anoJ = anoB;
				} else {
					diaJ = 1;
					mesJ = "setembro";
					anoJ = anoB;
				}
			}
			if (mesB.equals("setembro")) {
				if (diaB < 31) {
					diaJ = diaB + 1;
					mesJ = mesB;
					anoJ = anoB;
				} else {
					diaJ = 1;
					mesJ = "outubro";
					anoJ = anoB;
				}
			}
			if (mesB.equals("outubro")) {
				if (diaB < 31) {
					diaJ = diaB + 1;
					mesJ = mesB;
					anoJ = anoB;
				} else {
					diaJ = 1;
					mesJ = "novembro";
					anoJ = anoB;
				}
			}
			if (mesB.equals("novembro")) {
				if (diaB < 30) {
					diaJ = diaB + 1;
					mesJ = mesB;
					anoJ = anoB;
				} else {
					diaJ = 1;
					mesJ = "dezembro";
					anoJ = anoB;
				}
			}
			if (mesB.equals("dezembro")) {
				if (diaB < 31) {
					diaJ = diaB + 1;
					mesJ = mesB;
					anoJ = anoB;
				} else {
					diaJ = 1;
					mesJ = "janeiro";
					anoJ = anoB + 1;
				}
			}
		}
		System.out.println(
				"No Japão são: " + horaJ + ":" + minJ + " do dia: " + diaJ + " de " + mesJ + " de " + anoJ + "!");
		teclado.close();
	}
}
