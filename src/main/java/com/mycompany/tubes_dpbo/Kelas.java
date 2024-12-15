/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author applejenius.id
 */
public class Kelas {
    private List<Mentor> listMentor;
    private List<String> listMateri;

    
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
        double hargaPerMentor = 500000;
        double hargaPerMateri = 200000;
        return (listMentor.size() * hargaPerMentor) + (listMateri.size() * hargaPerMateri);
    }

    public int cekKetersediaanKuota() {
        int maksimumKuota = 30;
        int jumlahPeserta = 15;
        return maksimumKuota - jumlahPeserta;
    }

    public List<UMKM> daftarPeserta() {
        List<UMKM> listUmkm = new ArrayList<>();
        listUmkm.add(new UMKM("UMKM A", "Food Industry"));
        listUmkm.add(new UMKM("UMKM B", "Fashion Industry"));
        listUmkm.add(new UMKM("UMKM C", "Technology Industry"));
        return listUmkm;
    }

    public void displayKelasInfo() {
        System.out.println("Daftar Mentor:");
        for (Mentor mentor : listMentor) {
            System.out.println("- " + mentor.getNamaMentor());
        }

        System.out.println("\nDaftar Materi:");
        for (String materi : listMateri) {
            System.out.println("- " + materi);
        }

        System.out.println("\nHarga Total: " + hitungHarga());
        System.out.println("Kuota Tersedia: " + cekKetersediaanKuota());
    }
}

