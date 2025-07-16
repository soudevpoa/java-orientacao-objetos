package com.br.biblioteca;

// Classe DVD que herda de ItemBiblioteca
public class DVD extends ItemBiblioteca {
    private int duracao;         // em minutos
    private String classificacao; // ex: "Livre", "12 anos", "18 anos"

    public DVD(String titulo, String autor, int duracao, String classificacao) {
        super(titulo, autor); // chama o construtor da superclasse
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    // Sobrescreve método para exibir detalhes específicos do DVD
    @Override
    public void exibirInformacoes() {
        System.out.println("📀 " + titulo + " | Direção: " + autor +
                " | Duração: " + duracao + " min | Classificação: " + classificacao +
                " | Emprestado: " + (emprestado ? "Sim" : "Não"));
    }
}
