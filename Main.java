import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Utilizando try-with-resources para o Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            // Criando um livro
            System.out.print("Digite o título do livro: ");
            String tituloLivro = scanner.nextLine();

            System.out.print("Digite o autor do livro: ");
            String autorLivro = scanner.nextLine();

            System.out.print("Digite o número de páginas do livro: ");
            int numPaginasLivro = scanner.nextInt();

            Livro meuLivro = new Livro(tituloLivro, autorLivro, numPaginasLivro);

            // Criando uma fatura
            System.out.print("Digite o número da fatura: ");
            scanner.nextLine(); // Consumir a quebra de linha pendente
            String numeroFatura = scanner.nextLine();

            System.out.print("Digite a descrição da fatura: ");
            String descricaoFatura = scanner.nextLine();

            System.out.print("Digite a quantidade comprada: ");
            int quantidadeFatura = scanner.nextInt();

            System.out.print("Digite o preço por item: ");
            double precoPorItemFatura = scanner.nextDouble();

            Fatura minhaFatura = new Fatura(numeroFatura, descricaoFatura, quantidadeFatura, precoPorItemFatura);

            // Exibindo informações
            meuLivro.imprimirInfo();

            System.out.println("Número: " + minhaFatura.numero +
                    "\nDescrição: " + minhaFatura.getDescricao() +
                    "\nPreço por Item: " + minhaFatura.getPrecoPorItem() +
                    "\nTotal da Fatura: $" + minhaFatura.getTotalFatura());
        } // O Scanner será fechado automaticamente ao sair do bloco try
    }
}
