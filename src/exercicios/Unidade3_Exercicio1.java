/*
Exercício 1

Faça um algoritmo que possui uma sub-rotina para ler um vetor A de N elementos inteiros. 
O valor de N deverá ser lido. 
Após a utilização da sub-rotina de leitura, 
chame outra sub-rotina que mostre os elementos do vetor A.

*/

import javax.swing.*;

public class Unidade3_Exercicio1 {
    
    // Variaveis globais (porque são static)
    static int TAMANHO = 1000;
    static int numeros[] = new int[TAMANHO];
    static int i;

    
    public static void solicitarNumeros()
    {
        for (int i=0; i<TAMANHO; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número. ("+ (i+1) +" de "+TAMANHO+"):"));
        }
        
    }


    public static void mostrarNumeros()
    {
        for (i=0; i<TAMANHO; i++){
            JOptionPane.showMessageDialog(null, "O número "+ (i+1) +" de "+TAMANHO+" é: " + numeros[i]);
        }
    }


    public static void main(String args[]){
        
        TAMANHO = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do Vetor. "));
        solicitarNumeros();
        mostrarNumeros();

    }
    
}
