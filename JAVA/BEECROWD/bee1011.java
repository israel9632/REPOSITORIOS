import java.util.Scanner;
public class bee1011{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159, R;
		R = sc.nextDouble();
		double elevado3 = R * R * R;
		double v = (4.0/3.0) * pi * elevado3;
		System.out.printf("VOLUME = %.3f%n", v);
	}
}