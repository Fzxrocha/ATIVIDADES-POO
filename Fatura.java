import java.util.Scanner;

public class Fatura {
    final String numero;
    private final String descricao;
    private final int quantidade;
    private final double precoPorItem;

    public Fatura(String numero, String descricao, int quantidade, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;

        if (precoPorItem > 0) {
            this.precoPorItem = precoPorItem;
        } else {
            this.precoPorItem = 0.0;
        }
    }

    public double getTotalFatura() {
        double total = quantidade * precoPorItem;
        return Math.max(total, 0.0);
    }

    // Método para obter a descrição
    public String getDescricao() {
        return descricao;
    }

    // Método para obter o preço por item
    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número da fatura: ");
            String numero = scanner.nextLine();
            
            System.out.print("Digite a descrição da fatura: ");
            String descricao = scanner.nextLine();
            
            System.out.print("Digite a quantidade comprada: ");
            int quantidade = scanner.nextInt();
            
            System.out.print("Digite o preço por item: ");
            double precoPorItem = scanner.nextDouble();
            
            Fatura minhaFatura = new Fatura(numero, descricao, quantidade, precoPorItem);
            
            // Exibir informações
            System.out.println("Número: " + minhaFatura.numero +
                    "\nDescrição: " + minhaFatura.getDescricao() +
                    "\nPreço por Item: " + minhaFatura.getPrecoPorItem() +
                    "\nTotal da Fatura: $" + minhaFatura.getTotalFatura());
        }
    }

    String getQuantidade() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
