/**-------------------------------------------------*
 *     SENAC - TADS - ALGORITMOS E PROGRAMAÇÃO 2    *                
 *                ADO 01, EXERCICIO 07              *
 * 												---												*
 * 		ALUNO: ISRAEL DA SILVA SANTOS									*
 * 		PROF: MARCOS MONTEIRO													*
 *--------------------------------------------------*/

import javax.swing.JOptionPane;
public class ado1 {
	public static void main(String[] args) {
		int tMat = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho da Matriz: "));
		int[][] matA = new int[tMat][tMat];
		for (int i = 0; i < matA.length; i++) {
			for (int j = 0; j < matA[0].length; j++) {
				matA[i][j] = Integer
						.parseInt(JOptionPane.showInputDialog("Preencha a Matriz: POSIÇÂO: " + i + " " + j));
			}
		}
		boolean verificador = qMagico(matA);
		if (verificador != true) {
			System.out.printf("A Matriz informada, não é um QUADRADO MÁGICO! %b", verificador);
		} else {
			System.out.printf("A Matriz informada, é um QUADRADO MÁGICO! %b", verificador);
		}
	}
	public static boolean qMagico(int[][] a) {
		int resultadoSoma = 0;
		// verifica primeira linha
		for (int i = 0; i < a.length; i++) {
			resultadoSoma += a[i][0];
		}
		// verifica linha completa
		for (int i = 0; i < a.length; i++) {
			int somaLinha = 0;
			for (int j = 0; j < a[0].length; j++) {
				somaLinha += a[0][j];
			}
			if (somaLinha != resultadoSoma) {
				return false;
			}
		}
		// verifica coluna completa
		for (int i = 0; i < a.length; i++) {
			int somaColuna = 0;
			for (int j = 0; j < a[0].length; j++) {
				somaColuna += a[j][0];
			}
			if (somaColuna != resultadoSoma) {
				return false;
			}
		}
		// diagonal principal e secundaria
		int somaDiagonal = 0;
		int somaDiagonal2 = 0;
		for (int i = 0; i < a.length; i++) {
			somaDiagonal += a[i][i];
		}
		if (somaDiagonal != resultadoSoma) {
			return false;
		}
		int j = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			somaDiagonal2 += a[i][j];
			j--;
		}
		if (somaDiagonal2 != resultadoSoma) {
			return false;
		}
		return true;
	}
}