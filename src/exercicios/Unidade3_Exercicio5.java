/*
Exerc�cio 5

Slide Unidade 3 - Parte 2 - Exerc�cio 1

Fa�a um algoritmo que leia um n�mero N inteiro e positivo.
O algoritmo dever� ter uma sub-rotina tipo fun��o que ir� calcular o fatorial deste n�mero. 

A sub-rotina n�o dever� mostrar o resultado do c�lculo, isto ficar� a cargo do
algoritmo principal ela tamb�m ir� receber por par�metros os
dados necess�rios para o seu processamento e retornar o
valor resultante. (passagem de par�metro por valor)

*/

import javax.swing.*;

public class Unidade3_Exercicio5 {

    public static int calcularFatorial(int numero)
    {
        int fatorial = 1;
        int i;
        
        for (i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        
        return fatorial;
    }


    public static void main(String args[]){
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog(" Informe um n�mero: "));
        
        JOptionPane.showMessageDialog(null, "Fatorial: " + calcularFatorial(numero));
        
    }
    
}
