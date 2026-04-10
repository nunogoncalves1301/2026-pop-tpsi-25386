public abstract class Funcionario {
    private String nome;
    private int cod_Funcionario;

    public Funcionario(String nome, int cod_Funcionario) {
        this.nome = nome;
        this.cod_Funcionario = cod_Funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod_Funcionario() {
        return cod_Funcionario;
    }

    public double calculaPagamento(){
        return 0;
    }
}
