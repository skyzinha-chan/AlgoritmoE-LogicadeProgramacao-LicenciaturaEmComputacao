package algoritmoeLogicadeProgramacao;

public class L2_ex2 {

	public static void main(String[] args) {
		int r2 = 4 * 2;
		int r5 = 2 * 5;
		int r10 = 2 * 10;
		int r20 = 2 * 20;
		double pago = (r2 + r5 + r10 + r20) - 55.78;
		System.out.println("Troco a ser pago: " + pago);
	}
}

/*
 * Em um supermercado, o total da compra deu 55.78 reais. O cliente forneceu 4
 * notas de 2 reais, 2 notas de 5 reais, 2 notas de 10 reais, 2 notas de 20
 * reais. Utilize uma variável para cada nota, calcule a quantidade em reais que
 * o cliente forneceu e imprima o valor de troco que ele deve dar.
 */
