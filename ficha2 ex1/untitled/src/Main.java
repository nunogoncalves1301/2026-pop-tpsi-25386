public class Main {
    public static void main(String[] args) {
        // Criar um Livro
        Livro l1 = new Livro();
        l1.introduzirDados("O Alquimista", "Paulo Coelho");

        // Criar uma Revista
        Revista r1 = new Revista();
        r1.introduzirDados("National Geographic", "Nº 250");

        // Mostrar informações
        System.out.println("--- Dados das Publicações ---");
        l1.mostraInformacao();
        r1.mostraInformacao();

        // Mostrar quantidade total (deve ser 2)
        System.out.println("\nTotal de publicações criadas: " + Publicacao.obterQuantidadePublicacoes());
    }
}
