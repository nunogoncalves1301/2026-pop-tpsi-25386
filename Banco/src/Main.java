void main() {
    Repositorio r = Repositorio.getInstancia();

    Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.println("1- Adicionar cliente");
        System.out.println("2- Adicionar conta");
        System.out.println("3- Levantar dinheiro");
        System.out.println("4- Depositar dinheiro");
        System.out.println("5- Transferir entre contas");
        System.out.println("6- Consultar Saldo de Conta");
        System.out.println("7- Listar movimentos Conta");
        System.out.println("8- Guardar e sair");
        System.out.println("Indique a opcao:");

        switch (sc.nextInt()) {
            case 1:
                sc.nextLine();
                Cliente c = new Cliente();
                System.out.println("Digite o nome do cliente: ");
                c.setNome(sc.nextLine());
                System.out.println("Morada");
                c.setNome(sc.nextLine());
                System.out.println("CC:");
                c.setCc(sc.nextInt());
                System.out.println("NIF:");
                c.setNif(sc.nextInt());

                r.addCliente(c);
                break;

            case 2:
                sc.nextLine();
                System.out.println("Saldo inicial para a conta: ");
                float saldo = sc.nextFloat();
                Conta co = new Conta(saldo);
                int x = 0;
                for(Cliente cliente : r.getClientes()){
                    x++;
                    System.out.println( x + " - " + cliente);
                }
                System.out.println("Indique o cliente que pretende associar:");
                x = sc.nextInt() -1;
                co.adicionarTitular(r.getClientes().get(x));

                r.addConta(co);
                System.out.println("Criada a conta com numero: " + co.getNumConta());
                break;

            case 3:
                for(Conta conta  : r.getContas()){
                    System.out.println(conta);
                }
                System.out.println("Indique a conta:");
                int numConta = sc.nextInt();
                System.out.println("Indique o valor a levantar");
                float valorLevantar = sc.nextFloat();
                sc.nextLine();
                System.out.println("Descrição: ");
                String ds = sc.nextLine();


                for(Conta conta : r.getContas()){
                    if(conta.getNumConta() == numConta){
                        conta.levantarDinheiro(valorLevantar, ds);
                        break;
                    }
                }

            case 4:
                for(Conta conta : r.getContas()){
                    System.out.println(conta);
                }
                System.out.println("Indique o numero da conta:");
                int numConta2 = sc.nextInt();
                System.out.println("Indique o valor a depositar");
                float valorDepositar = sc.nextFloat();
                sc.nextLine();
                System.out.println("Descrição");
                String ds1 = sc.nextLine();

                for(Conta conta : r.getContas()){
                    if(conta.getNumConta() == numConta2){
                        conta.depositarDinnheiro(valorDepositar, ds1);
                        break;
                    }
                }
                break;

            case 5:
                System.out.println("Indique a conta de origem: ");
                int origem = sc.nextInt();
                System.out.println("Indique a conta de destino: ");
                int destino = sc.nextInt();
                System.out.println("Indique o valor a transferir:  ");
                float valorTransferir = sc.nextFloat();
                sc.nextLine();
                System.out.println("Descrição: ");
                String dsTrasnf = sc.nextLine();

                Conta cOri = null, cDest = null;
                for (Conta conta : r.getContas()){
                    if(conta.getNumConta() == origem){
                        cOri = conta;
                    }
                    if(conta.getNumConta() == destino){
                        cDest = conta;
                    }
                }
                cOri.transferenciaEntreContas(cDest, valorTransferir , dsTrasnf);
                break;

            case 6:
                for(Conta conta : r.getContas()){
                    System.out.println(conta);
                }
                System.out.println("Indique o numero de conta: ");
                int numConta1= sc.nextInt();

                for(Conta conta : r.getContas()){
                    if(conta.getNumConta() == numConta1){
                        System.out.println("Saldo: " + conta.getSaldo());
                        break;
                    }
                }

            case 7:
                System.out.println("Indique a conta a ver os movimentos: ");
                int numConta3 = sc.nextInt();

                for(Conta conta : r.getContas()){
                    if(conta.getNumConta() == numConta3){
                        System.out.println(conta);
                        System.out.println("Movimentos: ");
                        for(Movimento m : conta.getMovimentos()){
                            System.out.println("\t" + m);
                        }
                    }
                }
                break;

            case 0:

        }
    }


}


