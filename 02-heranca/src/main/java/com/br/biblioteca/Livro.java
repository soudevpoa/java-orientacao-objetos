package com.br.biblioteca;

// Subclasse Livro que herda atributos e métodos de ItemBiblioteca
public class Livro extends ItemBiblioteca {
    private String editora;
    private int anoPublicacao;
    private String genero;
    private int paginas;

    public Livro(String titulo, String autor, String editora, int anoPublicacao, String genero, int paginas) {
        super(titulo, autor); // Chama o construtor da superclasse
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.paginas = paginas;
    }

    // Sobrescreve o método para mostrar mais detalhes do livro
    @Override
    public void exibirInformacoes() {
        System.out.println("📘 " + titulo + " | Autor: " + autor +
                " | Editora: " + editora + " | Ano: " + anoPublicacao +
                " | Gênero: " + genero + " | Páginas: " + paginas +
                " | Emprestado: " + (emprestado ? "Sim" : "Não"));
    }
}
