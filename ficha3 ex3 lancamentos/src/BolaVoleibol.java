public class BolaVoleibol extends Bola {

    public BolaVoleibol(String marca) {
        super(marca);
    }

    @Override
    public void lancar() {
        System.out.println("Bola de voleibol " + getMarca() + " foi lancada!");
    }

    @Override
    public void ressaltar() {
        System.out.println("Bola de voleibol " + getMarca() + " ressaltou!");
    }
}