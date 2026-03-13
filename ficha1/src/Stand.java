public class Stand {

    private Veiculo[] veiculos = new Veiculo[50];

    // Construtor sem argumentos
    public Stand() {
    }

    // Getter
    public Veiculo[] getVeiculos() {
        return veiculos;
    }

    // Setter
    public void setVeiculos(Veiculo[] veiculos) {
        this.veiculos = veiculos;
    }

    // Adicionar Veiculo
    public void adicionarVeiculo(Veiculo v) {
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] == null) {
                veiculos[i] = v;
                break;
            }
        }
    }

    // Obter Veiculo pelo modelo
    public Veiculo obterVeiculo(String modelo) {
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] != null && modelo.equals(veiculos[i].getModelo())) {
                return veiculos[i];
            }
        }
        return null;
    }

    // Quantidade de veículos
    public int obterQuantidadeVeiculos() {
        int contador = 0;

        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] != null) {
                contador++;
            }
        }

        return contador;
    }

    //  Listar veículos por marca
    public void listarVeiculos(String marca) {

        boolean encontrou = false;

        for (int i = 0; i < veiculos.length; i++) {

            if (veiculos[i] != null && marca.equals(veiculos[i].getMarca())) {
                System.out.println(veiculos[i]);
                encontrou = true;
            }

        if (!encontrou) {
            System.out.println("O stand não possui veículos da marca " + marca);
        }
    }
}
}