import java.util.ArrayList;

public class Conta {
    private static int contador = 0;
    private int numConta;
    private float saldo;
    private ArrayList<Cliente> titulares;
    private ArrayList<Movimento> movimentos;

    public Conta(float saldo) {
        contador++;
        this.numConta = numConta;
        this.saldo = saldo;
        this.titulares = new ArrayList<>();
        this.movimentos = new ArrayList<>();
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Conta.contador = contador;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Cliente> getTitulares() {
        return titulares;
    }

    public void setTitulares(ArrayList<Cliente> titulares) {
        this.titulares = titulares;
    }

    public ArrayList<Movimento> getMovimentos() {
        return movimentos;
    }

    public void setMovimentos(ArrayList<Movimento> movimentos) {
        this.movimentos = movimentos;
    }

    public float levantarDinheiro(float valor, String descricao) {
        movimentos.add(new Movimento("Levantamento", valor , descricao));
       this.saldo -= valor;
       return this.saldo;
    }

    public float depositarDinnheiro(float valor, String descricao) {
        movimentos.add(new Movimento("Deposito", valor , descricao));

        this.saldo += valor;
        return this.saldo;
    }

    public float transferenciaEntreContas(Conta c, float valor, String descricao) {
        c.depositarDinnheiro(valor, descricao);
        this.levantarDinheiro(valor, descricao);

        return this.levantarDinheiro(valor, descricao);
    }

    public void adicionarTitular(Cliente c) {
        titulares.add(c);
    }
    public void listarMovimentos() {
        for (Movimento m : movimentos) {
            System.out.println(m);
        }
    }

    @Override
    public String toString() {
        return this.numConta + " | " + this.saldo + " | Qnt. titulares: " + this.titulares.size();
    }
}
