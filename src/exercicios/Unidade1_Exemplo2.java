import javax.swing.*;

public class Unidade1_Exemplo2 {
	
    public static void main(String[] args) {
		
		int i;
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
		int X[] = new int[n]; // declarando o vetor
		
		for(i=0; i<n; i++){
			X[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
		}
		
	}

}
