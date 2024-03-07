public class App {
    public static void main(String[] args) throws Exception {
        int vetor[] = {1,2,3};
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        System.out.println(soma);
    }
}
