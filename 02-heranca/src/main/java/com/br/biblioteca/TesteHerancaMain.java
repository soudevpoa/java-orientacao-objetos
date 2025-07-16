package com.br.biblioteca;

public class TesteHerancaMain {
    public static void main(String[] args) {
        Livro livro = new Livro
                ("O Hobbit", "J.R.R. Tolkien", "HarperCollins", 1937, "Fantasia", 320);
        DVD dvd = new DVD
                ("Matrix", "Lana Wachowski", 136, "16 anos");
        Revista revista = new Revista
                ("Superinteressante", "Equipe Abril", "Abril", 289, 2023);

        livro.exibirInformacoes();
        dvd.exibirInformacoes();
        revista.exibirInformacoes();

        livro.emprestar();
        dvd.emprestar();
        revista.emprestar();

        livro.devolver();
        dvd.devolver();
        revista.devolver();
    }
}
