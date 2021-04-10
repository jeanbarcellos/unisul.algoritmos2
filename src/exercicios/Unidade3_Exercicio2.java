/*
Exerc�cio 2

Fa�a um algoritmo que possui uma sub-rotina
para ler um vetor A de N elementos reais. 
O valor de N devera ser lido. 
Ap�s a utiliza��o da sub-rotina de leitura, 
chame outra sub-rotina que mostre a soma dos elementos do vetor A.

*/

import javax.swing.*;

public class Unidade3_Exercicio2 {

    // Variaveis globais (porque s�o static)
    static int TAMANHO = 1000;
    static double numeros[] = new double[TAMANHO];
    static double soma = 0;
    static int i;

    // Sub-rotina para solicitar n�meros
    public static void solicitarNumeros()
    {
        for (int i=0; i<TAMANHO; i++) {
            numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero. ("+ (i+1) +" de "+TAMANHO+"):"));
        }
    }

    // Sub-rotina para somar n�meros e exibir
    public static void somarNumeros()
    {
        for (i=0; i<TAMANHO; i++){
            soma = soma + numeros[i];
        }
        
        JOptionPane.showMessageDialog(null, "A soma dos n�emros �: "+ soma);
    }    

    // rotina principal
    public static void main(String args[]){
        
        TAMANHO = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do Vetor. "));
        solicitarNumeros();
        somarNumeros();

    }
    
}
