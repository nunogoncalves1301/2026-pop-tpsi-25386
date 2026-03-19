    public class UnidadeCurricular {
        //Atributo: array de Aluno
        private Aluno[] alunos;
        private int contador; // Auxiliar para gerir o preenchimento do array

        //Construtor sem argumentos que inicializa o array para 20 alunos
        public UnidadeCurricular() {
            this.alunos = new Aluno[20];
            this.contador = 0;
        }

        //Métodos Getter e Setter para o array
        public Aluno[] getAlunos() { return alunos; }
        public void setAlunos(Aluno[] alunos) { this.alunos = alunos; }

        //Metodo adicionarAluno()
        public void adicionarAluno(Aluno novoAluno) {
            //verificar se o número do cartão já existe
            if (obterAluno(novoAluno.getNumeroCartao()) != null) {
                System.out.println("Erro: Aluno com o número " + novoAluno.getNumeroCartao() + " já existe!");
                return;
            }

            if (contador < alunos.length) {
                alunos[contador] = novoAluno;
                contador++;
            } else {
                System.out.println("Turma cheia!");
            }
        }

        //Metodo obter aluno pelo cartao
        public Aluno obterAluno(int numCartao) {
            for (int i = 0; i < contador; i++) {
                if (alunos[i].getNumeroCartao() == numCartao) {
                    return alunos[i];
                }
            }
            return null;
        }

        // f. Metodo listarAlunos()
        public void listarAlunos() {
            System.out.println("\n--- Lista de Alunos na Unidade Curricular ---");
            for (int i = 0; i < contador; i++) {
                System.out.println(alunos[i].toString());
            }
        }

        // g. Metodo obterAlunoMelhorMedia()
        public Aluno obterAlunoMelhorMedia() {
            if (contador == 0) return null;

            Aluno melhor = alunos[0];

            for (int i = 1; i < contador; i++) {
                double mediaAtual = alunos[i].obterMedia();
                double melhorMedia = melhor.obterMedia();

                if (mediaAtual > melhorMedia) {
                    melhor = alunos[i];
                }
                // Critério de desempate: se médias iguais, escolhe cartão mais baixo
                else if (mediaAtual == melhorMedia) {
                    if (alunos[i].getNumeroCartao() < melhor.getNumeroCartao()) {
                        melhor = alunos[i];
                    }
                }
            }
            return melhor;
        }
    }

