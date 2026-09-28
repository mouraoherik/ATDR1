import java.util.Scanner;

public class Ex12 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro usuario");
        String usuario1 = scanner.nextLine();
        System.out.println("Digite o nome do segundo usuario");
        String usuario2 = scanner.nextLine();

        String[] arrayMensagens = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println(usuario1 + ", digite sua mensagem");
            arrayMensagens[i] = scanner.nextLine();
            i++;
            System.out.println(usuario2 + ", digite sua mensagem");
            arrayMensagens[i] = scanner.nextLine();
        }


        System.out.println("===== Histórico de Mensagens =====");
        for (int i = 0; i < 10; i++) {
            System.out.println(usuario1 + ": " + arrayMensagens[i]);
            i++;
            System.out.println(usuario2 + ": " + arrayMensagens[i]);
        }

        System.out.println("Obrigado por utilizarem o sistema! Boa sorte para vocês!");
    }
}
