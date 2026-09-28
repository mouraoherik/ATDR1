public class Ex9App {
    static void main() {
        Ex9ContaBancaria c1 = new Ex9ContaBancaria("Joao",550.50);

        c1.depositar(500);
        c1.depositar(-250);
        c1.exibirSaldo();

        c1.sacar(-500);
        c1.exibirSaldo();
        c1.sacar(1000);
        c1.exibirSaldo();
    }
}
