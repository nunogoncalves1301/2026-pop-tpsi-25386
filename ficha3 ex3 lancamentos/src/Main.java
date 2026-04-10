public class Main {

    public static void main(String[] args) {

        Pedra pedra = new Pedra();
        pedra.lancar();

        System.out.println();

        BolaBasket basket = new BolaBasket("Nike");
        basket.lancar();
        basket.ressaltar();

        System.out.println();

        BolaVoleibol voleibol = new BolaVoleibol("Wilson");
        voleibol.lancar();
        voleibol.ressaltar();
    }
}