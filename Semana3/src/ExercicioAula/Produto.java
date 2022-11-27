package ExercicioAula;

public class Produto {
    private String nome;
    private String datavencimento;
    private Integer preco;

    public Produto() {

    }

    public Produto(String nome, String datavencimento, Integer preco) {
        this.nome = nome;
        this.datavencimento = datavencimento;
        this.preco = preco;
    }


    public void validaDataVencimento(){
        this.datavencimento.substring(0,2);
        System.out.println(this.datavencimento.substring(0,2));
    }
}
