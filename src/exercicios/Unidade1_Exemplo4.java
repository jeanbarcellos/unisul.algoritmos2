import javax.swing.*;

public class Unidade1_Exemplo4 {
	
    public static void main(String[] args) {
		
		int i, flag;		
		int numElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de pessoas a ser cadastrado "));
		String vetorPesquisado[] = new String[numElementos];
		
		for(i=0; i<numElementos; i++){
			vetorPesquisado[i] = JOptionPane.showInputDialog("Digite o nome para cadastro");
		}
		
		String elementoProcurado = JOptionPane.showInputDialog("Digite o nome a ser procurado");
		
		flag = 0;
		
		for(i=0; i<numElementos;i++){
			if(vetorPesquisado[i].equalsIgnoreCase(elementoProcurado)){
				JOptionPane.showMessageDialog(null,"O valor procurado foi encontrado na posi��o "+i);
				flag = 1;
			}
		}
		
		if(flag<=0){
			JOptionPane.showMessageDialog(null, "O nome n�o foi encontrado.");
		}
		
	}

}

// equalsIgnoreCase 