public abstract class Publicacao {
    private String nome;
    private static int quantidadePublicacoes = 0; // Variável de classe (static)
    private int numeroPublicacao;

    // Construtor: gera o ID único automaticamente
    public Publicacao() {
        this.numeroPublicacao = quantidadePublicacoes;
        quantidadePublicacoes++;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getNumeroPublicacao() { return numeroPublicacao; }
    // Não criamos setter para numeroPublicacao para garantir que o ID é unico

    //  Mostra informação base
    public void mostraInformacao() {
        System.out.println("ID: " + numeroPublicacao + " | Nome: " + nome);
    }

    // Introduzir dados (recebe o nome)
    public void introduzirDados(String nome) {
        this.nome = nome;
    }

    // Devolve o total de publicações criadas
    public static int obterQuantidadePublicacoes() {
        return quantidadePublicacoes;
    }
}
