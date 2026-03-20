public class Revista extends Publicacao {
    private String numeroRevista;

    public Revista() {
        super();
    }

    public String getNumeroRevista() { return numeroRevista; }
    public void setNumeroRevista(String numeroRevista) { this.numeroRevista = numeroRevista; }

    @Override
    public void mostraInformacao() {
        super.mostraInformacao();
        System.out.println("Edição da Revista: " + numeroRevista);
    }

    public void introduzirDados(String nome, String numeroRevista) {
        super.introduzirDados(nome);
        this.numeroRevista = numeroRevista;
    }
}
