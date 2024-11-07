public abstract class Conta {
    private double saldo;
    private String numeroConta;
    
    public Conta(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;
        }
    }

    public boolean transferir(double valor, Conta contaDestino) {
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para a conta " + contaDestino.getNumeroConta() + " realizada com sucesso!");
            return true;
        } else {
            System.out.println("Transferência não realizada.");
            return false;
        }
    }
}