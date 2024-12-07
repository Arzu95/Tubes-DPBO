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


public class Penjualan {
    private List<String> listBarangTerjual;
    private String tanggalTerjual;

    public Penjualan(String tanggalTerjual) {
        this.tanggalTerjual = tanggalTerjual;
        this.listBarangTerjual = new ArrayList<>();
    }

    public void inputBarangTerjual(String barang) {
        listBarangTerjual.add(barang);
        System.out.println("Barang " + barang + " berhasil ditambahkan ke daftar penjualan.");
    }

    public List<String> getListBarangTerjual() {
        return listBarangTerjual;
    }

    public String getTanggalTerjual() {
        return tanggalTerjual;
    }
}
