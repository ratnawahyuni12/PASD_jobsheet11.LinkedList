package Tugas12;

public class Queue20 {
    NodeQueue20 front;
    NodeQueue20 rear;
    int size;
    int max;

    public Queue20(int n) {
        max = n;
        size = 0;
        front = rear = null;
    }

    // (d) cek antrian kosong
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    // (d) cek antrian penuh
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    // (d) mengosongkan antrian
    public void clearQueue() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    // (e) menambahkan antrian - masuk dari belakang
    public void enqueue(MahasiswaQueue20 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambah data.");
            return;
        }
        NodeQueue20 newNode = new NodeQueue20(mhs, null);
        if (IsEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " berhasil masuk antrian.");
    }

    // (f) memanggil antrian - keluar dari depan
    public void dequeue() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong! Tidak ada yang dipanggil");
            return;
        }
        System.out.println("\n=== Mahasiswa Dipanggil ===");
        front.data.tampilInformasi();
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
    }

    // (g) menampilkan antrian terdepan
    public void tampilFront() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("\n=== Antrian Terdepan ===");
            front.data.tampilInformasi();
        }
    }

    // (g) menampilkan antrian paling akhir
    public void tampilRear() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("\n=== Antrian Paling Akhir ===");
            rear.data.tampilInformasi();
        }
    }

    // (h) menampilkan jumlah mahasiswa yang masih mengantri
    public void tampilJumlah() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size + " orang");
    }

    // menampilkan seluruh isi antrian
    public void tampilAntrian() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("\n=====- ISI ANTRIAN -=====");
            NodeQueue20 tmp = front;
            int urutan = 1;
            while (tmp != null) {
                System.out.println("Antrian ke-" + urutan + ": ");
                tmp.data.tampilInformasi();
                tmp = tmp.next;
                urutan++;
            }
            System.out.println("================================");
        }
    }
}
