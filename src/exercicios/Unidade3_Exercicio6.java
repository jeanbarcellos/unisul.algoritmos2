/*
Exerc�cio 6

Slide Unidade 3 - Parte 2 - Exerc�cio 2

Fa�a um algoritmo que possui uma sub-rotina tipo fun��o
que calcule um valor A inteiro elevado a um expoente B tamb�m inteiro. 

N�o usar A**B e sim uma estrutura de repeti��o. 

A sub-rotina n�o dever� mostrar o resultado do calculo, isto ficar� a cargo do algoritmo principal.
(use passagem de par�metro por refer�ncia)

*/

import javax.swing.*;

public class Unidade3_Exercicio6 {

    static int numero = 0;
    static int expoente = 0;
    
    public static int calcularExpoente()
    {
        int resultado = 1;
        
        for (int i=1; i<=expoente; i++) {
            resultado = resultado * numero;
        }
        
        return resultado;
    }


    public static void main(String args[]){
        
        numero = Integer.parseInt(JOptionPane.showInputDialog(" Informe o n�mero: "));
        
        expoente = Integer.parseInt(JOptionPane.showInputDialog(" Informe o expoente: "));
        
        JOptionPane.showMessageDialog(null, "Resultado: " + calcularExpoente());

    }
    
}
