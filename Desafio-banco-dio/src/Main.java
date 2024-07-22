
public class Main {

    public static void main(String[] args) {
        Cliente Joaop = new Cliente();
        Joaop.setNome("Joaop");

        Conta cc = new ContaCorrente(Joaop);
        Conta poupanca = new ContaPoupanca(Joaop);

        cc.depositar(1000000);
        cc.transferir(1000000, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}