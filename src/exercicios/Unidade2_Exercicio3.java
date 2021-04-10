/*
Exercício 3

Faça um algoritmo que:

a) Defina um Registro para aluno tendo os seguintes campos: Nome, Semestre, Sala, Curso, Notas(total de seis)
b) Ler as informações, descritas acima.
c) Ampliar a definição anterior, acrescentando a definição de um outro campo(Endereço) que será também um Registro, o qual terá os seguintes campos: Rua, Numero, Bairro, Cidade, Estado, CEP
d) Ler as informações de um aluno, junto com o endereço descrito acima.
e) Declare um Vetor de 100 posições de alunos, os campos serão os mesmos descritos nos itens anteriores.
f) Ler as informações de N alunos
g) Ordene crescentemente pelo Nome, os alunos. Mostre os dados antes e depois da ordenação.

*/

import javax.swing.*;
import java.util.Arrays;

public class Unidade2_Exercicio3 {

    /*
     * a) Defina um Registro para aluno tendo os seguintes campos: 
     * Nome, Semestre, Sala, Curso, Notas(total de seis)
     */
    static class Aluno 
    {
        String nome;
        int semestre;
        int sala;
        String curso;
        double notas[] = new double[6];
        Endereco endereco = new Endereco(); // c) Ampliar ... acrescentando a definição de um outro campo(Endereço) Relação de Composição
    }
    
    /*
     * c) Ampliar a definição anterior, acrescentando a definição de um outro campo(Endereço) 
     * que será também um Registro, o qual terá os seguintes campos: 
     * Rua, Numero, Bairro, Cidade, Estado, CEP
     */
    static class Endereco
    {
        String rua;
        int numero;
        String bairro;
        String cidade;
        String estado;
        String cep;
    }

    public static void main(String args[]) 
    {
        /*
         * e) Declare um Vetor de 100 posições de alunos, os campos serão os mesmos descritos nos itens anteriores.
         */
        Aluno alunos[] = new Aluno[100]; // trocar pra 100
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de alunos: "));
        int i = 0;
        int j = 0;
        
        for (i=0; i<quantidade; i++) 
        {
            alunos[i] = new Aluno();
            alunos[i].nome     = JOptionPane.showInputDialog("Informe o nome do aluno: ");
            alunos[i].semestre = Integer.parseInt(JOptionPane.showInputDialog("Informe o semeste de "+ alunos[i].nome +": "));
            alunos[i].sala     = Integer.parseInt(JOptionPane.showInputDialog("Informe a sala de "+ alunos[i].nome +": "));
            alunos[i].curso    = JOptionPane.showInputDialog("Informe o nome do curso de "+ alunos[i].nome +": ");
            
            for (j=0; j<6; j++) 
            {
                alunos[i].notas[j] = Double.parseDouble(JOptionPane.showInputDialog("Informe a "+ (j+1) +"a nota de "+ alunos[i].nome +": "));
            }
            
            alunos[i].endereco.rua    = JOptionPane.showInputDialog("Endereço: Informe a rua de "+ alunos[i].nome +": ");
            alunos[i].endereco.numero = Integer.parseInt(JOptionPane.showInputDialog("Endereço: Informe o número de "+ alunos[i].nome +": "));
            alunos[i].endereco.bairro = JOptionPane.showInputDialog("Endereço: Informe o bairro de "+ alunos[i].nome +": ");
            alunos[i].endereco.cidade = JOptionPane.showInputDialog("Endereço: Informe a cidade de "+ alunos[i].nome +": ");
            alunos[i].endereco.estado = JOptionPane.showInputDialog("Endereço: Informe a estado de "+ alunos[i].nome +": ");
            alunos[i].endereco.cep    = JOptionPane.showInputDialog("Endereço: Informe a cep de "+ alunos[i].nome +": ");
        }
        
        
        // g) Ordene crescentemente pelo Nome, os alunos. Mostre os dados antes e depois da ordenação.
        
        // g) ... Mostre os dados antes ...
        String dados[] = new String[quantidade];
        
        for (i=0; i<quantidade; i++) 
        {
            dados[i] = "None: "+ alunos[i].nome +"\n"+
                "Semestre: "+ alunos[i].semestre +"\n"+
                "Sala: "+ alunos[i].sala +"\n"+
                "Curso: "+ alunos[i].curso +"\n"+
                "Notas: \n"+
                "   Nota 1: "+ alunos[i].notas[0] +"\n"+
                "   Nota 2: "+ alunos[i].notas[1] +"\n"+
                "   Nota 3: "+ alunos[i].notas[2] +"\n"+
                "   Nota 4: "+ alunos[i].notas[3] +"\n"+
                "   Nota 5: "+ alunos[i].notas[4] +"\n"+
                "   Nota 6: "+ alunos[i].notas[5] +"\n"+
                "Endereço: \n"+
                "   Rua: "+ alunos[i].endereco.rua +"\n"+
                "   Número: "+ alunos[i].endereco.numero +"\n"+
                "   Bairro: "+ alunos[i].endereco.bairro +"\n"+
                "   Cidade: "+ alunos[i].endereco.cidade +"\n"+
                "   Estado: "+ alunos[i].endereco.estado +"\n"+
                "   CEP: "+ alunos[i].endereco.cep ;
        }
        
        for (i=0; i<quantidade; i++) 
        {
            JOptionPane.showMessageDialog(null, dados[i]);
        }
        
        
        // g) Ordene crescentemente pelo Nome
        String dados_depois[] = new String[quantidade];
        
        Arrays.sort(dados);
        
        dados_depois = dados;

       
        // g) Mostre os dados ... depois da ordenação.
        
        for (i=0; i<quantidade; i++) 
        {
            JOptionPane.showMessageDialog(null, dados_depois[i]);
        }
    }
    
}
