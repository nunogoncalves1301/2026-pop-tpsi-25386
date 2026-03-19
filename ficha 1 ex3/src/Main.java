public class Main {
    public static void main(String[] args) {
        // Inicializar a Unidade Curricular
        UnidadeCurricular uc = new UnidadeCurricular();

        // Criar alunos e adicionar notas
        Aluno a1 = new Aluno("Ana", "Viana", "ana@ipvc.pt", 19, 1001);
        a1.addNota(18); a1.addNota(16);

        Aluno a2 = new Aluno("Pedro", "Braga", "pedro@ipvc.pt", 20, 1002);
        a2.addNota(14); a2.addNota(15);

        //Testar adicionar alunos
        uc.adicionarAluno(a1);
        uc.adicionarAluno(a2);

        //Listar todos os alunos
        uc.listarAlunos();

        // Obter e mostrar o aluno com melhor média
        Aluno melhor = uc.obterAlunoMelhorMedia();
        if (melhor != null) {
            System.out.println("\nMelhor aluno da UC: " + melhor.getNome());
        }
    }
}