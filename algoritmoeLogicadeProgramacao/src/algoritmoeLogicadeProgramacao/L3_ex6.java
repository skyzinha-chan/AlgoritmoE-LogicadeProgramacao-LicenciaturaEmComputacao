package algoritmoeLogicadeProgramacao;

import java.util.Scanner;

public class L3_ex6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double kwhMes, kwhmesArcondicionado, ligadoDiariamente, diasmesLigado, tarifaPorKwh;
		double kwhPorMes, mes, realConta, porcentagem, totalDaConta;
		mes = 30;
		String mes_referencia;
		System.out.println("Qual o mês de referência? ");
		mes_referencia = teclado.nextLine();
		System.out.printf("Qual o total de kwh que foi consumido em %s ?", mes_referencia);
		kwhMes = teclado.nextDouble();
		System.out
				.println("Qual o consumo em kwh por mês do ar condicionado - valor que vem na etiqueta do INMETRO ?.");
		kwhmesArcondicionado = teclado.nextDouble();
		System.out.println("Quanto tempo ele fica ligado diariamente? ");
		ligadoDiariamente = teclado.nextDouble();
		System.out.println("Quantos dias do mês ele ficou ligado? ");
		diasmesLigado = teclado.nextDouble();
		System.out.println("Qual a tarifa de energia por kwh? ");
		tarifaPorKwh = teclado.nextDouble();
		kwhPorMes = (kwhmesArcondicionado / mes);
		kwhPorMes = (kwhPorMes * ligadoDiariamente) * diasmesLigado;
		realConta = kwhPorMes * tarifaPorKwh;
		porcentagem = (kwhPorMes * 100) / kwhMes;
		totalDaConta = kwhMes * tarifaPorKwh;
		System.out.printf(
				"Em %s o ar condicionado consumiu %2f kwh por mês, totalizando %2f reais. Equivalente a %2f do total de %2f reais de conta",
				mes_referencia, kwhPorMes, realConta, porcentagem, totalDaConta);
		teclado.close();
	}
}

/*
 * Faça um programa em Java que calcula o custo de consumo do ar condicionado e
 * qual a porcentagem dele na conta. O programa deve ler o mês de referência, o
 * consumo mensal total da residência, o consumo de quilowatt hora do ar, o
 * tempo de uso diário, a quantidade de dias utilizado e o valor da tarifa da
 * energia por kwh. E considere que todo mês tem 30 dias.
 * 
 * · Exemplo de entrada:
 * 
 * o Qual o mês de referência? Março
 * 
 * o Qual o total de kwh foi consumido em Março? 206
 * 
 * o Qual o consumo em kwh p mês do ar condicionado (valor que vem na etiqueta
 * do INMETRO)? 18
 * 
 * o Quanto tempo ele fica ligado diariamente? 6
 * 
 * o Quantos dias do mês ele ficou ligado? 25
 * 
 * o Qual a tarifa de energia por kwh? 0,78
 * 
 * 
 * 
 * · Saída esperada:
 * 
 * o Em Março o ar condicionado consumiu 90 kwh p mês, totalizando 70,2 reais.
 * Equivalente a 43% do total de 160,68 reais de conta
 */
