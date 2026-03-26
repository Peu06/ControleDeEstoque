import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int paraWhile = 0;

        List<itens> lista = new ArrayList<>();

        do {
            System.out.println("1. Ver estoque.");
            System.out.println("2. Cadastrar produto.");
            System.out.println("3. Editar produto.");
            System.out.println("4. Excluir produto.");
            System.out.println("5. Parar execução");
            System.out.print("Digite a operação: ");
            int opecacao = scan.nextInt();
            scan.nextLine();

            System.out.println("-------------------------");

            paraWhile = opecacao;

            switch (opecacao){
                case 1:
                    itens.getAll(lista);
                    break;
                case 2:
                    itens item = itens.criarItem(scan);
                    lista.add(item);
                    System.out.println("Produto cadastrado!");
                    break;
                case 3:
                    itens.editItem(lista, scan);
                    break;
                case 4:
                    itens.excluirItem(lista, scan);
            }
        } while(paraWhile != 5);


    }
}