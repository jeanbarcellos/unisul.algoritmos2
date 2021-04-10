import javax.swing.*;

public class Trabalho1 {

    public static void main(String args[]){

        String vaga[][] = new String[3][4];
        String dono[][] = new String[3][4];
        String veiculo[][] = new String[3][4];
        int kilometragem[][] = new int[3][4];
        int l, c;
        int vaga_qtd = 12;

        vaga[0][0] = "101";
        vaga[0][1] = "102";
        vaga[0][2] = "103";
        vaga[0][3] = "104";
        vaga[1][0] = "201";
        vaga[1][1] = "202";   
        vaga[1][2] = "203";
        vaga[1][3] = "204";
        vaga[2][0] = "301";
        vaga[2][1] = "302";   
        vaga[2][2] = "303";
        vaga[2][3] = "304";

        dono[0][0] = "Ricardo";
        dono[0][1] = "João";
        dono[0][2] = "Maria";
        dono[0][3] = "José";
        dono[1][0] = "Julia";
        dono[1][1] = "Marcos";
        dono[1][2] = "Paulo";
        dono[1][3] = "Pedro";
        dono[2][0] = "Bruno";
        dono[2][1] = "Isabela";  
        dono[2][2] = "Rafaela";
        dono[2][3] = "Gabriel";

        veiculo[0][0] = "Ferrari";
        veiculo[0][1] = "Mercedes";
        veiculo[0][2] = "Fusca";
        veiculo[0][3] = "Lamborghini";
        veiculo[1][0] = "Evoque";
        veiculo[1][1] = "BMW";
        veiculo[1][2] = "Fusca";
        veiculo[1][3] = "Fiat 147";
        veiculo[2][0] = "Dodge";
        veiculo[2][1] = "Mustang";  
        veiculo[2][2] = "Ferrari";
        veiculo[2][3] = "Fusca";	


        
        // 1) Solicite ao usuário a kilometragem de cada veículo, a mensagem que aparece para o usuário deve seguir o seguinte modelo:       
        for(l=0; l<3; l++){
            for(c=0; c<4; c++){
                kilometragem[l][c] = Integer.parseInt(JOptionPane.showInputDialog(
                "Olá "+dono[l][c]+", "+
                "sua vaga é a "+vaga[l][c]+", "+
                "insira a kilometragem do seu veículo "+veiculo[l][c]+": "
                ));
            }
        }



        // 2) Solicite ao usuário que informe um modelo de veículo(STRING) e utilizando PESQUISA LINEAR mostre o número de veículos com o mesmo modelo no estacionamento piloto da Tiburcio´s PARK. 
        String veiculo_pesq = JOptionPane.showInputDialog("2) Informe um modelo de veículo: ");
        int veiculo_pesq_qtd = 0;

        for(l=0; l<3; l++){
            for(c=0; c<4; c++){
                if(veiculo[l][c].equalsIgnoreCase(veiculo_pesq)){
                    veiculo_pesq_qtd++;
                }
            }
        }

        if(veiculo_pesq_qtd>0){
            JOptionPane.showMessageDialog(null, "2) O estacionamento possui "+veiculo_pesq_qtd+" veículo"+(veiculo_pesq_qtd>1 ? "s" : "")+" do modelo "+veiculo_pesq+".");
        }else{
            JOptionPane.showMessageDialog(null, "2) O estacionamento não possui veículo do modelo "+ veiculo_pesq+".");
        }



        // 3) Mostre a média de Kilometragem dos carros do estacionamento.
        int kilometragem_soma = 0;

        for(l=0; l<3; l++){
            for(c=0; c<4; c++){
                kilometragem_soma = kilometragem_soma + kilometragem[l][c];               
            }
        }

        double kilometragem_media = (double) kilometragem_soma / vaga_qtd;

        JOptionPane.showMessageDialog(null, 
        "3) Média de kilometragem dos veículos do estacionamento: \n"+
        "\n"+
        kilometragem_media+" km"
        );



        // 4) Mostre o nome do dono, o número da vaga e o modelo do veículo que MAIS andou.
        int kilometragem_maior = 0;
        int kilometragem_maior_lin = 0; 
        int kilometragem_maior_col = 0;
        
        for(l=0; l<3; l++){
            for(c=0; c<4; c++){             
                if(kilometragem[l][c] > kilometragem_maior){
                	kilometragem_maior = kilometragem[l][c];
                	kilometragem_maior_lin = l;
                	kilometragem_maior_col = c;
                }
            }
        }

        JOptionPane.showMessageDialog(null, 
        "4) Veículo que MAIS rodou: \n"+
        "\n"+
        "Dono: "+dono[kilometragem_maior_lin][kilometragem_maior_col]+" \n"+
        "Vaga: "+vaga[kilometragem_maior_lin][kilometragem_maior_col]+" \n"+
        "Modelo: "+veiculo[kilometragem_maior_lin][kilometragem_maior_col]
        );



        // 5) Mostre o número da vaga do veículo que MENOS andou e o nome do dono deste veículo.
        int kilometragem_menor = Integer.MAX_VALUE;
        int kilometragem_menor_lin = 0; 
        int kilometragem_menor_col = 0;

        for(l=0; l<3; l++){
            for(c=0; c<4; c++){             
                if(kilometragem[l][c] < kilometragem_menor){
                	kilometragem_menor = kilometragem[l][c];
                	kilometragem_menor_lin = l;
                	kilometragem_menor_col = c;
                }
            }
        }

        JOptionPane.showMessageDialog(null, 
        "5) Veículo que MENOS rodou: \n"+
        "\n"+
        "Vaga: "+vaga[kilometragem_menor_lin][kilometragem_menor_col]+" \n"+
        "Dono: "+dono[kilometragem_menor_lin][kilometragem_menor_col]
        );



        // 6) Solicite que o usuário informe o número de uma das vaga(STRING), mostre o nome do dono, modelo e kilometragem deste veículo.
        String vaga_pesq = JOptionPane.showInputDialog("6) Informe o número de uma vaga: ");
        int vaga_pesq_result_lin = 0; 
        int vaga_pesq_result_col = 0;
        int vaga_pesq_flag = 0;
        
        for(l=0; l<3; l++){
            for(c=0; c<4; c++){
                if(vaga[l][c].equalsIgnoreCase(vaga_pesq)){
                    vaga_pesq_result_lin = l; 
                    vaga_pesq_result_col = c;
                    vaga_pesq_flag = 1;
                    c = 4;
                    l = 3;
                }
            }
        }

        if(vaga_pesq_flag>0){
            JOptionPane.showMessageDialog(null, 
            "6) Informações sobre a vaga "+vaga[vaga_pesq_result_lin][vaga_pesq_result_col]+": \n"+
            "\n"+
            "Dono: "+dono[vaga_pesq_result_lin][vaga_pesq_result_col]+" \n"+
            "Modelo: "+veiculo[vaga_pesq_result_lin][vaga_pesq_result_col]+" \n"+
            "Kilometragem: "+kilometragem[vaga_pesq_result_lin][vaga_pesq_result_col]+" km"
            );
        }else{
            JOptionPane.showMessageDialog(null, "6) Não existe a vaga "+ vaga_pesq+" no estacionamento.");
        }



        // 7) Mostre todas as leituras de kilometragem ordenadas. Para isso coloque todas as leituras em um VETOR e ordene com o BubbleSort.
        int kilometragem_ordenada[] = new int[vaga_qtd];
        int ko_troca = 1;
        int ko_fim = vaga_qtd - 1;
        int ko_auxiliar;        
        int i = 0;
        
        for(l=0; l<3; l++){
            for(c=0; c<4; c++){
                kilometragem_ordenada[i] = kilometragem[l][c];
                i++;
            }
        }
 
        while(ko_troca==1){
            ko_troca = 0;
        	
            for(i=0; i<ko_fim; i++){
                if(kilometragem_ordenada[i] > kilometragem_ordenada[i+1]){
                    ko_auxiliar = kilometragem_ordenada[i];
                    kilometragem_ordenada[i] = kilometragem_ordenada[i+1];
                    kilometragem_ordenada[i+1] = ko_auxiliar;
                    ko_troca = 1;
                }
            }
        }

        String kilometragem_ordenada_txt = "7) Kilometragem dos veículos em ordem ascendente: \n\n";
        for(i=0; i<vaga_qtd; i++){
            kilometragem_ordenada_txt = kilometragem_ordenada_txt + kilometragem_ordenada[i] + ", ";
        }
        JOptionPane.showMessageDialog(null, kilometragem_ordenada_txt);



        // 8) Mostre o número de veículos que possuem kilometragem superior a média calculada na opção 3.
        int kilometragem_media_acima_qtd = 0;

        for(l=0; l<3; l++){
            for(c=0; c<4; c++){
                if(kilometragem[l][c] > kilometragem_media){
                    kilometragem_media_acima_qtd++;
                }
            }
        }

        JOptionPane.showMessageDialog(null, 
        "8) Quantidade de veículos que possuem kilometragem acima da média "+kilometragem_media+" km: \n"+
        "\n"+
        kilometragem_media_acima_qtd+" veículo"+(kilometragem_media_acima_qtd>1 ? "s" : "")
        );



        // 9) Solicite que o usuário informe o nome de um dono, mostre o modelo, a kilometragem deste veículo e o número da vaga.
        String dono_pesq = JOptionPane.showInputDialog("9) Informe o nome de um dono de vaga: ");
        int dono_pesq_flag = 0;
        int dono_pesq_result_lin = 0; 
        int dono_pesq_result_col = 0;
        
        for(l=0; l<3; l++){
            for(c=0; c<4; c++){
                if(dono[l][c].equalsIgnoreCase(dono_pesq)){
                    dono_pesq_result_lin = l; 
                    dono_pesq_result_col = c;
                    dono_pesq_flag = 1;
                    c = 4;
                    l = 3;
                }
            }
        }
        
        if(dono_pesq_flag>0){
            JOptionPane.showMessageDialog(null, 
            "9) Informações sobre o dono "+dono[dono_pesq_result_lin][dono_pesq_result_col]+": \n"+
            "\n"+
            "Modelo: "+veiculo[dono_pesq_result_lin][dono_pesq_result_col]+" \n"+
            "Kilometragem: "+kilometragem[dono_pesq_result_lin][dono_pesq_result_col] +" km \n"+
            "Vaga: "+vaga[dono_pesq_result_lin][dono_pesq_result_col]+" \n"
            );
        }else{
            JOptionPane.showMessageDialog(null, "9) Não existe vaga no estacionamento com o dono chamado "+ dono_pesq+".");
        }



        // 10) Considerando as vaga com final 4 (104,204,304), mostre o nome do dono, o modelo e a kilometragem.
        int vaga_unid = 4;
        int vaga_unid_c = vaga_unid - 1;
        String vaga_unid_txt = "10) Informações sobre as vaga com final 4: \n\n";
        
        for(l=0; l<3; l++){
        	vaga_unid_txt = vaga_unid_txt+"Vaga "+vaga[l][vaga_unid_c]+": "+dono[l][vaga_unid_c]+" - "+veiculo[l][vaga_unid_c] +" - "+kilometragem[l][vaga_unid_c] +" Km \n";
        }
        
        JOptionPane.showMessageDialog(null, vaga_unid_txt);

    }

}