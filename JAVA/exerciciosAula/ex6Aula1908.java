import javax.swing.JOptionPane;
/* 
Dadas duas matrizes A e B. Obter a matriz C onde C = AxB.
*/
public class ex6Aula1908 {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Informa o tamanho da Matriz: "));
		int[][] matA = new int[n][n];
		int[][] matB = new int[n][n];
		int[][] matC = new int[n][n];	
		preencher(matA);
		preencher(matB);
		matC = multi(matA, matB);
		for(int i=0; i<matA.length; i++) {
			for(int j=0; j<matA[0].length; j++) {
				System.out.print(matC[i][j] + " ");
			}
		}
	}
	public static int[][] preencher(int[][] a){
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				a[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Prencha a matriz na Linha: " + i + " Coluna: " + j));
			}
		}
		System.out.println("Matriz Preenchida");
		return a;
	}
	public static int[][] multi(int[][] a, int[][] b){
		int[][] c = new int[a.length][a[0].length]; 
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				c[i][j] = a[i][j] * b[i][j];
			}
		}
		return c;
	}
}