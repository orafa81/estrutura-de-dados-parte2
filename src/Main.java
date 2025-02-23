public class Main {
    public static void main(String[] args) {


            ListaEncadeada lista = new ListaEncadeada();
            lista.adicionar("Primeiro");
            lista.adicionar("Segundo");
            lista.adicionar("Terceiro");

            InteradorLista iterador = lista.iterador();

            while (iterador.temProximo()) {
                System.out.println(iterador.proximo()); // Exibe cada elemento da lista
            }

    }
}