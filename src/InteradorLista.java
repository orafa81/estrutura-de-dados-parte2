public class InteradorLista {
    private No atual;


    public InteradorLista(No cabeca) {
        this.atual = cabeca;
    }


    public boolean temProximo() {
        return atual != null;
    }


    public String proximo() {
        if (!temProximo()) {

            throw new java.util.NoSuchElementException("Não há mais elementos na lista.");
        }
        String dado = atual.dado;
        atual = atual.proximo;
        return dado;
    }

}



