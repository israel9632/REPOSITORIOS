import java.util.Scanner;
public class bee1010{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double codigo1, peca1, valor1, total1;
		double codigo2, peca2, valor2, total2, r;
		codigo1 = sc.nextDouble();
		peca1 = sc.nextDouble();
		valor1 = sc.nextDouble();
		codigo2 = sc.nextDouble();
		peca2 = sc.nextDouble();
		valor2 = sc.nextDouble();
		total1 = peca1 * valor1;
		total2 = peca2 * valor2;
		r = total1 + total2;
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", r);
		sc.close();
	}
}