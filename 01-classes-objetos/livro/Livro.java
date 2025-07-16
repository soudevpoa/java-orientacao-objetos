// Define a classe Livro que representa um livro em uma biblioteca
public class Livro extends ItemBiblioteca {

    private String editora;
    private int anoPublicacao;
    private String genero;
    private int paginas;


    // Construtor para inicializar os atributos do livro ao criar um objeto
    public Livro(String titulo, String autor, String editora, int anoPublicacao, String genero, int paginas) {
        super(titulo,autor);//Chama o construtor da superclasse itemBiblioteca
        this.editora = editora;             // Inicializa a editora
        this.anoPublicacao = anoPublicacao; // Inicializa o ano
        this.genero = genero;               // Inicializa o gênero
        this.paginas = paginas;             // Inicializa o número de páginas

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
