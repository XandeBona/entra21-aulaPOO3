import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    public List<Produto> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        itens.add(p);
    }

    public double calcularTotal() {
        double soma = 0;
        for (Produto p : itens) {
            soma += p.getPreco();
        }
        return soma;
    }

    public void listarProdutos() {
        for (Produto p : itens) {
            System.out.println(p.getNome());
        }
    }

}
