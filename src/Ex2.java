import java.util.Scanner;

public class Ex2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        char ch;
        boolean temMaiuscula = false;
        boolean temNumero = false;
        boolean temCaracterEspecial = false;

        while (!temMaiuscula || !temNumero || !temCaracterEspecial){
            temMaiuscula = false;
            temNumero = false;
            temCaracterEspecial = false;

            System.out.println("Digite sua senha");
            String senha = scanner.nextLine();

            if (senha.length() >= 8) {
                for (int i = 0; i < senha.length(); i++) {
                    ch = senha.charAt(i);

                    if (Character.isUpperCase(ch)) temMaiuscula = true;
                    else if (!Character.isLetterOrDigit(ch)) temCaracterEspecial = true;
                    else if (Character.isDigit(ch)) temNumero = true;

                }
            }
            else{
                System.out.println("Senha tem menos que 8 caracteres");
                continue;
            }

            if (!temMaiuscula) System.out.println("Senha deve conter letra maiuscula");
            if (!temNumero) System.out.println("Senha deve conter um numero");
            if (!temCaracterEspecial) System.out.println("Senha deve conter um caractere especial");
        }

        System.out.println("Senha criada com sucesso!");
    }
}
