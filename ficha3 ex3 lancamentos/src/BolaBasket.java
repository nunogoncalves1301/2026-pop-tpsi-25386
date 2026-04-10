public class BolaBasket extends Bola {

    public BolaBasket(String marca) {
        super(marca);
    }

    @Override
    public void lancar() {
        System.out.println("Bola de basket " + getMarca() + " foi lancada!");
    }

    @Override
    public void ressaltar() {
        System.out.println("Bola de basket " + getMarca() + " ressaltou!");
    }
}