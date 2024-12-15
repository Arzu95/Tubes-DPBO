package com.mycompany.tubes_dpbo;

import java.util.HashMap;
import java.util.List;

public class Hutang implements crudInterface {
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
     public void create(T entity){
        System.out.println("Edit data hutang...");
    }

    @Override
    public void delete(int id) {
        System.out.println("Delete data hutang...");
    }

    @Override
    public void update(T entity){
        System.out.println("Update data hutang...");
        this.lunas = true;
    }
    
    public void displayHutang() {
        System.out.println("ID Penghutang: " + idPenghutang);
        System.out.println("Nama Penghutang: " + namaPenghutang);
        System.out.println("Nomor Telepon: " + nomorTelepon);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nilai Hutang: " + nilaiHutang);
        System.out.println("Status Lunas: " + (lunas ? "Lunas" : "Belum Lunas"));
    }

   
