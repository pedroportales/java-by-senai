import java.util.ArrayList;

class Aluno {
    private String nome;
    private String sobrenome;
    private int idade;

    Aluno(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public int getIdade(){
        return idade;
    }
    

}

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Aluno> listaDeAlunos = new ArrayList<>();

        // Adicionando alunos
        listaDeAlunos.add("Renan", "Cardoso", 18);

    }
}
