public class BibliotecaMain {
    public static void main(String[] args) {
        Livro livro1 = new Livro
                ("O Hobbit", "J.R.R. Tolkien", "HarperCollins", 1937, "Fantasia", 320);

        livro1.exibirInformacoes();
        livro1.emprestar();
        livro1.emprestar(); // Tentativa de emprestar novamente
        livro1.devolver();
        livro1.exibirInformacoes();

        Livro livro2 = new Livro
                ("O pescador de ilusões","Pedro Fanjo","Abril",1998,"Drama",600);
        livro2.exibirInformacoes();
        livro2.emprestar();
        livro2.emprestar(); // Tentativa de emprestar novamente
        livro2.devolver();
        livro2.exibirInformacoes();
    }
}