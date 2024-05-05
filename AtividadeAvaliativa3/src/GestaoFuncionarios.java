import java.util.ArrayList;

class GestaoFuncionarios {

    private ArrayList<Funcionario> funcionarios;

    public GestaoFuncionarios() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionarioPorNome(String nome) {

        for (int i = 0; i < funcionarios.size(); i++) {

            if (funcionarios.get(i).nome.equals(nome)) {
                funcionarios.remove(i);
                return; 
            }

        }

    }

    public void removerFuncionarioPorMatricula(int matricula) {

        for (int i = 0; i < funcionarios.size(); i++) {

            if (funcionarios.get(i).matricula == matricula) {
                funcionarios.remove(i);
                return;
            }

        }

    }

    public void exibirTodosFuncionarios() {

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.nome + " - " + funcionario.matricula);
        }

    }

    public Funcionario buscarFuncionarioPorNome(String nome) {

        for (Funcionario funcionario : funcionarios) {

            if (funcionario.nome.equals(nome)) {
                return funcionario;
            }

        }

        return null;

    }

    public Funcionario buscarFuncionarioPorMatricula(int matricula) {

        for (Funcionario funcionario : funcionarios) {

            if (funcionario.matricula == matricula) {
                return funcionario;
            }

        }

        return null; 

    }
    
}
