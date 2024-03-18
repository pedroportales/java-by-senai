public class Elevador {
    private Integer andarAtual = 0;
    private Integer totalAndares;
    private Integer capacidade;
    private Integer pessoasPresentes = 0;

    Elevador(Integer capacidade, Integer totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
    }

    public Integer getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(Integer andarAtual) {
        this.andarAtual = andarAtual;
    }

    public Integer getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(Integer totalAndares) {
        this.totalAndares = totalAndares;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Integer getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(Integer pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    public void entrar() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
        } else {
            System.out.println("Capacidade máxima já foi atingida.");
        }

        System.out.printf("Número atual de pessoas no elevador: %d.\n", pessoasPresentes);
    }

    public void sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.printf("Andar atual: %d.\n", andarAtual);
        } else {
            System.out.println("Não há ninguém no elevador.");
        }

        System.out.printf("Número atual de pessoas no elevador: %d.\n", pessoasPresentes);
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.printf("Andar atual: %d.\n", andarAtual);
        } else {
            System.out.println("Já está no último andar.");
        }

        System.out.printf("Andar atual: %d.\n", andarAtual);
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
        } else {
            System.out.println("Já está no térreo.");
        }

        System.out.printf("Andar atual: %d.\n", andarAtual);
    }
}