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
 * Faça um código em Java que dado um tempo de duração de um evento em uma
 * fábrica expressa em segundos e mostre-o expresso em horas, minutos e
 * segundos. O tempo foi de 3666 segundos. A saída deverá ser: 1 horas 1 minutos
 * 6 segundos
 */
