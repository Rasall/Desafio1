public class TesteConta {

    public static void main(String[] args) {
        Banco santander = new Banco("Santander");
        Banco itau = new Banco("Itau");
        Banco bradesco = new Banco("Bradesco");

        Cliente rafael = new Cliente("Rafael");
        Cliente jose = new Cliente("Jose");
        Conta cc = new ContaCorrente(rafael,itau);
        Conta poupanca = new ContaPoupanca(jose,bradesco);
        cc.depositar(110.0);
        cc.transferir(50.0,poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
