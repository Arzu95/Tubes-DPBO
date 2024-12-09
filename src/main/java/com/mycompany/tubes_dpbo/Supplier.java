/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo;

/**
 *
 * @author User
 */
public class Supplier implements CrudInterface {
    private int idSupplier;
    private String namaSupplier;
    private String jenisSupplier;
    private int nomorTelepon;
    private String alamat;

    @Override
    public void edit() {
        System.out.println("Data supplier diedit.");
    }

    @Override
    public void delete() {
        System.out.println("Data supplier dihapus.");
    }

    @Override
    public void update() {
        System.out.println("Data supplier diperbarui.");
    }

    public void displaySupplierByCategory(String kategori) {
        if (jenisSupplier.equalsIgnoreCase(kategori)) {
            System.out.println("Supplier: " + namaSupplier);
        }
    }
}
