/*
Exercício 9

Slide Unidade 3 - Parte 2 - Exercício 5

5 – Faça uma sub-rotina que receba 
        um parâmetro inteiro(peso em Kg) 
        outro double (altura em metros) 
        e uma string(para o nome). 

Calcule o índice de massa corporal (IMC) que é igual ao peso dividido pela altura ao quadrado.

No programa principal solicite estes parâmetros ao usuário e chame a sub- rotina. 

A sub-rotina deve mostrar o resultado com o nome e IMC calculado (double).
*/

import javax.swing.*;

public class Unidade3_Exercicio9 {

    
    public static void calcularIMC(int peso, double altura, String nome) 
    {
        double resultado = peso / (altura * altura);
        
        JOptionPane.showMessageDialog(null, "O IMC de " + nome + " é " + resultado);
    }



    public static void main(String args[]){
        
        int peso = Integer.parseInt(JOptionPane.showInputDialog(" Informe o seu peso: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(" Informe a sua altura: "));
        String nome = JOptionPane.showInputDialog(" Informe o seu nome: ");
        
        calcularIMC(peso, altura, nome);

    }
    
}


