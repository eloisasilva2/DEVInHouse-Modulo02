package exercicios;

public class Main {
    public static void main(String[] args) {
                Aluno aluno = new Aluno("Alberto",  20, "Java", "123GRF");
        aluno.setNome("Alberto");
        aluno.setIdade(20);
        aluno.setCurso("Java");
        aluno.setMatricula("123GRF");

        Mentor mentor = new Mentor("Rogério",  20, "Java");
        mentor.setNome("Alberto");
        mentor.setIdade(20);
        mentor.setLinguagemDeProgramacao("Java");

        Coordenador coordenador = new  Coordenador("Paulo",  20, 3);
        coordenador.setNome("Alberto");
        coordenador.setIdade(20);
        coordenador.setQuantidadeCursosCoord(3);

        aluno.obterInformacoes();
        mentor.obterInformacoes();
        coordenador.obterInformacoes();
    }
}
