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

    public void obterInformacoes() {
        System.out.println("Mentor: " + getNome());
        System.out.println("Idade: " +getIdade());
        System.out.println("Linguagem de programação: " + linguagemDeProgramacao);

    }
}


