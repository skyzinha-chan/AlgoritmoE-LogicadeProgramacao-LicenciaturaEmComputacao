package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L4_ex1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int pao;
		double atacado, varejo, valor_total;
		varejo = 0.20;
		atacado = 0.15;
		System.out.println("Quantos pães deseja? ");
		pao = teclado.nextInt();
		if (pao <= 12) {
			valor_total = pao * varejo;
		} else {
			valor_total = pao * atacado;
		}
		System.out.println(pao + " Pães custará R$ " + valor_total);
		teclado.close();
	}
}
