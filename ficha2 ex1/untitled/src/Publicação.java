public class Publicação {
    private String nome;
    private int quantidadePublicacoes;
    private int numeroPublicacao;

//IV- Construtor

    public  Publicação(int numeroPublicacao, int quantidadePublicacoes){
        this.numeroPublicacao = numeroPublicacao;
        this.quantidadePublicacoes = quantidadePublicacoes;
        quantidadePublicacoes = numeroPublicacao += quantidadePublicacoes ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadePublicacoes() {
        return quantidadePublicacoes;
    }

    public void setQuantidadePublicacoes(int quantidadePublicacoes) {
        this.quantidadePublicacoes = quantidadePublicacoes;
    }

    public int getNumeroPublicacao() {
        return numeroPublicacao;
    }

    public void setNumeroPublicacao(int numeroPublicacao) {
        this.numeroPublicacao = numeroPublicacao;
    }
}
