package Pertemuan12;

import java.util.Scanner;

public class SLLMain20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList20 sll = new SingleLinkedList20();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("=== Data Mahasiswa ke-" + (i+1) + " ===");
            System.out.print("NIM   : "); String nim = sc.nextLine();
            System.out.print("Nama  : "); String nama = sc.nextLine();
            System.out.print("Kelas : "); String kelas = sc.nextLine();
            System.out.print("IPK   : "); double ipk = sc.nextDouble(); sc.nextLine();

            Mahasiswa20 mhs = new Mahasiswa20(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }

        sll.print();
        sc.close();
    }
}