import java.util.ArrayList;

class Desenvolvedor extends Funcionario {
    private ArrayList<String> tecnologias;

    public Desenvolvedor(String nome, int matricula, ArrayList<String> tecnologias) {

        super(nome, matricula);
        this.tecnologias = tecnologias;

    }

    @Override
    public double calcularSalario() {

        double salarioBase = 3000.0;
        double bonusTecnologias = tecnologias.size() * 100.0;
        double salarioTotal = salarioBase + bonusTecnologias;
        return salarioTotal;

    }

    @Override
    public void trabalhar() {

        System.out.println("Realizando atividades como desenvolvedor...");

    }

    @Override
    public void relatarProgresso() {

        System.out.println("Relatando progresso como desenvolvedor...");

    }
}