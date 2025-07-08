public class Loja {

    private IMetodoPagamento metodoPagamento;

    public Loja(IMetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void realizarCompra(Carrinho c) {
    double total = c.calcularTotal();

    if (metodoPagamento.confirmarPagamento(total)) {
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Houve uma falha em sua compra!");
        }
    }

}
