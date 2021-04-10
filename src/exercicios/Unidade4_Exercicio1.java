import java.io.*;
import javax.swing.*;

public class Unidade4_Exercicio1{

    static final String NOME_ARQUIVO = "AGENDA.TXT";

    public static void main(String args[]) {

       try{
            BufferedWriter agenda = null;
            String adicionar = JOptionPane.showInputDialog("Adicionar novos dados no arquivo existente? (S/N)");

            if (adicionar.equalsIgnoreCase("S")) {
                //Abre o arquivo completando o que ja existe nele
                 agenda = new BufferedWriter(new FileWriter(new File(NOME_ARQUIVO),true));
            } else {
                 //Abre o arquivo zerando o seu conteudo
                 agenda = new BufferedWriter(new FileWriter(new File(NOME_ARQUIVO)));
            }

            String nome = JOptionPane.showInputDialog("Digite um nome ou ENTER para sair");
            while (!nome.equals("")){
                 agenda.write(nome);
                 agenda.newLine();
                 nome = JOptionPane.showInputDialog("Digite um nome ou ENTER para sair");
            }
            agenda.close();

          } catch (IOException e){
            JOptionPane.showMessageDialog(null, "Não abriu arquivo para escrita!");
      }
    }
}




