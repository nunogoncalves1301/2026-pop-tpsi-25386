public class Livro extends Publicacao {
    // i. APENAS o atributo que a Publicacao NÃO TEM
    private String autor;

    // ii. Construtor de Instâncias
    public Livro() {
        super(); // Chama o construtor do pai para gerar o ID automático
    }

    // iii. Getters e Setters (O de 'nome' já vem do pai, não precisas de repetir)
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // iv. mostraInformacao()
    @Override
    public void mostraInformacao() {
        // Chamamos o metodo da classe publicacao para mostrar informacao
        super.mostraInformacao();
        // Acrescentamos o detalhe do livro
        System.out.println("Autor: " + this.autor);
    }

    // v. introduzirDados(...) que recebe nome e autor
    public void introduzirDados(String nome, String autor) {
        super.setNome(nome); // Guarda o nome na variável do pai
        this.autor = autor;   // Guarda o autor aqui
    }
}
