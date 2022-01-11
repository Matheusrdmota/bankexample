public abstract class Conta {
    private static int AGENCIA = 1;
    private static int SEQUENCIAL = 0;

    private int numeroConta;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.numeroConta = ++SEQUENCIAL;
        this.saldo = 0;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente.");
            return false;
        }else{
            this.saldo -= valor;
            return true;
        }
    }

    public void transferencia(double valor, Conta contaDestino){
        if(this.saca(valor)){
            contaDestino.deposita(valor);
        }
    }

    public static int getAGENCIA() {
        return AGENCIA;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void exibeInfos(){
        System.out.println("Titular: " + this.cliente.getNome() + " - " + this.cliente.getCpf());
        System.out.println("Agencia: " + this.AGENCIA);
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
    }
}
