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

public class Pendapatan {
    private String tanggal;
    private double totalPendapatan;
    private List<Penjualan> listPenjualan;

    public Pendapatan(String tanggal) {
        this.tanggal = tanggal;
        this.totalPendapatan = 0;
        this.listPenjualan = new ArrayList<>();
    }

    public void hitungTotalPendapatan() {
        totalPendapatan = listPenjualan.size() * 100; 
        System.out.println("Total pendapatan pada tanggal " + tanggal + " adalah: " + totalPendapatan);
    }

    public void tambahPenjualan(Penjualan penjualan) {
        listPenjualan.add(penjualan);
        System.out.println("Penjualan pada tanggal " + penjualan.getTanggalTerjual() + " berhasil ditambahkan.");
    }

    public double getTotalPendapatan() {
        return totalPendapatan;
    }
}

