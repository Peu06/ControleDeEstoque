import java.util.List;
import java.util.Scanner;

public class itens {

    private static long contadorId = 1;

    private long id;

    private int quantity;

    private String nome;

    private String descricao;

    private double preco;

    public itens(){}

    public itens(int quantity, String nome, String descricao, double preco) {
        this.id = contadorId++;
        this.quantity = quantity;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static itens criarItem(Scanner scan){
        System.out.println("Digite a quantidade de itens: ");
        int quantity = scan.nextInt();
        scan.nextLine();

        System.out.println("Nome do produto: ");
        String nome = scan.nextLine();

        System.out.println("Descrição do produto: ");
        String descricao = scan.nextLine();

        System.out.println("Digite o valor do produto: ");
        double preco = scan.nextDouble();
        scan.nextLine();

        return new itens(quantity, nome, descricao, preco);
    }

    public static itens getById(List<itens> lista, long id){
        for(itens item : lista){
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }

    public static void getAll(List<itens> lista){
        if(lista.isEmpty()){
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        for (itens item : lista){
            System.out.println("ID: " + item.getId());
            System.out.println("Nome: " + item.getNome());
            System.out.println("Descrição: " + item.getDescricao());
            System.out.println("Quantidade: " + item.getQuantity());
            System.out.println("Preço: " + item.getPreco());
            System.out.println("-------------------------");
        }
    }

    public static void editItem(List<itens> lista, Scanner scan) {
        System.out.println("Digite o ID do produto que vai editar: ");
        long id = 0;

        while(true){
            String inputId = scan.nextLine();
            try{
                id = Long.parseLong(inputId);
                break;
            } catch (NumberFormatException e){
                System.out.println("ID inválido. Digite um número válido");
            }
        }
        itens item = getById(lista, id);

        if (item == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        System.out.println("Editando produto: " + item.getNome());

        System.out.println("Nova quantidade (atual: " + item.getQuantity() + "): ");
        int quantity = 0;
        while(true){
            String input = scan.nextLine();
            try {
                quantity = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e){
                System.out.println("Quantidade inválida. Digite um número válido.");
            }
        }

        System.out.println("Novo nome (atual: " + item.getNome() + "): ");
        String nome = scan.nextLine();

        System.out.print("Nova descrição (atual: " + item.getDescricao() + "): ");
        String descricao = scan.nextLine();

        System.out.print("Novo preço (atual: " + item.getPreco() + "): ");
        double preco = 0;
        while (true) {
            String input = scan.nextLine();
            try {
                preco = Double.parseDouble(input.replace(",", "."));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Preço inválido. Digite um número válido:");
            }
        }

        item.setQuantity(quantity);
        item.setNome(nome);
        item.setDescricao(descricao);
        item.setPreco(preco);

        System.out.println("Produto atualizado com sucesso!");
    }

    public static void excluirItem(List<itens> lista, Scanner scan) {
        System.out.println("Digite o ID do produto que vai excluir: ");
        long id = 0;

        while (true) {
            String inputId = scan.nextLine();
            try {
                id = Long.parseLong(inputId);
                break;
            } catch (NumberFormatException e) {
                System.out.println("ID inválido. Digite um número válido");
            }
        }
        itens item = getById(lista, id);

        if (item == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        lista.remove(item);
        System.out.println("Produto removido com sucesso!");
    }
}
