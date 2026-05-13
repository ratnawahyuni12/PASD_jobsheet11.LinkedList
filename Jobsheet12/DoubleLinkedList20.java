package Jobsheet12;

public class DoubleLinkedList20 {
    Node20 head;
    Node20 tail;

    public DoubleLinkedList20() {
        head = null;
        tail = null;
    }

    public boolean IsEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa20 data) {
        Node20 newNode = new Node20(data);
        if (IsEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa20 data) {
        Node20 newNode = new Node20(data);
        if (IsEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa20 data) {
        Node20 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node20 newNode = new Node20(data);

        // jika current adalah tail, node baru ditambahkan di akhir
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else { //node baru disisipkan di tengah
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Linked List masih kosong.");
        } else {
            Node20 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }

    public void printReverse() {
        if (IsEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        System.out.println("Data dari belakang ke depan: ");
        Node20 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void removeFirst() {
        if (IsEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        System.out.println("Data berhasil dihapus.");
        head.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (IsEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        System.out.println("Data berhasil dihapus.");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
}