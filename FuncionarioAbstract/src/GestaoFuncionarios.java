import java.util.ArrayList;

public class GestaoFuncionarios {
    private ArrayList<Funcionario> funcionarios;

    GestaoFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario func) {
        funcionarios.add(func);
    }

    public double calcularSalarios() {
        double total = 0;
        for (Funcionario func : funcionarios) {
            total += func.calcularSalario();
        }

        System.out.printf("Salário total: %d.\n", total);

        return total;
    }

    public void listarFuncionarios() {
        for (Funcionario func : funcionarios) {
            System.out.println("------------------");
            System.out.println("Nome: " + func.getNome());
            System.out.println("ID: " + func.getId());
            System.out.println("Salário: " + func.calcularSalario());
        }

        System.out.println("------------------");
    }
}
