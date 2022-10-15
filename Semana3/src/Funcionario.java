public class Funcionario {
    //Atributos:
    private String nome;
    private String funcional;
    private Double salario;
    private Double saldo;

    //Construtores:

    //Construtor Vazio ou Default:
    Funcionario(){}

    //Alt + Insert para adicionar construtor:
    public Funcionario(String nome, String funcional, Double salario) {
        this.nome = nome;
        this.funcional = funcional;
        this.salario = salario;
    }

    public Funcionario(String nome, String funcional) {
        this.nome = nome;
        this.funcional = funcional;
    }

    //Métodos:
    //Modificador/Tipo/Nome/Parâmetros
    public String adicionaValorNome(String novoNome){
        this.nome = novoNome;
        return this.nome;
    }

    //Método para pegar um valor:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getFuncional() {
        return funcional;
    }


    public void setFuncional(String funcional) {
        this.funcional = funcional;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double recebeSalario(){
        return saldo +=salario;
    }

    public Double recebeSalario(Double bonus){
        return saldo= saldo +  salario + bonus;
    }
}
