/*
Exercício 8

Slide Unidade 3 - Parte 2 - Exercício 4

4 - Faça uma sub-rotina do tipo função que receba dois números inteiros positivos por parâmetro 
e retorne a soma dos N números existentes entre eles. 

Faça um algoritmo para utilizar a função e mostrar a soma.

*/

import javax.swing.*;

public class Unidade3_Exercicio8 {

    
    public static int somarIntervalo(int numero1, int numero2) 
    {
        int resultado = 0;
        
        for (int i=numero1; i<=numero2; i++) {
            resultado = resultado + i;
        }
        
        return resultado;
    }



    public static void main(String args[]){
        
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(" Informe o primeiro número: "));
        
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(" Informe o último número: "));
        
        JOptionPane.showMessageDialog(null, "Soma do intevalo: " + somarIntervalo(numero1, numero2));

    }
    
}
