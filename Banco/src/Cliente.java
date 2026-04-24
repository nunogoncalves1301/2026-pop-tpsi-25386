import java.io.Serializable;

public class Cliente implements Serializable {
    private String nome;
    private String morada;
    private int idade;
    private int cc;
    private int nif;

    public Cliente(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    @Override
   public String toString(){
        return this.nome + " " + this.morada + " " + this.cc + " " + this.nif;
    }

}
