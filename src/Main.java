import Comparator.ListaDuplamenteEncadeada;
import Iterator.InteradorLista;
import Iterator.ListaEncadeada;

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

        ListaDuplamenteEncadeada list = new ListaDuplamenteEncadeada();


        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);

        System.out.println("Lista antes de ordenar:");
        list.printList();


        list.sort();

        System.out.println("Lista depois de ordenar:");
        list.printList();
    }
}