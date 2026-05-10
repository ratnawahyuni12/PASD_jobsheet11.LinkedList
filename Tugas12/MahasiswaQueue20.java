package Tugas12;

public class MahasiswaQueue20 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public MahasiswaQueue20() {

    }

    public MahasiswaQueue20(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi() {
        System.out.printf("  Nama  : %s%n", nama);
        System.out.printf("  NIM   : %s%n", nim);
        System.out.printf("  Kelas : %s%n", kelas);
        System.out.printf("  IPK   : %.1f%n", ipk);
    }
}
