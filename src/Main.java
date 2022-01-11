public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Matheus Rodrigues Mota", "064.708.173-35", 'M');
        ContaCorrente cc = new ContaCorrente(cliente1);

        Cliente cliente2 = new Cliente("Rebeca Oliveira de Carvalho", "071.933.173-00", 'F');
        ContaPoupanca poupanca = new ContaPoupanca(cliente2);

        cc.deposita(100.00);
        poupanca.deposita(25.00);

        cc.transferencia(50.00, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
