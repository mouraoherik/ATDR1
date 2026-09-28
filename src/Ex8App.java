public class Ex8App {
    static void main() {
        Ex8Funcionario f1 = new Ex8Gerente("Joao",1700);

        System.out.println(f1.getSalarioBase());

        Ex8Funcionario f2 = new Ex8Estagiario("maria",1700);
        System.out.println(f2.getSalarioBase());
    }
}
