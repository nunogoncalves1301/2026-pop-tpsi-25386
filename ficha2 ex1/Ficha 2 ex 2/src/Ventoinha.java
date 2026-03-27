public class Ventoinha {
    private boolean ventoinhaLigada;
    private Velocidade Velocidade;

    public Ventoinha() {
        this.ventoinhaLigada = false;
        this.Velocidade = Velocidade.BAIXA;
    }

    public Velocidade getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(Velocidade velocidade) {
        Velocidade = velocidade;
    }

    public boolean getVentoinhaLigada() {
        if (ventoinhaLigada == true) {
            System.out.println("Ventoinha ligada.");
        } else {
            System.out.println("Ventoinha desligada.");
        }
        return ventoinhaLigada;
    }

    public void setLigar(boolean ligar) {
        this.ventoinhaLigada = ligar;
    }

    public void setDesligar(boolean desligar) {
        this.ventoinhaLigada = desligar;
    }

    public String toString() {
        System.out.println("A ventoinha está " + ventoinhaLigada);
        if (ventoinhaLigada == true) {
            System.out.println("A uma velocidade" + Velocidade);
        }
        return Velocidade.toString();
    }
}
