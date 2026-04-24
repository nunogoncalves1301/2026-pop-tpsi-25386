import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Repositorio {
    private static Repositorio instancia;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Conta> contas = new ArrayList<>();

    private Repositorio() {}

    public static Repositorio getInstancia() {
        if (instancia == null) {
            carregarDados();

            if(instancia == null) {
                instancia = new Repositorio();
            }
        }
        return instancia;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void addCliente(Cliente c) {
        this.clientes.add(c);
    }

    public void addConta(Conta c) {
        this.contas.add(c);
    }

    public static void guardarDados(){
        try{
            FileOutputStream ficheiro = new FileOutputStream("dados.bin");
            ObjectOutputStream out = new ObjectOutputStream(ficheiro);

            out.writeObject(instancia);

            out.close();
            ficheiro.close();
        }catch(Exception e){
            System.out.println("Erro a guardar dados." + e.getMessage());
        }
    }

    public static void carregarDados(){

        try{
            FileInputStream ficheiro = new FileInputStream("dados.bin");
            ObjectInputStream in = new ObjectInputStream(ficheiro);

            instancia = (Repositorio) in.readObject();

            in.close();
            ficheiro.close();
        }catch(Exception e){
            System.out.println("Erro ao carregar dados." + e.getMessage());
        }
    }
}
