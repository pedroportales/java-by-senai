class Livro {
    
    public String titulo;
    public String autor;
    public int anoDePublicacao;

    Livro(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Livro livro = new Livro("IT: A Coisa", "Stephen King", 1986);

        System.out.println("---- LIVRO ----");
        System.out.println("Título: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Ano de publicação: " + livro.anoDePublicacao);
    }
}
