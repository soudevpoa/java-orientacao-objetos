public class BancoMain {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Jonathan", 1000);
        Conta conta2 = new Conta("Copilot", 500);

        conta1.exibirSaldo();
        conta2.exibirSaldo();

        conta1.sacar(200);
        conta2.depositar(150);

        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
