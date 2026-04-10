public class Empresa {

    private Funcionario[] funcionarios;

    public Empresa() {
        this.funcionarios = new Funcionario[5];
    }

    public boolean adicionarFuncionario(Funcionario f) {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null && funcionarios[i].getCod_Funcionario() == f.getCod_Funcionario()) {
                System.out.println("Erro: ja existe um funcionario com o codigo " + f.getCod_Funcionario());
                return false;
            }
        }
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] == null) {
                funcionarios[i] = f;
                return true;
            }
        }
        System.out.println("Erro: array de funcionarios cheio.");
        return false;
    }

    public void calcularPagamentos() {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null) {
                System.out.println("Nome: " + funcionarios[i].getNome());
                System.out.println("Pagamento: " + funcionarios[i].calculaPagamento() + " euros");
                System.out.println();
            }
        }
    }
}