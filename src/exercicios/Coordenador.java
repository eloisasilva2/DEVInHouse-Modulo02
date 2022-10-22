package exercicios;

public class Coordenador extends Pessoa {
    private Integer quantidadeCursosCoord;

    public Coordenador() {
    }

    public Coordenador(String nome, Integer idade, Integer quantidadeCursosCoord) {
        super(nome, idade);
        this.quantidadeCursosCoord = quantidadeCursosCoord;
    }

    public Integer getQuantidadeCursosCoord() {
        return quantidadeCursosCoord;
    }

    public void setQuantidadeCursosCoord(Integer quantidadeCursosCoord) {
        this.quantidadeCursosCoord = quantidadeCursosCoord;
    }

    public void obterInformacoes() {
        System.out.println("Coordenador: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Quantidade de cursos: " + quantidadeCursosCoord);

    }
}
