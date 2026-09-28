public class Ex6App {
    static void main() {
        Ex6Veiculo v1 = new Ex6Veiculo("123-ABC","Uno",2003,55);

        v1.registrarViagem(45);
        v1.ExibirDetalhes();

        Ex6Veiculo v2 = new Ex6Veiculo("ABC-123","Onix",2023);
        v2.registrarViagem(20);
        v2.ExibirDetalhes();

    }
}
