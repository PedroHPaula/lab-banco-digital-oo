public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupança:");
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }
}
