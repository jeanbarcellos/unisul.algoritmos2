import javax.swing.*;

public class Unidade1_Exemplo3 {

    public static void main(String[] args) {

		int i;
		String nomes[] = new String[20];
		nomes[0] = "Unisul";
		nomes[1] = "Aluno";
		nomes[2] = "Sistema";

		for(i=0; i<3; i++){
			JOptionPane.showMessageDialog(null, "O nome na posi��o "+i+" � "+ nomes[i]);
		}

	}

}
