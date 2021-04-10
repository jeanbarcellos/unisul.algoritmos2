/*
SISTEMA DE GERENCIAMENTO DE PRODUTOS DEM MINIMERCADO

O sistema tem como objetivo registrar os produtos utilizados no comércio de um minemercado

Ele possui as seguintes funções:

    1) Cadastro de Produtos

    2) Impressão de Etiqueta 
            O Objetivo aqui é usar este recurso para impressão de etiqueta adesiva para colar no produto)

    3) Emissão de um Relatório com todos os produtos já cadastrados

    4) Registro de venda de produtos (baixa de estoque)

    5) Registro de compra de produtos para venda (entrada no estoque)

    6) Alteração na porcentagem de lucro, para base de criação automática de preço de venda
*/

import javax.swing.*;


public class Trabalho2 {

    public static class Produto 
    {
        String descricao;
        int quantidade;
        double preco_custo;
        double lucro;
        Fornecedor fornecedor = new Fornecedor();
    }

    public static class Fornecedor
    {
        String razao_social;
        String endereco;
        String cidade;
        String estado;
    }
    
    
    
    static Produto PRODUTOS[] = new Produto[999];
    static int QUANTIDADE_ATUAL = 0;
    
    
    public static int getPosicao(int codigo) 
    {
        int resultado = codigo - 1;
        return resultado;
    }
    
    public static int getCodigo(int posicao) 
    {
        int resultado = posicao + 1;
        return resultado;
    }
    
    public static int proximoCodigo()
    {
        int resultado = QUANTIDADE_ATUAL + 1;
        return resultado;
    }    
    
    
    public static void cadastrarProdutos()
    {
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produtos a serem cadastrados: "));
        
        int ini = QUANTIDADE_ATUAL;
        int fim = QUANTIDADE_ATUAL + quantidade;
        
        for (int i = ini; i < fim; i++) {
            
            JOptionPane.showMessageDialog(null, 
                "A seguir informe os dados do "+ (i+1) +"º produto.\n"+
                "\n"+
                "Este produto será cadastrado automaticamente com o Código n° " + proximoCodigo() + " no sistema."
            );
            
            String cab = "Cadastro do produto Código " + proximoCodigo() + "\n\n";
            
            PRODUTOS[i] = new Produto();
            PRODUTOS[i].descricao = JOptionPane.showInputDialog(cab + "Informe a descrição: ");
            PRODUTOS[i].quantidade = Integer.parseInt(JOptionPane.showInputDialog(cab + "Informe a quantidade: "));
            PRODUTOS[i].preco_custo = Double.parseDouble(JOptionPane.showInputDialog(cab + "Informe o preço de custo (R$): "));
            PRODUTOS[i].lucro = Double.parseDouble(JOptionPane.showInputDialog(cab + "Informe a porcentagem de lucro: "));
            PRODUTOS[i].fornecedor.razao_social = JOptionPane.showInputDialog(cab + "Fornecedor: Informe a razão rocial: ");
            PRODUTOS[i].fornecedor.endereco = JOptionPane.showInputDialog(cab + "Fornecedor: Informe o endereço: ");
            PRODUTOS[i].fornecedor.cidade = JOptionPane.showInputDialog(cab + "Fornecedor: Informe a cidade: ");
            PRODUTOS[i].fornecedor.estado = JOptionPane.showInputDialog(cab + "Fornecedor: Informe o estado: ");
            
            QUANTIDADE_ATUAL = QUANTIDADE_ATUAL + 1;
        }
    }
    
    public static void emitirRelatorio()
    {
        String relatorio[] = new String[QUANTIDADE_ATUAL];
        String relatorio_txt = "";
        
        int total_produtos = 0;
        int total_quantidades = 0;
        double total_valor = 0;
        
        if (QUANTIDADE_ATUAL > 0) {
    
            for (int i = 0; i < QUANTIDADE_ATUAL; i++) {
                relatorio[i] =  
                    "Código: " + getCodigo(i) + "  |  " +
                    "Descrição: " + PRODUTOS[i].descricao + "\n" +
                    "Quantidade: " + PRODUTOS[i].quantidade + " unidades | " +
                    "Preço de Custo: R$ " + PRODUTOS[i].preco_custo + "\n" +
                    "Valores em estoque: R$ " + calcularValorEmEstoque(getCodigo(i)) + "\n" +
                    "Fornecedor: " +
                    "Razão Social: " + PRODUTOS[i].fornecedor.razao_social + " | " +
                    "Endereço: " + PRODUTOS[i].fornecedor.endereco + " | " +
                    "Cidade/UF: " + PRODUTOS[i].fornecedor.cidade + "/" + PRODUTOS[i].fornecedor.estado + "\n" +
                    "Preço de Venda: R$ " + calcularPrecoVenda(getCodigo(i)) + " (" + PRODUTOS[i].lucro + " %)\n" +
                    "------\n";
                    
                relatorio_txt = relatorio_txt + relatorio[i];
                
                total_produtos = total_produtos + 1;
                total_quantidades = total_quantidades + PRODUTOS[i].quantidade;
                total_valor = total_valor + calcularValorEmEstoque(getCodigo(i));
            }
            
            relatorio_txt += 
                "TOTAIS: \n" + 
                "Produtos: " + total_produtos + " | " +
                "Quantidade: " + total_quantidades + " | " +
                "Valor: R$ " + total_valor + "";
            
            JOptionPane.showMessageDialog(null, "Relatório de produtos: \n\n"+ relatorio_txt);
                
        } else {
            JOptionPane.showMessageDialog(null, "Não há produtos cadastrados no sistema.");
        }
        
    }
    
    public static void imprimirEtiqueta(int codigo)
    {
        if (QUANTIDADE_ATUAL > 0) {
            
            if (getPosicao(codigo) < QUANTIDADE_ATUAL) {
                
                String etiqueta =  
                    "--------------------------------- ETIQUETA ---------------------------------\n" +
                    " Código: " + codigo + " \n" +
                    " Descrição: " + PRODUTOS[getPosicao(codigo)].descricao + "\n" +
                    " Preço: R$ " + calcularPrecoVenda(codigo) + "\n" +
                    " Fornecedor: " + PRODUTOS[getPosicao(codigo)].fornecedor.razao_social + " \n " +
                    "--------------------------------------------------------------------------------";
                
                JOptionPane.showMessageDialog(null, etiqueta);
                
            } else {
                JOptionPane.showMessageDialog(null, "O produto referente ao código informado não está cadastrado no sistema.");
            }                
        } else {
            JOptionPane.showMessageDialog(null, "Não há produtos cadastrados no sistema.");
        }
    }    

    public static int registrarCompra(int codigo, int unidades, double preco_custo)
    {
        PRODUTOS[getPosicao(codigo)].quantidade += unidades;
        PRODUTOS[getPosicao(codigo)].preco_custo = preco_custo;
        return 1;
    }
    
    public static int registrarVenda(int codigo, int unidades)
    {
        if (PRODUTOS[getPosicao(codigo)].quantidade >= unidades) {
            PRODUTOS[getPosicao(codigo)].quantidade -= unidades;
            return 1;
        } else {
            return 0;
        }
  
    }   

    public static double calcularPrecoVenda(int codigo) 
    {
        double resultado = PRODUTOS[getPosicao(codigo)].preco_custo + (PRODUTOS[getPosicao(codigo)].preco_custo * PRODUTOS[getPosicao(codigo)].lucro) / 100;
        return resultado;
    }

    public static double calcularValorEmEstoque(int codigo) 
    {
        double resultado = PRODUTOS[getPosicao(codigo)].quantidade * PRODUTOS[getPosicao(codigo)].preco_custo;
        return resultado;
    }    

    public static int setLucro(int codigo, double porcentagem) 
    {
        PRODUTOS[getPosicao(codigo)].lucro = porcentagem;
        return 1;
    }    


    
    public static void main(String args[]){
        
        int opcao = 1;
        int codigo;
        int unidades;
        double preco_custo;
        double porcentagem;
        String titulo;
        
        while (opcao > 0 && opcao < 7) {
        
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "Sistema de Gerenciamento de Produtos\n"+
                "   \n"+
                "MINIMERCADO DO PAFUNCIO \n"+
                "   \n"+                
                "O que desejas fazer?  \n"+
                "   \n"+
                " 1 - Cadastrar produtos \n"+
                " 2 - Emitir relatório de produtos \n"+
                " 3 - Imprimir etiqueta de um produto \n"+
                " 4 - Registrar uma venda (Saída)\n"+
                " 5 - Repor um produto (Entrada)\n"+
                " 6 - Definir nova porcentagem de lucro de um produto\n"+
                " 7 - SAIR\n"
            ));
            
            switch (opcao) {
                case 1 :
                    cadastrarProdutos();
                break;
                case 2 :
                    emitirRelatorio();
                break;
                case 3 :
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Impressão de Etiqueta \n\n Informe o código do produto: "));
                    
                    imprimirEtiqueta(codigo);
                break;
                case 4 :
                    titulo = "Registro de Venda";
                    codigo = Integer.parseInt(JOptionPane.showInputDialog(titulo + "\n\n Informe o código do produto: "));
                    unidades = Integer.parseInt(JOptionPane.showInputDialog(titulo + "\n\n Informe a quantidade do produto: "));
                    
                    if (registrarVenda(codigo, unidades) == 1) {
                        JOptionPane.showMessageDialog(null, "Venda efetuada com sucesso.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Venda não efetuada! \nQuantidade solicitada do produto é supeior ao estoque");
                    }
                break;
                case 5 :
                    titulo = "Registro de Reposição de Estoque";
                    codigo = Integer.parseInt(JOptionPane.showInputDialog(titulo + "\n\n Informe o código do produto: "));
                    unidades = Integer.parseInt(JOptionPane.showInputDialog(titulo + "\n\n Informe a quantidade do produto: "));
                    preco_custo = Double.parseDouble(JOptionPane.showInputDialog(titulo + "\n\n Informe o preço de custo do produto: "));
                    
                    if (registrarCompra(codigo, unidades, preco_custo) == 1){
                        JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso.");
                    } 
                break;
                case 6 :
                    titulo = "Definição de nova porcentagem de lucro sobre um produto";
                    codigo = Integer.parseInt(JOptionPane.showInputDialog(titulo + "\n\n Informe o código do produto: "));
                    porcentagem = Integer.parseInt(JOptionPane.showInputDialog(titulo + "\n\n Informe a porcentagem: "));
                    
                    if (setLucro(codigo, porcentagem) == 1) {
                        JOptionPane.showMessageDialog(null, "Alteração efetuada com sucesso.");
                    } 
                break;
            }

        }

    }

}
