package Iterator;

public class ListaEncadeada {
    private No cabeca;


    public void adicionar(String dado) {
        No novoNo = new No(dado);
        if (cabeca == null) {

            cabeca = novoNo;
        } else {

            No atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }

            atual.proximo = novoNo;
        }
    }

    public No getCabeca() {
        return cabeca;
    }


    public InteradorLista iterador() {
        return new InteradorLista(cabeca);
    }
}
