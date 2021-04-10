/*
 * Exercício 2
 *  
 * Considere que uma figura geométrica possui área, cor e tipo(1-Triangulo, 2-Circulo e 3-Quadrado). 
 * 
 * Faça um algoritmo que armazene N figuras geométricas em um vetor.
 *  
 * Após a leitura determine:
 * a) O total da área das figuras geométricas;
 * b) O tipo da maior figura geométrica;
 * c) A quantidade de círculos;
 * d) O percentual de quadrado em relação ao total.
 */

import javax.swing.*;

public class Unidade2_Exercicio2 {

    static class Figura
    {
        double area;
        String cor;
        int tipo;
    }

    public static void main(String args[]) 
    {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de figuras geométricas: "));
        int i;
        
        Figura figuras[] = new Figura[tamanho];
        
        for (i=0; i<tamanho; i++)
        {
            figuras[i] = new Figura();
            figuras[i].area = Double.parseDouble(JOptionPane.showInputDialog("Informe a area de "+ i +": "));
            figuras[i].cor  = JOptionPane.showInputDialog("Informe a cor de "+ i +": ");
            figuras[i].tipo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de "+ i +" (1-Triangulo, 2-Circulo e 3-Quadrado): "));       
        }
        
        
        // a) O total da área das figuras geométricas
        
        double area_total = 0;
        
        for (i=0; i<tamanho; i++) {
            area_total = area_total + figuras[i].area;
        }
        
        JOptionPane.showMessageDialog(null, "a) O total da área das figuras geométricas é: "+ area_total);

        
        // b) O tipo da maior figura geométrica
        Figura figura_maior = new Figura();
        figura_maior = figuras[0];        
        
        for (i=0; i<tamanho; i++) {
            if (figuras[i].area > figura_maior.area) {
                figura_maior = figuras[i];
            }
        }
        
        JOptionPane.showMessageDialog(null, "b) O tipo da maior figura geométrica é: "+ figura_maior.tipo);
        
        
        // c) A quantidade de círculos;
        int circulo_qtd = 0;
        
        for (i=0; i<tamanho; i++) {
            if (figuras[i].tipo > 2) {
                circulo_qtd++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "c) A quantidade de círculos é: "+ circulo_qtd);
        
        // d) O percentual de quadrado em relação ao total.
        int quadrado_qtd = 0;
        double quadrado_percent = 0;
        
        for (i=0; i<tamanho; i++) {
            if (figuras[i].tipo > 2) {
                quadrado_qtd++;
            }
        }
        
        quadrado_percent = (quadrado_qtd * 100) / tamanho;
        
        JOptionPane.showMessageDialog(null, " O percentual de quadrado em relação ao total: "+ quadrado_percent +"%");
        
    }
}