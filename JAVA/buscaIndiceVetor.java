import javax.swing.JOptionPane;
public class buscaIndiceVetor {
	public static void main(String[] args) {
		int tamanho  = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));
		int vetor[] = new int[tamanho];
		
		preencherVetor(vetor);
		
		int procurado  = Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser procurado no vetor: "));
		int encontrado = buscaLinear(vetor, procurado);
		
		if(encontrado==-1)
		{
			JOptionPane.showMessageDialog(null, "Número " + procurado + " não encontrado no vetor!");
		}
		else
			JOptionPane.showMessageDialog(null, "Número " + procurado + " encontrado no índice: " + encontrado);
	}
	private static void preencherVetor(int[] vetor) {
		for(int i=0 ; i<vetor.length ; i++)
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º número: "));
		
	}
	public static int buscaLinear(int v[], int x) {
	    for(int i = 0; i < v.length; i++){
	       if(v[i] == x)
	        return i;
	    }
	    return -1;
	}

}
