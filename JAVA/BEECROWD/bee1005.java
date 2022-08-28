import java.util.Scanner;
public class bee1005{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a, b, media;
		a = sc.nextDouble();
		b = sc.nextDouble();
		media = ((3.5 * a)+(7.5 * b)) / 11;
		System.out.printf("MEDIA = %.5f\n", media);
		}
}