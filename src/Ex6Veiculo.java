public class Ex6Veiculo {
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;

    public Ex6Veiculo(String placa, String modelo, int anoFabricacao) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = 0;
    }

    public Ex6Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public void ExibirDetalhes(){
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricacao: " + anoFabricacao);
        System.out.println("Kms: " + quilometragem);
        System.out.println("===============");
    }

    public void registrarViagem(double km){
        if (km > 0){
            quilometragem += km;
        }
        else System.out.println("Km Invalido");;
    }
}
