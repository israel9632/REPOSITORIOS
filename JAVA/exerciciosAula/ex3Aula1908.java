import javax.swing.JOptionPane;
/* 
 O traço de uma matriz é a soma dos elementos de sua diagonal principal. 
 Implemente uma função que receba uma matriz quadrada (número de linhas = número de colunas) e devolva o seu traço. 
 */
public class ex3Aula1908{
	public static void main(String[] args) {
		int matQuadrada = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor para a matriz quadrática: "));
		int[][] mat = new int[matQuadrada][matQuadrada];
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[0].length; j++) {
				mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Preencha a matriz: "));
			}
		}
		System.out.print("A diagonal principal é: ");
		for(int i=0; i<mat.length; i++) {
			System.out.printf(mat[i][i] + " ");
		}
	}
}

/*
solucao professor!
package aulas2022.ago19;
import javax.swing.JOptionPane;
public class Exercicio3{
	public static void main(String[] args) {
		int dimensao  = Integer.parseInt(JOptionPane.showInputDialog("Digite a dimensão da Matriz: "));
		int matriz1[][] = new int[dimensao][dimensao];
		System.out.println("A soma da diagonal principal é = " 
		+ somaDiagonalPrincipal(matriz1));
	}

	private static int somaDiagonalPrincipal(int[][] matriz1) 
	{	
		int soma = 0; //inciando a soma com 0
		for(int l=0; l<matriz1.length; l++){
			for(int c=0; c<matriz1.length; c++){
				matriz1[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
				if(l==c)//linha e coluna com mesmo índice
					soma += matriz1[l][c];
				System.out.print(matriz1[l][c] + "\t");
			}
			System.out.println();
		}return soma;
	}
}
*/