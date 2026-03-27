public class Climatizador extends Aquecedor {

    // Atributos
    private boolean refrigeracaoLigada;
    private Velocidade potenciaRefrigerador;

    // Construtor sem argumentos
    public Climatizador() {
        super();
        this.refrigeracaoLigada = false;
        this.potenciaRefrigerador = Velocidade.BAIXA;
    }

    // Getter e Setter para potenciaRefrigerador
    public Velocidade getPotenciaRefrigerador() {
        return potenciaRefrigerador;
    }

    public void setPotenciaRefrigerador(Velocidade potenciaRefrigerador) {
        this.potenciaRefrigerador = potenciaRefrigerador;
    }

    // Getter para refrigeracaoLigada
    public boolean refrigeracaoLigada() {
        return refrigeracaoLigada;
    }

    //ligarRefrigeracao (desliga aquecimento)
    public void ligarRefrigeracao() {
        this.refrigeracaoLigada = true;
        desligarAquecimento(); // desliga a resistência ao ligar refrigeração
        System.out.println("Refrigeração ligada.");
    }

    // desligarRefrigeracao
    public void desligarRefrigeracao() {
        this.refrigeracaoLigada = false;
        System.out.println("Refrigeração desligada.");
    }

    // Reescrita de ligarAquecimento (desliga refrigeração)
    @Override
    public void ligarAquecimento() {
        this.refrigeracaoLigada = false;
        super.ligarAquecimento(); // liga a resistência
        System.out.println("(Refrigeração desligada automaticamente.)");
    }

    // toString
    @Override
    public String toString() {
        return "\nClimatizador: \n" +
                "ventoinhaLigada = " + ventoinhaLigada() +
                ", velocidadeVentoinha = " + getVelocidadeVentoinha() +
                ", resistenciaLigada = " + resistenciaLigada() +
                ", potenciaResistencia = " + getPotenciaResistencia() +
                ", refrigeracaoLigada = " + refrigeracaoLigada +
                ", potenciaRefrigerador = " + potenciaRefrigerador;

    }
}
