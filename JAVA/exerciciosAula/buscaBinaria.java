import javax.swing.JOptionPane;

public class buscaBinaria {
    public static void main(String[] args){
        int tVet = Integer.parseInt(JOptionPane.showInputDialog("Infome o tamanho do vetor: "));
        int[] vetA = new int[tVet];
        JOptionPane.showMessageDialog(null, "Preencha o vetor: ");
        for(int i=0; i<vetA.length; i++){
            vetA[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para a posição" + i + "do vetor!"));
        }
        int nProcurado = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor procurado no vetor? "));
        int buscaVet = buscaBinaria(vetA, nProcurado);
        if(buscaVet == -1){
            System.out.println("Não foi encontrado o valor procurado; " + buscaVet);
        }
        else{
            System.out.println("Foi encontrado o valor procurado: " + buscaVet);
        }
    }
    public static int buscaBinaria(int[]a, int b){
        int i=0, f=a.length-1, m;
        while(i<=f){
            m = (i+f) / 2;
            if(a[m] == b){
                return m;
            }
            if(b< a[m]){
                f = m-1;
            }
            else{
                i = m + 1;
            }
        }
        return -1;
    }
}
