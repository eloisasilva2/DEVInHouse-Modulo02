package ExercicioEmagrecimento;

public class Cliente {
    private String nome;
    private Double peso;
    private Double altura;
    private Integer idade;

    public Cliente(String nome, Double peso, Double altura, Integer idade) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public Cliente(Double peso, Double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public String IMC(){
        double resultado = peso/(altura*altura);
        if(resultado < 18.5) return "Muito Magro";
        else if (resultado >= 18.5 && resultado <= 24.9) return "Normal";
        else if (resultado >= 25.0 && resultado <=29.9) return "Sobrepeso";
        else if (resultado >= 30.0 && resultado <= 34.9) return "Obeso grau I";
        else if (resultado >= 35.0 && resultado <= 39.9) return "Obeso grau II";
        else return "Obeso grau III ou Mórbido";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}