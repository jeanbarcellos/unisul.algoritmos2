/*
Exercício 6

Slide Unidade 3 - Parte 2 - Exercício 2

Faça um algoritmo que possui uma sub-rotina tipo função
que calcule um valor A inteiro elevado a um expoente B também inteiro. 

Não usar A**B e sim uma estrutura de repetição. 

A sub-rotina não deverá mostrar o resultado do calculo, isto ficará a cargo do algoritmo principal.
(use passagem de parâmetro por referência)

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
        
        numero = Integer.parseInt(JOptionPane.showInputDialog(" Informe o número: "));
        
        expoente = Integer.parseInt(JOptionPane.showInputDialog(" Informe o expoente: "));
        
        JOptionPane.showMessageDialog(null, "Resultado: " + calcularExpoente());

    }
    
}
