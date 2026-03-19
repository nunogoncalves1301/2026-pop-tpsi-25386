public class Aluno {

    private String nome;
    private String cidade;
    private String email;
    private int idade;
    private int numeroCartao;
    private double notas[] = new double[5];
    private int contNota = 0;

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String toString() {
        return " Nome : " + nome + "\nCidade : " + cidade + "\nEmail : " + email + "\nIdade : " + idade + "\nNumero cartão : " + numeroCartao;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void addNotas(double notaReferida) {
        if (contNota < notas.length) {
            this.notas[contNota] = notaReferida;
            contNota++;
        } else {
            System.out.println("Limite de notas (5) atingido para o aluno " + nome);
        }
    }

    public double obterMedia() {
        if (contNota == 0) return 0.0;
        double soma = 0;
        for (int i = 0; i < contNota; i++) {
            soma += notas[i];
        }
        return soma / contNota;
    }

    // Método para obter a melhor nota
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
}






