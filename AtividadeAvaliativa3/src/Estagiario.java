class Estagiario extends Funcionario {

    private int horasTrabalhadas;
    private String supervisor;

    public Estagiario(String nome, int matricula, int horasTrabalhadas, String supervisor) {

        super(nome, matricula);
        this.horasTrabalhadas = horasTrabalhadas;
        this.supervisor = supervisor;

    }

    @Override
    public double calcularSalario() {

        double valorHora = 15.0;
        double salarioTotal = valorHora * horasTrabalhadas;
        return salarioTotal;
    }

    @Override
    public void trabalhar() {

        System.out.println("Realizando atividades como estagiário...");
        
    }

    @Override
    public void relatarProgresso() {

        System.out.println("Relatando progresso como estagiário...");

    }
}