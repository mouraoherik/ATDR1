public class Ex8Gerente extends Ex8Funcionario{
    public Ex8Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (getSalarioBase() * 0.2);
    }
}
