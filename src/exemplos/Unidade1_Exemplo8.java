import javax.swing.*;

public class Unidade1_Exemplo8 {
    
    public static void main(String args[]){
    
        double A[][] = new double[3][3]; // Matriz de Dist�ncias
        int i, j;

        // Cria as legendas da matriz
        String linhas_A[] = new String [3];
        linhas_A[0] = "Florian�polis";
        linhas_A[1] = "Blumenau";
        linhas_A[2] = "Lages";

        String cols_A[] = new String [3];
        cols_A[0] = "Florian�polis";
        cols_A[1] = "Blumenau";
        cols_A[2] = "Lages";


        // Dist�ncias partindo de Florian�polis
        A[0][0] = 0;   // Florian�polis -> Florian�polis
        A[0][1] = 200; // Florian�polis -> Blumenau
        A[0][2] = 300; // Florian�polis -> Lages

        // Dist�ncias partindo de Blumenau
        A[1][0] = 200; // Blumenau -> Florian�polis
        A[1][1] = 0;   // Blumenau -> Blumenau
        A[1][2] = 500; // Blumenau -> Lages

        // Dist�ncias partindo de Lages
        A[2][0] = 300; // Lages -> Florian�polis
        A[2][1] = 500; // Lages -> Blumenau
        A[2][2] = 0;   // Lages -> Lages

        // Mostra a dist�ncia entre todas as cidades
        for(i=0; i<3; i++){
            for (j=0; j<3; j++){
                JOptionPane.showMessageDialog(null, "A dist�ncia entre: " + linhas_A[i] + " e "+ cols_A[j] + " �: " + A[i][j]);
            }
        }

    
    }
}