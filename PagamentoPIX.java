public class PagamentoPIX implements IMetodoPagamento {
    @Override
    public boolean confirmarPagamento(double valor) {
        for (int i = 5; i >= 1; i --) {
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Processando " + i);
        }
        return true;
    }
}
