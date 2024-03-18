public class Gerente extends Funcionario {
    private double bonusAnual;

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonusAnual;
    }

}
