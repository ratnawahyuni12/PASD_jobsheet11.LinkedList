package Tugas12;

import java.util.Scanner;

public class QueueMain20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue20 antrian = new Queue20(10);
        int pilihan;

        do {
            System.out.println("=====- SISTEM ANTRIAN UNIT KEMAHASISWAAN -=====");
            System.out.println("1. Daftar Antrian (Masuk Antrian)");
            System.out.println("2. Panggil Antrian (Dilayani)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Lihat Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Akhir");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Cek Status Antrian (Kosong/Penuh)");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Keluar");
            System.out.println("-----------------------------------------------");
            System.out.print("Pilihan : ");
            pilihan = sc.nextInt();
            sc.nextLine(); // bersihkan buffer

            switch (pilihan) {
                case 1: // (c) mendaftarkan data mahasiswa dari keyboard
                    System.out.println("\n=== Pendaftaran Antrian ===");
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK   : ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();
                    MahasiswaQueue20 mhs = new MahasiswaQueue20(nim, nama, kelas, ipk);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.tampilAntrian();
                    break;
                case 4:
                    antrian.tampilFront();
                    break;
                case 5:
                    antrian.tampilRear();
                    break;
                case 6:
                    antrian.tampilJumlah();
                    break;
                case 7: // (d) Menampilkan status antrian kosong atau penuh
                    if (antrian.IsEmpty()) {
                        System.out.println("Status: ANTRIAN KOSONG");
                    } else if (antrian.IsFull()) {
                        System.out.println("Status: ANTRIAN PENUH");
                    } else {
                        System.out.println("Status: Antrian masih tersedia.");
                    }
                    antrian.tampilJumlah();
                    break;
                case 8:
                    System.out.print("Yakin ingin mengosongkan antrian? (y/n) : ");
                    String konfirmasi = sc.nextLine();
                    if (konfirmasi.equalsIgnoreCase("y")) {
                        antrian.clearQueue();
                    } else {
                        System.out.println("Pengosongan dibatalkan.");
                    }
                    break;
                case 9:
                    System.out.println("Terima kasih! Sistem antrian ditutup.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        } while (pilihan != 9);
        sc.close();
    }
}
