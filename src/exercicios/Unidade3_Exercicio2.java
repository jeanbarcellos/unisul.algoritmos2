/*
Exercício 2

Faça um algoritmo que possui uma sub-rotina
para ler um vetor A de N elementos reais. 
O valor de N devera ser lido. 
Após a utilização da sub-rotina de leitura, 
chame outra sub-rotina que mostre a soma dos elementos do vetor A.

*/

import javax.swing.*;

public class Unidade3_Exercicio2 {

    // Variaveis globais (porque são static)
    static int TAMANHO = 1000;
    static double numeros[] = new double[TAMANHO];
    static double soma = 0;
    static int i;

    // Sub-rotina para solicitar números
    public static void solicitarNumeros()
    {
        for (int i=0; i<TAMANHO; i++) {
            numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe um número. ("+ (i+1) +" de "+TAMANHO+"):"));
        }
    }

    // Sub-rotina para somar números e exibir
    public static void somarNumeros()
    {
        for (i=0; i<TAMANHO; i++){
            soma = soma + numeros[i];
        }
        
        JOptionPane.showMessageDialog(null, "A soma dos núemros é: "+ soma);
    }    

    // rotina principal
    public static void main(String args[]){
        
        TAMANHO = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do Vetor. "));
        solicitarNumeros();
        somarNumeros();

    }
    
}
