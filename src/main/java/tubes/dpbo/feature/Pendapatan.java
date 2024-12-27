/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes.dpbo.feature;

import tubes.dpbo.feature.Penjualan;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author applejenius.id
 */

public class Pendapatan {
    private String tanggal;
    private double totalPendapatan;
    private ArrayList<Penjualan> listPenjualan;

    public Pendapatan(String tanggal) {
        this.tanggal = tanggal;
        this.totalPendapatan = 0;
        this.listPenjualan = new ArrayList<>();
    }

    public void hitungTotalPendapatan() {
        //hitung disini
        
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

