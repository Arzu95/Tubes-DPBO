/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class Item {
    private String namaBarang;
    private double hargaBarang;
    private int stok;

    public Item(String namaBarang, double hargaBarang, int stok) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.stok = stok;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
