/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo;

/**
 *
 * @author applejenius.id
 */

public class UMKM extends User {
    private String telephoneNumber;
    private String[] listKelasDiikuti;

    public UMKM(int userId, String nama, String telephoneNumber) {
        super(userId, nama);
        this.telephoneNumber = telephoneNumber;
        this.listKelasDiikuti = new String[0];
    }

    @Override
    public void register() {
        super.register();
        System.out.println("UMKM dengan nomor telepon " + telephoneNumber + " berhasil terdaftar.");
    }

    @Override
    public void login() {
        super.login();
        System.out.println("UMKM dengan nomor telepon " + telephoneNumber + " berhasil login.");
    }

    public void updateUserData(String newNama, String newTelephoneNumber) {
        super.updateUserData(newNama);
        this.telephoneNumber = newTelephoneNumber;
        System.out.println("Data UMKM berhasil diperbarui: Nama = " + newNama + ", Nomor Telepon = " + telephoneNumber);
    }

    public String getUserInfo() {
        return "Nama: " + getNama() + ", Nomor Telepon: " + telephoneNumber;
    }

    public void ikutKelas(String namaKelas) {
        String[] newListKelas = new String[listKelasDiikuti.length + 1];
        System.arraycopy(listKelasDiikuti, 0, newListKelas, 0, listKelasDiikuti.length);
        newListKelas[listKelasDiikuti.length] = namaKelas;
        listKelasDiikuti = newListKelas;
    }
}
