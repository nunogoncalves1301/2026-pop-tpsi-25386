public class Aquecedor extends Ventoinha {

    // Atributos
    private boolean resistenciaLigada;
    private Velocidade potenciaResistencia;

    // Construtor sem argumentos
    public Aquecedor() {
        super();
        this.resistenciaLigada = false;
        this.potenciaResistencia = Velocidade.BAIXA;
    }

    // Getter e Setter para potenciaResistencia
    public Velocidade getPotenciaResistencia() {
        return potenciaResistencia;
    }

    public void setPotenciaResistencia(Velocidade potenciaResistencia) {
        this.potenciaResistencia = potenciaResistencia;
    }

    // Getter para resistenciaLigada
    public boolean resistenciaLigada() {
        return resistenciaLigada;
    }

    // ligarAquecimento
    public void ligarAquecimento() {
        this.resistenciaLigada = true;
        System.out.println("Aquecimento ligado.");
    }

    // desligarAquecimento
    public void desligarAquecimento() {
        this.resistenciaLigada = false;
        System.out.println("Aquecimento desligado.");
    }

    // toString
    @Override
    public String toString() {
        return "\nAquecedor\n" +
                "ventoinhaLigada = " + ventoinhaLigada() +
                ", velocidadeVentoinha = " + getVelocidadeVentoinha() +
                ", resistenciaLigada = " + resistenciaLigada +
                ", potenciaResistencia = " + potenciaResistencia;

    }
}
