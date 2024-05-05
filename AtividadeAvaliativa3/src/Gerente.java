class Gerente extends Funcionario {

    private double bonusAnual;
    private String equipe;

    public Gerente(String nome, int matricula, double bonusAnual, String equipe) {

        super(nome, matricula);
        this.bonusAnual = bonusAnual;
        this.equipe = equipe;

    }

    @Override
    public double calcularSalario() {

        double salarioBase = 5000.0;
        double salarioTotal = salarioBase + bonusAnual;
        return salarioTotal;

    }

    @Override
    public void trabalhar() {

        System.out.println("Realizando atividades como gerente...");

    }

    @Override
    public void relatarProgresso() {

        System.out.println("Relatando progresso como gerente...");

    }
}