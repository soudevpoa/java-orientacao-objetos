public class BancoMain {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Jonathan", 500);
        Conta conta2 = new Conta("Copilot", 200);

        conta1.exibirSaldo();
        conta2.exibirSaldo();

        conta1.sacar(250);
        conta1.depositar(50);
        conta2.depositar(150);

        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
