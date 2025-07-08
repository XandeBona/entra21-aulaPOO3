public class Main {
    public static void main (String [] args) {

        Produto p1 = new Produto("Placa de vídeo", 2000.00);
        Produto p2 = new Produto("Processador", 900.00);
        Produto p3 = new Produto("Memória RAM", 300.00);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p3);

        System.out.println("Lista de produtos:");
        System.out.println("=========");
        carrinho.listarProdutos();
        System.out.println("=========");
        System.out.println("Valor total para pagamento: " + carrinho.calcularTotal());
        System.out.println("=========");

        Loja compra1 = new Loja(new PagamentoBoleto());
        compra1.realizarCompra(carrinho);

        Loja compra2 = new Loja(new PagamentoPIX());
        compra2.realizarCompra(carrinho);

        Loja compra3 = new Loja(new PagamentoCartaoCredito());
        compra3.realizarCompra(carrinho);


    }
}
