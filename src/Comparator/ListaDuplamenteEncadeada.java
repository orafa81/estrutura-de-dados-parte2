package Comparator;

public class ListaDuplamenteEncadeada {
    NoDu head;
    NoDu tail;

    public ListaDuplamenteEncadeada() {
        this.head = null;
        this.tail = null;
    }


    public void add(int data) {
        NoDu newNode = new NoDu(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }


    private int compare(int data1, int data2) {
        return Integer.compare(data1, data2); // Comparação simples de inteiros
    }


    public void sort() {
        if (head == null || head.next == null) {
            return; // Lista já está ordenada ou vazia
        }

        NoDu current = head;
        while (current != null) {
            NoDu nextNode = current.next;
            while (nextNode != null) {
                if (compare(current.data, nextNode.data) > 0) {
                    // Troca os dados entre os nós
                    int temp = current.data;
                    current.data = nextNode.data;
                    nextNode.data = temp;
                }
                nextNode = nextNode.next;
            }
            current = current.next;
        }
    }


    public void printList() {
        NoDu current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
