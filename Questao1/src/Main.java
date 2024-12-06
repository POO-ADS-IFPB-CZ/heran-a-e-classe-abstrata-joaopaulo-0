public class Main {
    public static void main(String[] args) {

        ContaPoupanca contaPoupanca = new ContaPoupanca(1234, "João");
        contaPoupanca.depositar(1000);
        contaPoupanca.reajustar(5);
        System.out.println("Saldo da Conta Poupança após reajuste: " + contaPoupanca.getSaldo());


        ContaEspecial contaEspecial = new ContaEspecial(5678, "Maria", 500);
        contaEspecial.depositar(1000);
        contaEspecial.sacar(1200);
        System.out.println("Saldo da Conta Especial após saque: " + contaEspecial.getSaldo());
    }
}
