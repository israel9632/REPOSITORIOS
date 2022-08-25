
/* 
Escreva uma função que receba uma matriz de números inteiros e devolva o maior valor presente nesta matriz;

*/
import javax.swing.JOptionPane;
public class ex2Aula1908 {
	public static void main(String[] args) {
		int nLinhas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de linhas: "));
		int nColunas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de colunas: "));
		int[][] mat = new int[nLinhas][nColunas];
		for(int i =0; i<mat.length;i++){
			for(int j=0; j<mat[0].length; j++){
				mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para a linha: " + i + " " + "coluna: " + j));
			}
		}
		function(mat);
		System.out.println("O maior valor presente na Matriz é: " + function(mat));
	}
	public static int function(int[][] a){
		int maior = 0;
		for(int i = 0; i<a.length; i++){
			for(int j =0; j<a[0].length; j++){
				if(maior < a[i][j]){
					maior = a[i][j];
				}
			}
		}
		return maior;
	}
}