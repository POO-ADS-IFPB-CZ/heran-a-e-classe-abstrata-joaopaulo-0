public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, String nomeTitular, double limite) {
        super(numero, nomeTitular);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {

        if (valor <= this.saldo + this.limite) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}