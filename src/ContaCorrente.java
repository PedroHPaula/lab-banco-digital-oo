public class ContaCorrente extends Conta {
    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente:");
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }
}
