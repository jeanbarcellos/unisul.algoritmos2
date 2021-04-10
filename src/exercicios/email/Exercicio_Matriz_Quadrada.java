/*
Exercícios
Faça um algoritmo que leia uma matriz de ordem 3x3 de números inteiros.
Após a leitura faça:

a) Calcule e mostre a soma dos elementos da primeira coluna;
b) Calcule e mostre a soma dos elementos de cada coluna;
c) Calcule e mostre o produto dos elementos da primeira linha;
d) Calcule e mostre a soma de todos os elementos da matriz;
e) Calcule e mostre a média dos elementos da matriz;
f) Calcule e mostre os elementos que são maiores que a média;
g) Calcule e mostre o maior elemento da matriz e sua posição;
h) Calcule e mostre o menor elemento da matriz e sua posição;
i) Mostre os elementos da diagonal principal;
j) Mostre os elementos do triângulo superior principal;
k) Mostre os elementos do triângulo inferior principal;
l) Calcule e mostre a soma do diagonal principal;
m) Mostre os elementos da diagonal secundária;
n) Mostre os elementos do triângulo superior secundário;
o) Mostre os elementos do triângulo inferior secundário;
p) Calcule e mostre a Soma da diagonal secundária;

*/
import javax.swing.*;

public class Exercicio_Matriz_Quadrada {

    public static void main(String args[]){

        int A[][] = new int[3][3]; // Matriz de Distâncias da Matriz Quadrada
        int l, c; // l Linha | c coluna
        int qtd = 0; // Quantidade de elementos
        int raiz = 0; //  Raiz quadrada da

        // Leitura da matriz 3x3 (quadrada)
        /*for(l=0; l<3; l++){
            for(c=0; c<3; c++){
                A[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para linha "+l+" e coluna "+c+": "));
                qtd ++;
            }
        }*/
        A[0][0] = 4;
        A[0][1] = 5;
        A[0][2] = 3;
        A[1][0] = 6;
        A[1][1] = 2;
        A[1][2] = 7;
        A[2][0] = 1;
        A[2][1] = 9;
        A[2][2] = 8;
        qtd = 9;
        raiz = (int)Math.sqrt(qtd);


        // a) Calcule e mostre a soma dos elementos da primeira coluna
        int resultado_a = 0;
        for(l=0; l<raiz; l++){
            resultado_a = resultado_a + A[l][0];
        }
        JOptionPane.showMessageDialog(null, " a) Calcule e mostre a soma dos elementos da primeira coluna. \n\n Resposta: "+resultado_a);


        // b) Calcule e mostre a soma dos elementos de cada coluna
        int resultado_b[] = new int[3];
        String resultado_b_txt = "";
        for(c=0; c<raiz; c++){
            for(l=0; l<raiz; l++){
				resultado_b[c] = resultado_b[c] + A[l][c];
            }
            resultado_b_txt += " A soma dos elementos da coluna "+c+" é "+resultado_b[c]+" \n ";

        }
        JOptionPane.showMessageDialog(null, " b) Calcule e mostre a soma dos elementos de cada coluna. \n\n Resposta: \n "+resultado_b_txt);


        // c) Calcule e mostre o produto dos elementos da primeira linha
        int resultado_c = 1;
        for(l=0; l<raiz; l++){
            resultado_c = resultado_c * A[0][l];
        }
        JOptionPane.showMessageDialog(null, " c) Calcule e mostre o produto dos elementos da primeira linha. \n\n Resposta: "+resultado_c);


        // d) Calcule e mostre a soma de todos os elementos da matriz
        int resultado_d = 0;
        for(l=0; l<raiz; l++){
            for(c=0; c<raiz; c++){
                resultado_d = resultado_d + A[l][c];
            }
        }
        JOptionPane.showMessageDialog(null, " d) Calcule e mostre a soma de todos os elementos da matriz. \n\n Resposta: "+resultado_d+" ");


        // e) Calcule e mostre a média dos elementos da matriz
        int resultado_e = resultado_d / qtd;
        JOptionPane.showMessageDialog(null, " e) Calcule e mostre a média dos elementos da matriz. \n\n Resposta: "+resultado_e);


        // f) Calcule e mostre os elementos que são maiores que a média
		int resultado_f = 0;
		String resultado_f_txt = "";
        for(l=0; l<raiz; l++){
            for(c=0; c<raiz; c++){
				if(A[l][c] > resultado_e){
					resultado_f_txt = resultado_f_txt+" "+A[l][c];
				}
            }
        }
		JOptionPane.showMessageDialog(null, " f) Calcule e mostre os elementos que são maiores que a média. \n\n Resposta: "+resultado_f_txt+" ");

		// g) Calcule e mostre o maior elemento da matriz e sua posição
		int resultado_g = Integer.MIN_VALUE; // -2147483648 valor mínimo possivel de um tipo int
		int resultado_g_linha = 0;
		int resultado_g_coluna = 0;
        for(l=0; l<raiz; l++){
            for(c=0; c<raiz; c++){
				if(A[l][c] > resultado_g){
					resultado_g  = A[l][c];
					resultado_g_linha  = l;
					resultado_g_coluna = c;
				}
            }
        }
		JOptionPane.showMessageDialog(null, " "+
        " g) Calcule e mostre o maior elemento da matriz e sua posição. \n\n Resposta: \n"+
		" O maior elemento matriz é "+resultado_g+" e está posicionado na"+
		" linha "+resultado_g_linha+" com"+
		" coluna "+resultado_g_coluna
        );


		// h) Calcule e mostre o menor elemento da matriz e sua posição
		int resultado_h = Integer.MAX_VALUE; // 2147483647 valor máximo possivel de um tipo int
		int resultado_h_linha = 0;
		int resultado_h_coluna = 0;
        for(l=0; l<raiz; l++){
            for(c=0; c<raiz; c++){
				if(A[l][c] < resultado_h){
					resultado_h = A[l][c];
					resultado_h_linha  = l;
					resultado_h_coluna = c;
				}
            }
        }
		JOptionPane.showMessageDialog(null, " h) Calcule e mostre o menor elemento da matriz e sua posição. \n\n Resposta: \n"+
		" O menor elemento da matriz é "+resultado_h+" e está posicionado na"+
		" linha "+resultado_h_linha+" com"+
		" coluna "+resultado_h_coluna
		);


		// i) Mostre os elementos da diagonal principal
        String resultado_i_txt = "";
        int diagonal_pricipal_soma = 0;
        for(l=0; l<raiz; l++){
            for(c=0; c<raiz; c++){
				if(l==c){
					resultado_i_txt = resultado_i_txt+" "+A[l][c];
                    diagonal_pricipal_soma = diagonal_pricipal_soma + A[l][c]; // l)
				}
            }
        }
		JOptionPane.showMessageDialog(null, " i) Mostre os elementos da diagonal principal. \n\n Resposta: "+resultado_i_txt+" ");

		// j) Mostre os elementos do triângulo superior principal
        String resultado_j_txt = "";
        for(l=0; l<raiz; l++){
            for(c=0; c<raiz; c++){
				if(l<c){
					resultado_j_txt = resultado_j_txt+" "+A[l][c];
				}
            }
        }
		JOptionPane.showMessageDialog(null, " j) Mostre os elementos do triângulo superior principal. \n\n Resposta: "+resultado_j_txt+" ");


		// k) Mostre os elementos do triângulo inferior principal
		String resultado_k_txt = "";
        for(l=0; l<raiz; l++){
            for(c=0; c<raiz; c++){
				if(l>c){
					resultado_k_txt = resultado_k_txt+" "+A[l][c];
				}
            }
        }
		JOptionPane.showMessageDialog(null, " k) Mostre os elementos do triângulo inferior principal. \n\n Resposta: "+resultado_k_txt+" ");


		// l) Calcule e mostre a soma do diagonal principal
		int resultado_l = diagonal_pricipal_soma;
		JOptionPane.showMessageDialog(null, " l) Calcule e mostre a soma do diagonal principal. \n\n Resposta:  "+resultado_l);


		// m) Mostre os elementos da diagonal secundária
		String resultado_m_txt = "";
        int diagonal_secundaria_soma = 0;
        for(l=0; l<raiz; l++){
            for(c=0; c<raiz; c++){
				if((l+c)==(raiz-1)){
					resultado_m_txt = resultado_m_txt+" "+A[l][c];
                    diagonal_secundaria_soma = diagonal_secundaria_soma + A[l][c];
				}
            }
        }
        JOptionPane.showMessageDialog(null, " m) Mostre os elementos da diagonal secundária. \n\n Resposta:  "+resultado_m_txt);


        // n) Mostre os elementos do triângulo superior secundário
		String resultado_n_txt = "";
        for(l=0; l<raiz; l++){
            for(c=0; c<raiz; c++){
				if((l+c)<(raiz-1)){
					resultado_n_txt = resultado_n_txt+" "+A[l][c];
				}
            }
        }
        JOptionPane.showMessageDialog(null, " n) Mostre os elementos do triângulo superior secundário. \n\n Resposta:  "+resultado_n_txt);


		// o) Mostre os elementos do triângulo inferior secundário
		String resultado_o_txt = "";
        for(l=0; l<raiz; l++){
            for(c=0; c<raiz; c++){
				if((l+c)>(raiz-1)){
					resultado_o_txt = resultado_o_txt+" "+A[l][c];
				}
            }
        }
        JOptionPane.showMessageDialog(null, " o) Mostre os elementos do triângulo inferior secundário. \n\n Resposta:  "+resultado_o_txt);


		// p) Calcule e mostre a Soma da diagonal secundária
		int resultado_p = diagonal_secundaria_soma;
        JOptionPane.showMessageDialog(null, " p) Calcule e mostre a soma da diagonal secundária. \n\n Resposta:  "+resultado_p);

    }

}