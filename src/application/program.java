package application;

import entities.CarrinhoCompras;
import entities.Item;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.adicionarItemCarrinho("Feijao", 20.00, 2);
        carrinhoCompras.adicionarItemCarrinho("Arroz", 56.00, 2);
        carrinhoCompras.adicionarItemCarrinho("Pera", 12.00, 2);

        System.out.println(carrinhoCompras.calcularValorTotal());
        carrinhoCompras.exibirItem();
        carrinhoCompras.quantidadeItems();

        carrinhoCompras.removerItem("Pera");
        carrinhoCompras.exibirItem();
        System.out.println(carrinhoCompras.calcularValorTotal());

        System.out.println(carrinhoCompras.equals("Feijao"));

        Item item = new Item("Feijao", 20.00, 2);


    }
}