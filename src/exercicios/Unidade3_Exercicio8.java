/*
Exerc�cio 8

Slide Unidade 3 - Parte 2 - Exerc�cio 4

4 - Fa�a uma sub-rotina do tipo fun��o que receba dois n�meros inteiros positivos por par�metro 
e retorne a soma dos N n�meros existentes entre eles. 

Fa�a um algoritmo para utilizar a fun��o e mostrar a soma.

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
        
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(" Informe o primeiro n�mero: "));
        
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(" Informe o �ltimo n�mero: "));
        
        JOptionPane.showMessageDialog(null, "Soma do intevalo: " + somarIntervalo(numero1, numero2));

    }
    
}
