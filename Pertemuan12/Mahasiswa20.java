package Pertemuan12;

public class Mahasiswa20 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa20() {

    }

    public Mahasiswa20(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi() {
        System.out.printf("%-8s\t%-10s\t%-4s\t%.1f%n", nama, nim, kelas, ipk);
    }
}