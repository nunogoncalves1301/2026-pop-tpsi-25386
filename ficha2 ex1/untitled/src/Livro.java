public class Livro extends Publicacao {
    private String autor; // Atributo específico

    // Construtor
    public Livro() {
        super(); // Chama o construtor do pai
    }

    // Getter e Setter
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    // Override para incluir o autor
    @Override
    public void mostraInformacao() {
        super.mostraInformacao();
        System.out.println("Autor: " + autor);
    }

    // Introduzir dados (recebe nome e autor)
    public void introduzirDados(String nome, String autor) {
        super.introduzirDados(nome);
        this.autor = autor;
    }
}
