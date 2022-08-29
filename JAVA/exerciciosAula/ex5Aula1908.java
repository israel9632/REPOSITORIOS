import javax.swing.JOptionPane;
/* 
Escreva uma função que recebe por parâmetros duas matrizes, A e B, com n linhas e m colunas.
Sua função deve calcular a  soma de A + B e armazena na matriz C e ao final retornar a matriz C.
*/
public class ex5Aula1908 {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Informa o tamanho da Matriz: "));
		int[][] matA = new int[n][n];
		int[][] matB = new int[n][n];
		int[][] matC = new int[n][n];
		preencher(matA);
		preencher(matB);
		matC = somar(matA, matB);
		for(int i=0; i<matA.length; i++) {
			for(int j=0; j<matA[0].length; j++) {
				System.out.print(matC[i][j] + " ");
			}
		}
	}
	// FUNÇÃO QUE PREENCHE AS MATRIZES
	public static int[][] preencher(int[][] a) {
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a[0].length; j++){
				a[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Preenchar o vetor: "));
			}
		}
		System.out.printf("VETOR PREENCHIDO\n");
		return a;	
	}
	// FUNCAO PARA SOMAR MATRIZES A E B, E GUARDAR O VALOR EM OUTRA MATRIZ
	public static int[][] somar(int[][] a, int[][] b){
		int[][] soma = new int [a.length][a.length];
		for(int i = 0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				soma[i][j] = a[i][j] + b[i][j];
			}
		}
		return soma;
	}
}
