import java.util.Scanner;

public class Livro {
    private final String titulo;
    private final String autor;
    private final int numPaginas;

    public Livro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void imprimirInfo() {
        System.out.println("Livro: " + titulo + ", Autor: " + autor + ", Páginas: " + numPaginas);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o título do livro: ");
            String titulo = scanner.nextLine();
            
            System.out.print("Digite o autor do livro: ");
            String autor = scanner.nextLine();
            
            System.out.print("Digite o número de páginas do livro: ");
            int numPaginas = scanner.nextInt();
            
            Livro meuLivro = new Livro(titulo, autor, numPaginas);
            meuLivro.imprimirInfo();
        }
    }
}
