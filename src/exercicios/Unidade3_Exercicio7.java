/*
Exerc�cio 7

Slide Unidade 3 - Parte 2 - Exerc�cio 3

3 - Fa�a uma sub-rotina do tipo fun��o que retorne 
1 se o n�mero inteiro passado por par�metro for positivo e 
0 se o n�mero for negativo. 

Leia um n�mero e passe para fun��o 
e diga se o mesmo � positivo ou negativo.

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
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog(" Informe o n�mero: "));
        String result = "";
        
        if (verificarNumero(numero)==1){
            result = "positivo";
        } else {
            result = "negativo";
        }
        
        JOptionPane.showMessageDialog(null, "O n�mero " + numero + " � "+ result);
        

    }
    
}
