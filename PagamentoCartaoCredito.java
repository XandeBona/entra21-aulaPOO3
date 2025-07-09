public class PagamentoCartaoCredito implements IMetodoPagamento {

    @Override
    public boolean confirmarPagamento(double valor) {
        if (valor < 1000) {
            return true;
        } else {
            System.out.println("Não é possível realizar compras superiores à R$1000,00 via cartão de crédito");
            return false;
        }
    }

}
