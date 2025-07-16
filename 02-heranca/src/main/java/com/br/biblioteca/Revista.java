package com.br.biblioteca;

// Classe Revista que herda de ItemBiblioteca
public class Revista extends ItemBiblioteca {
    private String editora;
    private int edicao;
    private int ano;

    public Revista(String titulo, String autor, String editora, int edicao, int ano) {
        super(titulo, autor); // chama o construtor da superclasse
        this.editora = editora;
        this.edicao = edicao;
        this.ano = ano;
    }

    // Sobrescreve método para mostrar detalhes da revista
    @Override
    public void exibirInformacoes() {
        System.out.println("📰 " + titulo + " | Editor: " + autor +
                " | Editora: " + editora + " | Edição: " + edicao +
                " | Ano: " + ano + " | Emprestado: " + (emprestado ? "Sim" : "Não"));
    }
}
