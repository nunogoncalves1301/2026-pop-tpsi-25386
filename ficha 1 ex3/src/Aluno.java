public class Aluno extends UnidadeCurricular {
    //Atributos de acesso privado
    private String nome;
    private String cidade;
    private String email;
    private int idade;
    private int numeroCartao;

    //Array de acesso privado inicializado com 5 posições
    private Double[] notas = new Double[5];
    private int contNota = 0; // Auxiliar para gerir o preenchimento do array

    //Construtor sem argumentos
    public Aluno() {
    }

    //Construtor com todos os atributos exceto o array notas
    public Aluno(String nome, String cidade, String email, int idade, int numeroCartao) {
        this.nome = nome;
        this.cidade = cidade;
        this.email = email;
        this.idade = idade;
        this.numeroCartao = numeroCartao;
    }

    //Métodos Getter e Setter
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    // ... (repetir para os outros atributos)

    //Metodo addNota()
    public void addNota(double nota) {
        if (contNota < notas.length) {
            this.notas[contNota] = nota; // Guarda a nota individual na posição correta
            this.contNota++;
        } else {
            System.out.println("Limite de notas (5) atingido para o aluno " + nome);
        }
    }

    //Metodo obterMedia()
    public double obterMedia() {
        if (contNota == 0) return 0.0;
        double soma = 0;
        for (int i = 0; i < contNota; i++) {
            soma += notas[i];
        }
        return soma / contNota;
    }

    //Metodo obterMelhorNota ()
    public double obterMelhorNota() {
        if (contNota == 0) return 0.0;
        double melhor = notas[0];
        for (int i = 1; i < contNota; i++) {
            if (notas[i] > melhor) {
                melhor = notas[i];
            }
        }
        return melhor;
    }

    // Metodo toString ()
    @Override
    public String toString() {
        return "Nome: " + nome + " | Cidade: " + cidade + " | Nº Cartão: " + numeroCartao +
                "\nMédia: " + obterMedia() + " | Melhor Nota: " + obterMelhorNota();
    }
    public int getNumeroCartao() {
        return this.numeroCartao;
    }
}






