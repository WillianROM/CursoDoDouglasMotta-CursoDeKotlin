package classes;

public class PessoaJava {
    private final String nome;
    private final int idade;

    public PessoaJava(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public static void main(String[] args) {
        PessoaJava pessoa = new PessoaJava("Alberto", 51);

        System.out.println("O " + pessoa.nome + " tem " + pessoa.idade + " anos de vida.");
    }
}

