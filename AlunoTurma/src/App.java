public class App {
    public static void main(String[] args) throws Exception {
        
        Aluno aluno1 = new Aluno("Ryan", 17, new double[]{7.5, 8, 6.5});
        Aluno aluno2 = new Aluno("Renan", 18, new double[]{9, 8, 7});
        Aluno aluno3 = new Aluno("Pedro", 17, new double[]{7, 8, 9});

        Turma turma1 = new Turma(new Aluno[]{aluno1, aluno2, aluno3});

        double mediaDaTurma = turma1.mediaNotas();

        Aluno alunoMaisVelho = turma1.encontrarAlunoMaiorIdade();

        System.out.printf("A média da turma é  %.2f.\n", mediaDaTurma);
        System.out.printf("O aluno mais velho é %s, com %d anos.\n", alunoMaisVelho.getNome(), alunoMaisVelho.getIdade());
        
    }
}
