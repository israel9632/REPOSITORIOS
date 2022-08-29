import javax.swing.JOptionPane;

/* 
Dizemos que uma matriz quadrada A é simétrica se e somente se A[i][j] = A[j][i]. 
Implemente uma função para verificar se uma matriz de números inteiros é simétrica, se a matriz for simétrica sua função retorna true e false caso contrário.  

 */

public class ex4Aula1908 {

	public static void main(String[] args) {
		int matQuadradica = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho para Linhas e Colunas: "));
		int[][] mat = new int[matQuadradica][matQuadradica];
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length;j++) {
				mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Preencha a matriz: "));
			}
		}
		System.out.println(function(mat));
	}
	public static boolean function(int[][] a){
		boolean b = true;
		for(int i = 0; i<a.length; i++) {
			for(int j =0; j<a[0].length; j++) {
				if(a[i][j] != a[j][i]) {
					b = false;
					return b;
				}
			}
		}
		return b;
	}
}