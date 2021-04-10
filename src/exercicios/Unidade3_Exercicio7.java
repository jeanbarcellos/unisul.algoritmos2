/*
Exercício 7

Slide Unidade 3 - Parte 2 - Exercício 3

3 - Faça uma sub-rotina do tipo função que retorne 
1 se o número inteiro passado por parâmetro for positivo e 
0 se o número for negativo. 

Leia um número e passe para função 
e diga se o mesmo é positivo ou negativo.

*/

import javax.swing.*;

public class Unidade3_Exercicio7 {

    public static int verificarNumero(int numero) 
    {
        if (numero > 0) {
            return 1;
        } else {
            return 0;
        }
    }
    

    public static void main(String args[]){
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog(" Informe o número: "));
        String result = "";
        
        if (verificarNumero(numero)==1){
            result = "positivo";
        } else {
            result = "negativo";
        }
        
        JOptionPane.showMessageDialog(null, "O número " + numero + " é "+ result);
        

    }
    
}
