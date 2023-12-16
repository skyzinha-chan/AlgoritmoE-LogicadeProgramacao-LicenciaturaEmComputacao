package algoritmoeLogicadeProgramacao;

public class L2_ex3 {

	public static void main(String[] args) {
		// hr transforma em hora
		int hr = 3666 / 3600;
		// mm transforma em minuto
		int mm = (3666 % 3600) / 60;
		// ss tranforma em segundos
		int ss = (3666 % 3600) % 60;
		System.out.println(hr + " horas " + mm + " minutos " + ss + " segundos");

	}
}
/*
 * Fa�a um c�digo em Java que dado um tempo de dura��o de um evento em uma
 * f�brica expressa em segundos e mostre-o expresso em horas, minutos e
 * segundos. O tempo foi de 3666 segundos. A sa�da dever� ser: 1 horas 1 minutos
 * 6 segundos
 */
