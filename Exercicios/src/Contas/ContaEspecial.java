package Contas;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    public ContaEspecial(String cliente, int numeroDaConta, double limite) {
        super(cliente, numeroDaConta);
        setLimite(limite);
    }

    protected void setLimite(double valor) {
        if (limite < 0.0) {
            throw new IllegalArgumentException("Valor inválido para o limite.");
        }
        this.limite = valor;
    }

    public double getLimite() {
        return this.limite;
    }

    @Override
    public double sacar(double valor) {
        if (valor > (getSaldo() + getLimite())) {
            throw new IllegalArgumentException("Você não tem esse valor para sacar.");
        }

        double novoSaldo;

        if (getSaldo() >= valor) {
            novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
        }
        else {
            double novoLimite = getLimite() - (valor - getSaldo());
            setSaldo(0.0);
            setLimite(novoLimite);
        }

        return valor;
    }

    @Override
    public String toString() {
        return String.format("%sLimite: %.2f\n", super.toString(), limite);
    }
}