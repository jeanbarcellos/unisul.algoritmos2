/*
Exerc�cio 1

Fa�a um algoritmo que possui uma sub-rotina para ler um vetor A de N elementos inteiros. 
O valor de N dever� ser lido. 
Ap�s a utiliza��o da sub-rotina de leitura, 
chame outra sub-rotina que mostre os elementos do vetor A.

*/

import javax.swing.*;

public class Unidade3_Exercicio1 {
    
    // Variaveis globais (porque s�o static)
    static int TAMANHO = 1000;
    static int numeros[] = new int[TAMANHO];
    static int i;

    
    public static void solicitarNumeros()
    {
        for (int i=0; i<TAMANHO; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero. ("+ (i+1) +" de "+TAMANHO+"):"));
        }
        
    }


    public static void mostrarNumeros()
    {
        for (i=0; i<TAMANHO; i++){
            JOptionPane.showMessageDialog(null, "O n�mero "+ (i+1) +" de "+TAMANHO+" �: " + numeros[i]);
        }
    }


    public static void main(String args[]){
        
        TAMANHO = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do Vetor. "));
        solicitarNumeros();
        mostrarNumeros();

    }
    
}
