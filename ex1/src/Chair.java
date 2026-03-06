public class Chair {

    String nome;
    String material;
    int price;

    //class constructor
    Chair(String material , int price, String nome) {
        this.material = material;
        this.price = price;
        this.nome = nome;
    }

    public String toString() {
        return "Chair: " + this.material + ", " + this.price + ", " + this.nome;
    }
}
