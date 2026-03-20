import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); // criamos esta "variavel" para ler valores do user
        Publicacao[] lista = new Publicacao[20];
        int contador = 0;
        int opcao = 0;

        do { //Criamos um ciclo do while para aguardar o user introduzir um valor do menu
            System.out.println("\n--- MENU BIBLIOTECA ---");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Adicionar Revista");
            System.out.println("3. Listar Tudo");
            System.out.println("4. Verificar Existência (por ID)");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = leitor.nextInt(); // o valor introduzido pelo user vai ser introduzido na variavale opcao
            leitor.nextLine(); // Limpar o buffer

            switch (opcao) { //do valor escolhido pelo user vai executar o caso correspondente
                case 1: //se o user digitar 1 executa o código seguinte
                    Livro l = new Livro();
                    System.out.print("Nome do Livro: ");
                    String nL = leitor.nextLine();// A string nL vai receber o valor introduzido para nome do livro
                    System.out.print("Autor: ");
                    String aL = leitor.nextLine(); // A string aL vai receber o valor introduzido para autor do livro
                    l.introduzirDados(nL, aL);// o objeto livro vai receber os valores introduzidos de autor e de nome
                    lista[contador++] = l; // Aqui ocorre Polimorfismo: um objeto 'Livro' é guardado num array de 'Publicacao'
                    break;

                case 2: //se o user digitar 2 executa o código seguinte
                    Revista r = new Revista();
                    System.out.print("Nome da Revista: ");
                    String nR = leitor.nextLine();
                    System.out.print("Número da Edição: ");
                    String eR = leitor.nextLine();
                    r.introduzirDados(nR, eR);
                    lista[contador++] = r;
                    break;

                case 3: //se o user digitar 3 executa o código seguinte
                    System.out.println("\n--- LISTAGEM ---");
                    for (int i = 0; i < contador; i++) {
                        lista[i].mostraInformacao(); // Executa o metodo de mostrar informacao da lista ate o valor i ser igual ao contador
                        System.out.println("----------------");
                    }
                    break;

                case 4: //se o user digitar 4 executa o código seguinte
                    System.out.print("Digite o ID a procurar: ");
                    int id = leitor.nextInt(); // vai ler o id introduzido pelo user
                    if (verificaExistenciaValor(lista, id, contador)) { // vai verificar se o id inserido existe no sistema utilizando o metodo verificaExistenciaValor
                        System.out.println("A publicação com o ID " + id + " existe no sistema.");
                    } else {
                        System.out.println("ID não encontrado.");
                    }
                    break;
            }
        } while (opcao != 0); // apresenta o "menu" enquanto o user nao apresentar um valor aceite entre 0-4 se apresentar 0 o menu fecha
    }

    public static boolean verificaExistenciaValor(Publicacao[] array, int numProcurado, int totalExistente) {
        for (int i = 0; i < totalExistente; i++) { // Percorre o array desde a primeira posição até ao limite de objetos inseridos
            if (array[i].getNumeroPublicacao() == numProcurado) {
                /* Acede ao objeto na posição 'i' e chama o metodo getNumeroPublicacao()
                Como o metodo está na classe 'mae' (Publicacao), funciona para qualquer
                subclasse (Livro/Revista) sem erro.
                */
                return true;
            }
        }
        return false;
    }

}
