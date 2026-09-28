
import java.util.Random;
import java.util.Scanner;

public class Ex11 {
    static void main() {
        int acertos = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] arrayLoteria = new int[6];
        int[] arrayChutes = new int[6];

        for (int i = 0; i < arrayLoteria.length; i++){
            int numAleatorio = random.nextInt(60+1);
            arrayLoteria[i] = numAleatorio;
            for (int j = 0; j < i; j++){
                if (numAleatorio == arrayLoteria[j]){
                    i--;
                    break;
                }
            }
        }

        System.out.println("Digite 6 numeros:");
        for (int i = 0; i < arrayChutes.length; i++) {
            arrayChutes[i] = scanner.nextInt();
        }

        System.out.println("Você digitou:");
        for (int arrayAcerto : arrayChutes) {
            System.out.println(arrayAcerto);
        }

        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++) {
                if (arrayLoteria[i] == arrayChutes[j]){
                    acertos++;
                }
            }
        }


        System.out.println("========================");
        System.out.println("Acertos: " + acertos);

    }
}