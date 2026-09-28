public class Ex9ContaBancaria {
    private String titular;
    private double saldo;

    public Ex9ContaBancaria(String titular,double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
        }
        else System.out.println("Deposito Invalido");
    }

    public boolean sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            return true;
        }
        else return false;
    }

    public void exibirSaldo(){
        System.out.println("Saldo: " + saldo);
    }
}
