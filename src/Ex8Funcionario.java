public abstract class Ex8Funcionario {
    private final String nome;
    private double salarioBase;

    public Ex8Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public abstract double calcularSalario();
}
