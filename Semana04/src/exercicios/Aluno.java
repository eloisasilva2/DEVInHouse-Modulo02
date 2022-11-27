package exercicios;

public class Aluno extends Pessoa {
    private String curso;
    private String matricula;

    public Aluno() {
    }

    public Aluno(String nome, Integer idade, String curso, String matricula) {
        super(nome, idade);
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    @Override
    public void obterInformacoes() throws Excecao {
        System.out.println("Dados do Aluno:");
        super.obterInformacoes();
        System.out.println("Curso: " + getCurso() + "\nMatricula: " + getMatricula());

    }
}

