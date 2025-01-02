package com.mycompany.tubes_dpbo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hutang implements crudInterface<Hutang> {
    private int idPenghutang;
    private String namaPenghutang;
    private String nomorTelepon;
    private String alamat;
    private double nilaiHutang;
    private boolean lunas;
    
    private static ArrayList<Hutang> hutangList = new ArrayList<>();

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

    public void setIdPenghutang(int idPenghutang) {
        this.idPenghutang = idPenghutang;
    }

    public String getNamaPenghutang() {
        return namaPenghutang;
    }

    public void setNamaPenghutang(String namaPenghutang) {
        this.namaPenghutang = namaPenghutang;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getNilaiHutang() {
        return nilaiHutang;
    }

    public void setNilaiHutang(double nilaiHutang) {
        this.nilaiHutang = nilaiHutang;
    }

    public boolean isLunas() {
        return lunas;
    }

    public void setLunas(boolean lunas) {
        this.lunas = lunas;
    }

    @Override
    public HashMap<Integer,List <Hutang>> get() {
        HashMap<Integer, List <Hutang>> dataHutang = new HashMap<>();
            return dataHutang;

    }

    @Override
    public Hutang cariBerdasarkanId(int id) {
    for (Hutang hutang : hutangList) {
        if (hutang.getIdPenghutang() == id) {
            return hutang;
        }
    }
    System.out.println("Data dengan ID " + id + " tidak ditemukan.");
    return null;
    }

     @Override
     public void create(Hutang entity){
        System.out.println("Menambahkan data hutang: " + entity.getNamaPenghutang());
    }

    @Override
    public void delete(int id) {
        System.out.println("Menghapus data hutang dengan ID: " + id);
    }

    @Override
    public void update(Hutang entity){
        System.out.println("Memperbarui data hutang: " + entity.getNamaPenghutang());
        entity.setLunas(true);
    }
    
    public void tampilkanHutang() {
        System.out.println("ID Penghutang: " + idPenghutang);
        System.out.println("Nama Penghutang: " + namaPenghutang);
        System.out.println("Nomor Telepon: " + nomorTelepon);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nilai Hutang: " + nilaiHutang);
        System.out.println("Status Lunas: " + (lunas ? "Lunas" : "Belum Lunas"));
    }

}
   
