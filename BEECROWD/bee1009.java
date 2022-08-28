import java.util.Scanner;
public class bee1009{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		double salarioFixo, totalVendas, comissao, salarioF;
		salarioFixo = sc.nextDouble();
		totalVendas = sc.nextDouble();
		comissao = totalVendas * 0.15;
		salarioF = comissao + salarioFixo;
		System.out.printf("TOTAL = R$ %.2f\n", salarioF);
		sc.close();
	}
}