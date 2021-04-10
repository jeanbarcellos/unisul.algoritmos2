// BubbleSort
// 27 35 12 10 82 28 30
/*
int tamanho = 7;
int[] vetorOrdenar = {27, 35, 12, 10, 82, 28, 30};
*/

import javax.swing.*;

public class Unidade1_Exemplo5 {
	
    public static void main(String[] args) {

        int i, troca, aux, fim, a, v;
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor: "));
        int vetorOrdenar[] = new int[tamanho];
        String vetorVarredura, vetorFinal;
 
        // Aqui você pode atribuir valores
        for(i=0; i<tamanho; i++){
            vetorOrdenar[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para posição "+i+": "));
        }
        
        troca = 1;
        fim = tamanho - 1;
        v = 0; // Varredura
        
        while(troca==1){
            troca = 0; // quanto não houver mais troca a variavel retorna 0 e encerra o laço
            v++; // incrementa a varredura
			
            for(i=0; i<fim; i++){
                if(vetorOrdenar[i] > vetorOrdenar[i+1]){
                    //JOptionPane.showMessageDialog(null, "Compara par("+vetorOrdenar[i]+","+vetorOrdenar[i+1]+"): troca"); // comparacao
                    aux = vetorOrdenar[i];
                    vetorOrdenar[i]   = vetorOrdenar[i+1];
                    vetorOrdenar[i+1] = aux; //
                    troca = 1; // 
                }else{
                    //JOptionPane.showMessageDialog(null, "Compara par("+vetorOrdenar[i]+","+vetorOrdenar[i+1]+"): não troca"); // comparacao
                }

            }
			
            // Exibir como está o vetor a cada fim de varredura
            vetorVarredura = "";
            for(a=0; a<tamanho; a++){
                vetorVarredura = vetorVarredura + vetorOrdenar[a] + "  ";
            }
            JOptionPane.showMessageDialog(null, " Varredura: "+v+" \n Vetor resultante: "+vetorVarredura );
            
            fim = fim - 1; //
        }
        
        // Aqui você pode mostrar o vetor      
        vetorFinal = "";
        for(i=0; i<tamanho; i++){
            vetorFinal = vetorFinal + vetorOrdenar[i] + " ";
        }
        JOptionPane.showMessageDialog(null, " Varreduras: "+v+" \n Vetor final: "+ vetorFinal);
        
	}

}

