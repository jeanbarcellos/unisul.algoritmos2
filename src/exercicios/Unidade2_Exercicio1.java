/*
Exercício 1 

Faça um programa que possua uma constante para o
tamanho do vetor que será utilizado e 
uma classe interna chamada Pessoa para manipular os seguintes dados de cada pessoa.

nome(String),
altura(Double),
idade (int),
profissao(String)

Construa um vetor do tipo Pessoa de tamanho 3, 
solicite todos os dados para o usuário 
e depois mostre o resultado de cadapessoa.

*/
 
import javax.swing.*;

// Faça um programa que possua 
public class Unidade2_Exercicio1{
    
    // ... uma constante para o tamanho do vetor que será utilizado ...
    static int TAMANHO = 3;
    
    // ... e uma classe interna chamada Pessoa para manipular os seguintes dados de cada pessoa.
    static class Pessoa {
        String nome;
        double altura;
        int idade;
        String profissao;
    }

    public static void main(String args[]){
       
        // Construa um vetor do tipo Pessoa de tamanho 3, ...
        Pessoa pessoas[] = new Pessoa[TAMANHO];
        int i;
        
        // Sicite todos os dados para o usuário ..
        for (i=0; i<TAMANHO; i++) {
        pessoas[i] = new Pessoa();
        pessoas[i].nome      = JOptionPane.showInputDialog("Informe o Nome para a pessoa "+ i + ": ");
        pessoas[i].altura    = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura de "+ pessoas[i].nome + ": "));
        pessoas[i].idade     = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade de "+ pessoas[i].nome + ": "));
        pessoas[i].profissao = JOptionPane.showInputDialog("Informe a profissão de "+ pessoas[i].nome + ": ");
        }
        
        // montar as mensagens separadas por pessoa
        String pessoas_txt[] = new String[TAMANHO];        
        
        for (i=0; i<TAMANHO; i++) {
            pessoas_txt[i] = "";
            pessoas_txt[i] = pessoas_txt[i] + 
                "Pessoa " + i + ": \n"+
                "Nome: " + pessoas[i].nome + "\n" +
                "Altura: " + pessoas[i].altura + "\n" +
                "Idade: " + pessoas[i].idade + "\n" +
                "Profissão: " + pessoas[i].profissao + "\n\n";
        }

        //  ... e depois mostre o resultado de cada pessoa.
        for (i=0; i<TAMANHO; i++) {
            JOptionPane.showMessageDialog(null, pessoas_txt[i]); 
        }        

    }

}