import java.util.ArrayList;
import java.util.List;
public class CarrinhoCompras {
    private List<Item> listaCompras;

    public CarrinhoCompras() {
        this.listaCompras = new ArrayList<>();
    }
    public void adicionarItemCarrinho(String nome,double preco, Integer quantidade) {
       listaCompras.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome) {
        List<Item> removerItemCarrinho = new ArrayList<>();
        for (Item item : listaCompras) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                removerItemCarrinho.add(item);
            }
        }
        listaCompras.removeAll(removerItemCarrinho);
    }
    public double calcularValorTotal(){
        double soma = 0d;
        for (Item calcList : listaCompras){
           soma += calcList.getPreco() * calcList.getQuantidade();
        }
        return soma;
    }
    public void exibirItem (){
        for (Item lista : listaCompras){
            System.out.println(lista.getNome() + ": " +  lista.getPreco()+ " " + "Quantidade " +lista.getQuantidade() );
        }
    }
    public void quantidadeItems(){
        System.out.println(listaCompras.size());
    }
}
