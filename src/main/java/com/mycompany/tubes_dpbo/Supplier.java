/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo;

import java.util.HashMap;
import java.util.List;

public class Supplier implements CrudInterface<Supplier> {
    private int idSupplier;
    private String namaSupplier;
    private String jenisSupplier;
    private int nomorTelepon;
    private String alamat;

    public Supplier(int idSupplier, String namaSupplier, String jenisSupplier, int nomorTelepon, String alamat) {
        this.idSupplier = idSupplier;
        this.namaSupplier = namaSupplier;
        this.jenisSupplier = jenisSupplier;
        this.nomorTelepon = nomorTelepon;
        this.alamat = alamat;
    }

    public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    public String getJenisSupplier() {
        return jenisSupplier;
    }

    public void setJenisSupplier(String jenisSupplier) {
        this.jenisSupplier = jenisSupplier;
    }

    public int getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(int nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public void create(Supplier entity) {
        System.out.println("Supplier baru ditambahkan: " + entity.getNamaSupplier());
    }

    @Override
    public void update(Supplier entity) {
        System.out.println("Data supplier diperbarui: " + entity.getNamaSupplier());
    }

    @Override
    public void delete(int id) {
        System.out.println("Supplier dengan ID " + id + " dihapus.");
    }

    @Override
    public Supplier getById(int id) {
        System.out.println("Mengambil data supplier dengan ID: " + id);
        return new Supplier(id, "Nama Supplier", "Jenis Dummy", 12345678, "Bojongsoang");
    }

    @Override
    public HashMap<Integer, List<Supplier>> get() {
        System.out.println("Mengambil semua data supplier.");
        return new HashMap<>();
    }

    public void displaySupplierByCategory(String kategori) {
        if (jenisSupplier.equalsIgnoreCase(kategori)) {
            System.out.println("Supplier: " + namaSupplier);
        }
    }
}
