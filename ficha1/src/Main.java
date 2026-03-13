class Main {
        public static void main(String[] args) {

            Stand stand = new Stand();

            Veiculo v1 = new Veiculo("BMW", "X5");
            Veiculo v2 = new Veiculo("Audi", "A3");
            Veiculo v3 = new Veiculo("Tesla", "Model 3");

            stand.adicionarVeiculo(v1);
            stand.adicionarVeiculo(v2);
            stand.adicionarVeiculo(v3);

            // obter veículo pelo modelo
            Veiculo encontrado = stand.obterVeiculo("A3");
            if (encontrado != null) {
                System.out.println("Veículo encontrado: " + encontrado);
            }

            // quantidade de veículos
            System.out.println("Quantidade de veículos: " + stand.obterQuantidadeVeiculos());

            // listar veículos de uma marca
            stand.listarVeiculos("BMW");

        }
    }



