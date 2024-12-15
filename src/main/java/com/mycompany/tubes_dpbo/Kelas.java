package com.mycompany.tubes_dpbo;

import java.util.ArrayList;
import java.util.List;

/**
 * Kelas yang merepresentasikan sebuah pelatihan atau kursus dengan daftar mentor dan materi.
 *
 * @author applejenius.id
 */
public class Kelas {

    private List<Mentor> listMentor;
    private List<String> listMateri;
    private static final double HARGA_PER_MENTOR = 500000;
    private static final double HARGA_PER_MATERI = 200000;
    private static final int MAKSIMUM_KUOTA = 30;

    public Kelas(List<Mentor> listMentor, List<String> listMateri) {
        this.listMentor = listMentor;
        this.listMateri = listMateri;
    }

    public List<Mentor> getListMentor() {
        return listMentor;
    }

    public void setListMentor(List<Mentor> listMentor) {
        this.listMentor = listMentor;
    }

    public List<String> getListMateri() {
        return listMateri;
    }

    public void setListMateri(List<String> listMateri) {
        this.listMateri = listMateri;
    }

    public double hitungHarga() {
        return (listMentor.size() * HARGA_PER_MENTOR) + (listMateri.size() * HARGA_PER_MATERI);
    }

    public int cekKetersediaanKuota(int jumlahPeserta) {
        return Math.max(0, MAKSIMUM_KUOTA - jumlahPeserta);
    }
    
    public List<UMKM> daftarPeserta(List<UMKM> listUmkm) {
        return new ArrayList<>(listUmkm);
    }
    
    public void displayKelasInfo(int jumlahPeserta, List<UMKM> listUmkm) {
        System.out.println("Daftar Mentor:");
        for (Mentor mentor : listMentor) {
            System.out.println("- " + mentor);
        }

        System.out.println("\nDaftar Materi:");
        for (String materi : listMateri) {
            System.out.println("- " + materi);
        }

        System.out.println("\nHarga Total: " + hitungHarga());
        System.out.println("Kuota Tersedia: " + cekKetersediaanKuota(jumlahPeserta));

        System.out.println("\nDaftar Peserta:");
        for (UMKM umkm : listUmkm) {
            System.out.println("- " + umkm + " (" + umkm + ")");
        }
    }
}
