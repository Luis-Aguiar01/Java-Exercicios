package Empregado;

public class Gerente extends Empregado {

    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        setDepartamento(departamento);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return String.format("%s\nDepartamento: %s\n", super.toString(), getDepartamento());
    }
}