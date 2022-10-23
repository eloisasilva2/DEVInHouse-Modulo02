package exercicios;

public class Mentor extends Pessoa {
    private String linguagemDeProgramacao;

    public Mentor() {
    }

    public Mentor(String nome, Integer idade, String linguagemDeProgramacao) {
        super(nome, idade);
        this.linguagemDeProgramacao = linguagemDeProgramacao;
    }

    public String getLinguagemDeProgramacao() {
        return linguagemDeProgramacao;
    }

    public void setLinguagemDeProgramacao(String linguagemDeProgramacao) {
        this.linguagemDeProgramacao = linguagemDeProgramacao;
    }

    @Override
    public void obterInformacoes() throws Excecao {
        System.out.println("\nDados do Mentor:");
        super.obterInformacoes();
        System.out.println("Linguagem de programação: " + getLinguagemDeProgramacao());

    }
}


