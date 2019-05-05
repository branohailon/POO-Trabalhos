package Atividade02;
import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<Produto>();
        Cd cd1 = new Cd(165434578, "Eminem", 45.99, 18);
        Cd cd2 = new Cd(986756748, "Hungria", 10.90, 20);
        Dvd dvd1 = new Dvd(968745632, "vingadores guerra infinita", 15.90, "2:36");
        Dvd dvd2 = new Dvd(764356789, "vingadores ultimato", 35.00, "3:01");
        Livro livro1 = new Livro(564535563, "Sherlock Holmes", 100.99, "Sir Arthur");

        produtos.add(cd1);
        produtos.add(cd2);
        produtos.add(dvd1);
        produtos.add(dvd2);
        produtos.add(livro1);

        for (Produto produto : produtos){
            System.out.println(produto.toString());
        }

        Scanner entrada = new Scanner(System.in);
        System.out.println("\nInforme o código de barras do produto: ");
        int cod_barra = entrada.nextInt();
        Loja.FindProduct(produtos, cod_barra);
    }

    public static void FindProduct(ArrayList<Produto> produtos, int cod_barra){
        for (Produto produto : produtos){
            if (produto.GetCod_Barra() == cod_barra){
                System.out.println(produto.toString());
                return;
            }
        }
        System.out.println("\nNao encontrado\n");
    }
}
