package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L3_ex6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double kwhMes, kwhmesArcondicionado, ligadoDiariamente, diasmesLigado, tarifaPorKwh;
		double kwhPorMes, mes, realConta, porcentagem, totalDaConta;
		mes = 30;
		String mes_referencia;
		System.out.println("Qual o m�s de refer�ncia? ");
		mes_referencia = teclado.nextLine();
		System.out.printf("Qual o total de kwh que foi consumido em %s ?", mes_referencia);
		kwhMes = teclado.nextDouble();
		System.out
				.println("Qual o consumo em kwh por m�s do ar condicionado - valor que vem na etiqueta do INMETRO ?.");
		kwhmesArcondicionado = teclado.nextDouble();
		System.out.println("Quanto tempo ele fica ligado diariamente? ");
		ligadoDiariamente = teclado.nextDouble();
		System.out.println("Quantos dias do m�s ele ficou ligado? ");
		diasmesLigado = teclado.nextDouble();
		System.out.println("Qual a tarifa de energia por kwh? ");
		tarifaPorKwh = teclado.nextDouble();
		kwhPorMes = (kwhmesArcondicionado / mes);
		kwhPorMes = (kwhPorMes * ligadoDiariamente) * diasmesLigado;
		realConta = kwhPorMes * tarifaPorKwh;
		porcentagem = (kwhPorMes * 100) / kwhMes;
		totalDaConta = kwhMes * tarifaPorKwh;
		System.out.printf(
				"Em %s o ar condicionado consumiu %2f kwh por m�s, totalizando %2f reais. Equivalente a %2f do total de %2f reais de conta",
				mes_referencia, kwhPorMes, realConta, porcentagem, totalDaConta);
		teclado.close();
	}
}

/*
 * Fa�a um programa em Java que calcula o custo de consumo do ar condicionado e
 * qual a porcentagem dele na conta. O programa deve ler o m�s de refer�ncia, o
 * consumo mensal total da resid�ncia, o consumo de quilowatt hora do ar, o
 * tempo de uso di�rio, a quantidade de dias utilizado e o valor da tarifa da
 * energia por kwh. E considere que todo m�s tem 30 dias.
 * 
 * � Exemplo de entrada:
 * 
 * o Qual o m�s de refer�ncia? Mar�o
 * 
 * o Qual o total de kwh foi consumido em Mar�o? 206
 * 
 * o Qual o consumo em kwh p m�s do ar condicionado (valor que vem na etiqueta
 * do INMETRO)? 18
 * 
 * o Quanto tempo ele fica ligado diariamente? 6
 * 
 * o Quantos dias do m�s ele ficou ligado? 25
 * 
 * o Qual a tarifa de energia por kwh? 0,78
 * 
 * 
 * 
 * � Sa�da esperada:
 * 
 * o Em Mar�o o ar condicionado consumiu 90 kwh p m�s, totalizando 70,2 reais.
 * Equivalente a 43% do total de 160,68 reais de conta
 */
