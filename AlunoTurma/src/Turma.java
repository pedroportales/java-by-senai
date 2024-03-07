public class Turma {
    
    private Aluno alunos[];

    Turma(Aluno alunos[]) {
        this.alunos = alunos;
    }

    public double mediaNotas() {
        double soma = 0;
        int totalNotas = 0;

        for (Aluno aluno : alunos) {
            double notas[] = aluno.getNotas();
            
            for (double nota : notas) {
                soma += nota;
                totalNotas++;
            }
        }

        return soma / totalNotas;
    }

    public Aluno encontrarAlunoMaiorIdade() {
        Aluno alunoMaiorIdade = alunos[0];

        for (int i = 1; i < alunos.length; i++) {
            if (alunos[i].getIdade() > alunoMaiorIdade.getIdade()) {
                alunoMaiorIdade = alunos[i];
            }
        }

        return alunoMaiorIdade;
    }
}
