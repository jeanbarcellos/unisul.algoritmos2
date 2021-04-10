/*
Exercício 5

Slide Unidade 3 - Parte 2 - Exercício 1

Faça um algoritmo que leia um número N inteiro e positivo.
O algoritmo deverá ter uma sub-rotina tipo função que irá calcular o fatorial deste número. 

A sub-rotina não deverá mostrar o resultado do cálculo, isto ficará a cargo do
algoritmo principal ela também irá receber por parâmetros os
dados necessários para o seu processamento e retornar o
valor resultante. (passagem de parâmetro por valor)

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
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog(" Informe um número: "));
        
        JOptionPane.showMessageDialog(null, "Fatorial: " + calcularFatorial(numero));
        
    }
    
}
