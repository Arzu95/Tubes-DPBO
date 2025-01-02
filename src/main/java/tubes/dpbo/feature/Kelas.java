package com.mycompany.tubes_dpbo;

import java.util.ArrayList;
import java.util.List;

/**
 * Kelas yang merepresentasikan sebuah pelatihan atau kursus dengan daftar mentor dan materi.
 *
 * @author applejenius.id
 */
public class Kelas {

    private ArrayList<Mentor> daftarMentor;
    private ArrayList<String> daftarMateri;
    private static final double HARGA_PER_MENTOR = 500000;
    private static final double HARGA_PER_MATERI = 200000;
    private static final int MAKSIMUM_KUOTA = 30;

    public Kelas(ArrayList<Mentor> daftarMentor, ArrayList<String> daftarMateri) {
        this.daftarMentor = daftarMentor;
        this.daftarMateri = daftarMateri;
    }

    public ArrayList<Mentor> getDaftarMentor() {
        return daftarMentor;
    }

    public void setDaftarMentor(ArrayList<Mentor> daftarMentor) {
        this.daftarMentor = daftarMentor;
    }

    public ArrayList<String> getDaftarMateri() {
        return daftarMateri;
    }

    public void setDaftarMateri(ArrayList<String> daftarMateri) {
        this.daftarMateri = daftarMateri;
    }

    public double hitungHarga() {
        return (daftarMentor.size() * HARGA_PER_MENTOR) + (daftarMateri.size() * HARGA_PER_MATERI);
    }

    public int cekKetersediaanKuota(int jumlahPeserta) {
        return Math.max(0, MAKSIMUM_KUOTA - jumlahPeserta);
    }

    public ArrayList<UMKM> daftarPeserta(ArrayList<UMKM> daftarUmkm) {
        return new ArrayList<>(daftarUmkm);
    }

    public void tampilkanInfoKelas(int jumlahPeserta, ArrayList<UMKM> daftarUmkm) {
        System.out.println("Daftar Mentor:");
        for (Mentor mentor : daftarMentor) {
            System.out.println("- " + mentor);
        }

        System.out.println("\nDaftar Materi:");
        for (String materi : daftarMateri) {
            System.out.println("- " + materi);
        }

        System.out.println("\nHarga Total: " + hitungHarga());
        System.out.println("Kuota Tersedia: " + cekKetersediaanKuota(jumlahPeserta));

        System.out.println("\nDaftar Peserta:");
        for (UMKM umkm : daftarUmkm) {
            System.out.println("- " + umkm);
        }
    }
}
