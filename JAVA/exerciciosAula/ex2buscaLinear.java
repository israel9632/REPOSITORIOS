import javax.swing.JOptionPane;

public class ex02{
    public static void main(String[] args){
        int tamVet = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor: "));
        int[] vet = new int[tamVet];
        System.out.println("Preencha o vetor: ");
        for(int i=0; i<vet.length; i++){
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor para o indice" + i));
        }
        int a = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
        int chama = encontra(vet,a,b);
    }
    public static int encontra(int[] n, int a, int b){
        int retorno = 0;
        for(int i=0; i<n.length; i++){
            
        }
        
        return retorno;
    }
    
}

