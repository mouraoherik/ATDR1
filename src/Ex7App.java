public class Ex7App {
    static void main() {
        Ex7Aluno a1 = new Ex7Aluno("Joao","1234ABC");

        a1.setNota1(9.2);
        a1.setNota2(8.5);
        a1.setNota3(7);

        a1.exibirDados();
        a1.verificarAprovacao();

        System.out.println("================");

        Ex7Aluno a2 = new Ex7Aluno("Maria","5678DEF");
        a2.setNota1(5.5);
        a2.setNota2(4.8);
        a2.setNota3(6.7);

        a2.exibirDados();
        a2.verificarAprovacao();
    }
}
