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

    @Override
    public void obterInformacoes() throws Excecao {
        System.out.println("\nDados do Coordenador:");
        super.obterInformacoes();
        System.out.println("Quantidade de cursos: " + getQuantidadeCursosCoord());

    }
}
