/*
Exerc�cio 9

Slide Unidade 3 - Parte 2 - Exerc�cio 5

5 � Fa�a uma sub-rotina que receba 
        um par�metro inteiro(peso em Kg) 
        outro double (altura em metros) 
        e uma string(para o nome). 

Calcule o �ndice de massa corporal (IMC) que � igual ao peso dividido pela altura ao quadrado.

No programa principal solicite estes par�metros ao usu�rio e chame a sub- rotina. 

A sub-rotina deve mostrar o resultado com o nome e IMC calculado (double).
*/

import javax.swing.*;

public class Unidade3_Exercicio9 {

    
    public static void calcularIMC(int peso, double altura, String nome) 
    {
        double resultado = peso / (altura * altura);
        
        JOptionPane.showMessageDialog(null, "O IMC de " + nome + " � " + resultado);
    }



    public static void main(String args[]){
        
        int peso = Integer.parseInt(JOptionPane.showInputDialog(" Informe o seu peso: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(" Informe a sua altura: "));
        String nome = JOptionPane.showInputDialog(" Informe o seu nome: ");
        
        calcularIMC(peso, altura, nome);

    }
    
}


