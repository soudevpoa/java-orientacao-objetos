public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Jonathan", 28);

        pessoa1.apresentar();           // Exibe apresentação
        pessoa1.fazerAniversario();     // Incrementa idade
        pessoa1.apresentar();           // Exibe com nova idade
    }
}
