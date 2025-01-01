/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes.dpbo.user;

import java.time.LocalDate;
import java.util.ArrayList;


public class Mentor extends User {
    private ArrayList<String> listKelas;
    private ArrayList<LocalDate> ketersediaan;

    public Mentor(int userId, String nama) {
        super(userId, nama);
        this.listKelas = new ArrayList<>();
        this.ketersediaan = new ArrayList<>();
    }

    public void tambahKelas(String kelas) {
        listKelas.add(kelas);
        System.out.println("Kelas " + kelas + " berhasil ditambahkan.");
    }

    public void perbaruiKetersediaan(LocalDate tanggal) {
        ketersediaan.add(tanggal);
        System.out.println("Ketersediaan berhasil diupdate pada: " + tanggal);
    }

    public void tampilkanKetersediaan() {
        System.out.println("Ketersediaan mentor " + super.getNama() + ":");
        for (LocalDate tanggal : ketersediaan) {
            System.out.println("- " + tanggal);
        }
    }

    public ArrayList<String> getListKelas() {
        return listKelas;
    }

    public ArrayList<LocalDate> getKetersediaan() {
        return ketersediaan;
    }
}
