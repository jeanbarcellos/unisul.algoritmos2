
public class Unidade2_Exemplo {

    static final int TAMANHO = 10;

    static class Pessoa {
        String nome;
        double altura;
        boolean sexo;
        int idade, numerodependente; // erro
        String profissao;
    }

    public static void main(String args[]) {
        Pessoa pessoas[] = new Pessoa[TAMANHO];

        Pessoa joao = new Pessoa();
        joao.idade = 19;

        pessoas[0] = new Pessoa();
        pessoas[0].idade = 20;
    }
}