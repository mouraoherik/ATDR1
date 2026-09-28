public class Ex7Aluno {
    private final String nome;
    private final String matricula;
    private double nota1,nota2,nota3;

    public double calcularMedia(){
        return (nota1 + nota2 + nota3) / 3;
    }

    public Ex7Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;

    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public boolean verificarAprovacao(){
        if (calcularMedia() >= 7){
            System.out.println("Estado: Aprovado");
            return true;
        }
        else{
            System.out.println("Estado: Reprovado");
            return false;
        }
    }
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Notas: " + nota1 + " | " + nota2 + " | " + nota3);
        System.out.printf("Média: %.1f\n",calcularMedia());
    }
}
