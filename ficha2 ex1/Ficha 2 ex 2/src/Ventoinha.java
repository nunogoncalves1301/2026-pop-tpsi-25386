public class Ventoinha {

    // Atributos
    private boolean ventoinhaLigada;
    private Velocidade velocidadeVentoinha;

    // Construtor sem argumentos
    public Ventoinha() {
        this.ventoinhaLigada = false;
        this.velocidadeVentoinha = Velocidade.BAIXA; // valor por defeito pedido no exercicio
    }

    // Getter e Setter para velocidadeVentoinha
    public Velocidade getVelocidadeVentoinha() {
        return velocidadeVentoinha;
    }

    public void setVelocidadeVentoinha(Velocidade velocidadeVentoinha) {
        this.velocidadeVentoinha = velocidadeVentoinha;
    }

    // Getter para ventoinhaLigada
    public boolean ventoinhaLigada() {
        return ventoinhaLigada;
    }

    // Ligar
    public void ligar() {
        this.ventoinhaLigada = true;
        System.out.println("Ventoinha ligada.");
    }

    // desligar
    public void desligar() {
        this.ventoinhaLigada = false;
        System.out.println("Ventoinha desligada.");
    }

    // toString
    @Override
    public String toString() {
        return "\nVentoinha: \n" +
                "ligada = " + ventoinhaLigada +
                ", velocidade = " + velocidadeVentoinha;
    }
}