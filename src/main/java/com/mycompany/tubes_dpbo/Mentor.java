/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Mentor extends User {
    private List<String> listKelas;
    private List<LocalDate> ketersediaan;

    public Mentor(int userId, String nama) {
        super(userId, nama);
        this.listKelas = new ArrayList<>();
        this.ketersediaan = new ArrayList<>();
    }

    public void addKelas(String kelas) {
        listKelas.add(kelas);
        System.out.println("Kelas " + kelas + " berhasil ditambahkan.");
    }

    public void updateKetersediaan(LocalDate tanggal) {
        ketersediaan.add(tanggal);
        System.out.println("Ketersediaan berhasil diupdate pada: " + tanggal);
    }

    public void showKetersediaan() {
        System.out.println("Ketersediaan mentor " + super.getNama() + ":");
        for (LocalDate tanggal : ketersediaan) {
            System.out.println("- " + tanggal);
        }
    }

    public List<String> getListKelas() {
        return listKelas;
    }

    public List<LocalDate> getKetersediaan() {
        return ketersediaan;
    }
}
