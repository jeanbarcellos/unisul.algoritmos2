/*
Exercício 4

Faça um algoritmo para armazenar na memória as informações de N alunos, 
  tais como: Nome, idade e sexo.
Construa um menu de opções para chamar sub-rotinas que
deverão executar as seguintes operações:
 a) Ler as informações de um aluno;
 b) Emitir um relatório dos dados ordenado crescentemente pelo Nome;
 c) Emitir um relatório ordenado dos dados decrescentemente pela idade;
 d) Informar qual o percentual de alunos do sexo feminino.

*/

import javax.swing.*;
import java.util.*;

public class Unidade3_Exercicio4 {

    // Classe Aluno
    public static class Aluno 
    {
        String nome;
        int idade;
        char sexo; // trocar o String pra char
        
    }
    
    // Variáveis globais
    static int TAMANHO = 3; // Pode ser InputDialog
    static Aluno alunos[] = new Aluno[TAMANHO]; // Vetor tipo aluno
    static String relatorio[] = new String[TAMANHO]; // Relatórios
    static int i;

    // a) Ler as informações de um aluno;
    public static void solicitarAluno()
    {
        for (i = 0; i < TAMANHO; i++) {
            alunos[i] = new Aluno();
            alunos[i].nome = JOptionPane.showInputDialog(" Informe o nome do aluno. ");
            alunos[i].idade = Integer.parseInt(JOptionPane.showInputDialog(" Informe a idade de " + alunos[i].nome));
            alunos[i].sexo = JOptionPane.showInputDialog(" Informe o sexo de " + alunos[i].nome + ": M - Masculino | F - Feminino").charAt(0);
        }
    }

    
    // b) Emitir um relatório dos dados ordenado crescentemente pelo Nome
    public static void exibirRelatorioAlunos()
    {
        for (i = 0; i < TAMANHO; i++) {
            relatorio[i] = "Ordenado ascendentemente pelo nome"+
                "Nome: " + alunos[i].nome + "\n"+
                "Idade: " + alunos[i].idade + "\n"+
                "Sexo: " + alunos[i].sexo + "\n";            
        }
        
        Arrays.sort(relatorio);

        JOptionPane.showMessageDialog(null, "2) Emitir um relatório dos dados ordenado crescentemente pelo Nome");
  
        for (i = 0; i < TAMANHO; i++) {
            JOptionPane.showMessageDialog(null, relatorio[i]);
        }

    }
    

    // c) Emitir um relatório ordenado dos dados decrescentemente pela idade
    public static void exibirRelatorioAlunos2()
    {
        int i, j;
        Aluno mais_velho; // aux
        Aluno alunos_ord[] = new Aluno[TAMANHO]; // crio um array do tipo Aluno       
        alunos_ord = alunos; // Clona o array de alunos para nova variavel para que seja feita a alteração
        
        // alunos_ord.length tamanho do array
        // 3, 2, 1
        for (i=alunos_ord.length; i>=1; i--) 
        {
            // 1, 2, 3
            for (j=1; j<i; j++) 
            {
                JOptionPane.showMessageDialog(null, "j:"+j+"  |  i:"+i); // testar
                
                if (alunos_ord[j].idade > alunos_ord[j-1].idade) {
                    mais_velho = alunos_ord[j];       
                    alunos_ord[j] = alunos_ord[j-1];
                    alunos_ord[j-1] = mais_velho;
                }
            }
        }

        // Cria o relatório ordenado
        for(i=0; i<TAMANHO; i++){
            relatorio[i] = " Ordenado decrescentemente por idade. \n"+
                "Nome: " + alunos_ord[i].nome + "\n"+ 
                "Idade: " + alunos_ord[i].idade + "\n"+
                "Sexo: " + alunos_ord[i].sexo + "\n";
        }

        // Mostra ordenado
        for(i=0; i<TAMANHO; i++){
            JOptionPane.showMessageDialog(null, relatorio[i]);
        }
        
   }
    

    // c) Informar qual o percentual de alunos do sexo feminino
    public static void exibirPorcentagemFeminino()
    {
        int feminino_qtd = 0;
        double feminino_percet = 0;
        
        for (i=0; i <TAMANHO; i++) {
            if(alunos[i].sexo == 'F' || alunos[i].sexo == 'f'){
                feminino_qtd++;
            }
        }
        
        feminino_percet = (double)(feminino_qtd * 100) / TAMANHO;
       
        JOptionPane.showMessageDialog(null, "d) Informar qual o percentual de alunos do sexo feminino.\n\n" + feminino_percet + " %");
    }
    

    // rotina principal
    public static void main(String args[]){
        
        int opcao = 1;
        
        while (opcao > 0 && opcao < 5) {
        
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                " MENU  \n"+
                "1) Ler as informações de um aluno;\n"+
                "2) Emitir um relatório dos dados ordenado crescentemente pelo Nome;\n"+
                "3) Emitir um relatório ordenado dos dados decrescentemente pela idade;\n"+
                "4) Informar qual o percentual de alunos do sexo feminino.\n"+
                "5) Sair"));
            
            switch (opcao) {
                case 1 :
                    solicitarAluno();
                break;
                case 2 :
                    exibirRelatorioAlunos();
                break;
                case 3 :
                    exibirRelatorioAlunos2();
                break;
                case 4 :
                    exibirPorcentagemFeminino();
                break;
            }
        }
    }
    
}
