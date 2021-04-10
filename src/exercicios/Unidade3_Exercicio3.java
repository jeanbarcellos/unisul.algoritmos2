/*
Exerc�cio 3

Fa�a um algoritmo que possui 
uma sub-rotina para ler uma matriz de ordem 2x4 de n�meros inteiros 
e outra sub-rotina para imprimir os elementos da matriz.

*/

import javax.swing.*;

public class Unidade3_Exercicio3 {

    // Variaveis globais (porque s�o static)

    static int matriz[][] = new int[2][4];
    static int l, c;  

    // Sub-rotina solicitar n�emros para preencher na matriz
    public static void solicitarNumeros()
    {
        for(l=0; l<2; l++){
            for(c=0; c<4; c++){
                matriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para linha "+l+" e coluna "+c+": "));
            }
        }
    }

    // Sub-rotina solicitar mostrar os elementos da matriz
    public static void exibirNumeros()
    {
        for(l=0; l<2; l++){
            for(c=0; c<4; c++){
                JOptionPane.showMessageDialog(null, "N�mero da linha "+l+" e coluna "+c+": "+ matriz[l][c]);
            }
        }
    }
    
    
    // rotina principal
    public static void main(String args[]){
        
        solicitarNumeros();
        exibirNumeros();


    }
    
}
