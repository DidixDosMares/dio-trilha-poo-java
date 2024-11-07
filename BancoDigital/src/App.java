public class App {
    public static void main(String[] args) throws Exception {
        Conta conta1 = new ContaCorrente("001");
        Conta conta2 = new ContaPoupanca("002");

        conta1.depositar(1000);
        conta1.sacar(200);
        conta1.transferir(100, conta2);

        System.out.println("Saldo Conta Corrente: " + conta1.getSaldo());
        System.out.println("Saldo Conta Poupança: " + conta2.getSaldo());
    }
}