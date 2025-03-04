public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");

        Cliente cliente1 = new Cliente("João Silva");
        Conta conta1 = new ContaCorrente(1, 1001, cliente1);
        Conta conta2 = new ContaPoupanca(1, 2001, cliente1);

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        conta1.depositar(1000);
        conta1.transferir(300, conta2);

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
    }
}
