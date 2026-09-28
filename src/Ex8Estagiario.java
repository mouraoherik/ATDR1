public class Ex8Estagiario extends Ex8Funcionario{
    public Ex8Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() - (getSalarioBase() * 0.1);
    }
}
