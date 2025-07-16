package com.br.biblioteca;

// Superclasse genérica que representa qualquer item da biblioteca
public class ItemBiblioteca {
    protected String titulo;
    protected String autor;
    protected boolean emprestado;

    public ItemBiblioteca(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Item emprestado: " + titulo);
        } else {
            System.out.println("O item '" + titulo + "' já está emprestado.");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Item devolvido: " + titulo);
        } else {
            System.out.println("Este item não estava emprestado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("📦 " + titulo + " | Autor: " + autor + " | Emprestado: " + (emprestado ? "Sim" : "Não"));
    }
}
