/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class Hutang {
    private int idPenghutang;
    private String namaPenghutang;
    private String nomorTelepon;
    private String alamat;
    private double nilaiHutang;
    private boolean lunas;

    public Hutang(int idPenghutang, String namaPenghutang, String nomorTelepon, String alamat, double nilaiHutang, boolean lunas) {
        this.idPenghutang = idPenghutang;
        this.namaPenghutang = namaPenghutang;
        this.nomorTelepon = nomorTelepon;
        this.alamat = alamat;
        this.nilaiHutang = nilaiHutang;
        this.lunas = lunas;
    }

    public int getIdPenghutang() {
        return idPenghutang;
    }

    public String getNamaPenghutang() {
        return namaPenghutang;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getNilaiHutang() {
        return nilaiHutang;
    }

    public boolean isLunas() {
        return lunas;
    }

    public void setLunas(boolean lunas) {
        this.lunas = lunas;
    }

    @Override
   
public String toString() {
    return "ID Penghutang: " + idPenghutang + "\n" +
           "Nama Penghutang: " + namaPenghutang + "\n" +
           "Nomor Telepon: " + nomorTelepon + "\n" +
           "Alamat: " + alamat + "\n" +
           "Nilai Hutang: Rp" + String.format("%,.2f", nilaiHutang) + "\n" +
           "Status: " + (lunas ? "Lunas" : "Belum Lunas");
}

}

