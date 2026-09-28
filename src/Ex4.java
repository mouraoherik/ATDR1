import java.util.Scanner;

public class Ex4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double juros = 0.03;
        double totalPago = 0;
        double parcelaMensal = 0;

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite o valor do emprestimo");
        double emprestimo = scanner.nextDouble();

        System.out.println("Quantas parcelas deseja pagar? Min:6 Max:48 ");
        int parcelas = scanner.nextInt();

        if (parcelas >= 6 && parcelas <= 48){
           for (int i = 0; i < parcelas; i++){
               parcelaMensal = (emprestimo / parcelas) + (emprestimo * juros);
               totalPago += parcelaMensal;
            }
        }
        else System.out.println("Numero invalido de parcelas");

        System.out.printf("Valor total a se pagar: R$ %.2f",totalPago);
        System.out.printf("\nParcela a ser paga a cada mes: R$ %.2f",parcelaMensal);
    }
}
