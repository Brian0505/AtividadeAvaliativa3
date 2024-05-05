interface Trabalhavel {

    void trabalhar();
    void relatarProgresso();

}

abstract class Funcionario implements Trabalhavel {

    protected String nome;
    protected int matricula;
    
    public Funcionario(String nome, int matricula) {

        this.nome = nome;
        this.matricula = matricula;
        
    }
    
    public abstract double calcularSalario();

}