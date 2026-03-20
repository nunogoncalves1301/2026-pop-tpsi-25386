public class Publicacao {
    private String nome;
    private static int quantidadePublicacoes;
    private int numeroPublicacao;

//IV- Construtor

    public Publicacao() {
        // Igualar o ID ao valor atual do contador
        this.numeroPublicacao = quantidadePublicacoes;
        // Incrementar o contador global
        quantidadePublicacoes++;
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
    public void mostraInformacao(){
        System.out.println("Numero publicações: " + this.numeroPublicacao);
        System.out.println("Quantidade: " + this.quantidadePublicacoes);

    }

    public String introduzirDados(){
        return this.nome;
    }

    public int obterQuantidadePublicacoes(){
        return this.quantidadePublicacoes;
    }
}
