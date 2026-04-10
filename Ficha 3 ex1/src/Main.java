public class Main {

    public static void main(String[] args) {

        FuncionarioPorHora f1 = new FuncionarioPorHora("Ana Silva", 101, 12.50);
        f1.setNumHoras(160);

        FuncionarioComissao f2 = new FuncionarioComissao("Bruno Costa", 102);
        f2.setTotalVendas(5000.00);

        FuncionarioPorHoraEComissao f3 = new FuncionarioPorHoraEComissao("Carla Mendes", 103, 10.00);
        f3.setNumHoras(80);
        f3.setTotalVendas(3000.00);

        Empresa empresa = new Empresa();

        empresa.adicionarFuncionario(f1);
        empresa.adicionarFuncionario(f2);
        empresa.adicionarFuncionario(f3);

        // Tentar adicionar funcionario com codigo repetido
        FuncionarioPorHora f4 = new FuncionarioPorHora("Joao Dias", 101, 8.00);
        empresa.adicionarFuncionario(f4);

        System.out.println();

        // Mostrar pagamentos
        empresa.calcularPagamentos();
    }
}