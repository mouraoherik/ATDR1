import java.util.Scanner;

public class Ex3 {
    static void main() {
        double valorImposto = 0;
        double salarioLiquido = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salario");
        double salario = scanner.nextDouble();

        if (salario > 45012.61){
            valorImposto = salario * 0.275;
            salarioLiquido = salario - valorImposto;
        }
        else if (salario >= 33919.81 && salario <= 45012.60){
            valorImposto = salario * 0.15;
            salarioLiquido = salario - valorImposto;
        }
        else if (salario >= 22847.77 && salario <= 33919.80){
            valorImposto = salario * 0.075;
            salarioLiquido = salario - valorImposto;
        }
        else{
            valorImposto = 0;
            salarioLiquido = salario - valorImposto;
        }


        System.out.printf("Salario liquido: R$ %.2f",salarioLiquido);
        System.out.printf("\nValor Imposto: R$ %.2f",valorImposto);
    }
}
