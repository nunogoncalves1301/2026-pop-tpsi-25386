public class Main {

    public static void main(String[] args) {

        FuncionarioPorHora f1 = new FuncionarioPorHora("Ana Silva", 101, 12.50);
        f1.setNumHoras(160);
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Pagamento: " + f1.calculaPagamento() + " euros");

        System.out.println();

        FuncionarioComissao f2 = new FuncionarioComissao("Bruno Costa", 102);
        f2.setTotalVendas(5000.00);
        System.out.println("Nome: " + f2.getNome());
        System.out.println("Pagamento: " + f2.calculaPagamento() + " euros");

        System.out.println();

        FuncionarioPorHoraEComissao f3 = new FuncionarioPorHoraEComissao("Carla Mendes", 103, 10.00);
        f3.setNumHoras(80);
        f3.setTotalVendas(3000.00);
        System.out.println("Nome: " + f3.getNome());
        System.out.println("Pagamento: " + f3.calculaPagamento() + " euros");
    }
}