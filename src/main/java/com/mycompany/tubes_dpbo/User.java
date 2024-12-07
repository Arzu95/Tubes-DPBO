/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo;

/**
 *
 * @author applejenius.id
 */
public class User {
    private int userId;
    private String nama;

    public User(int userId, String nama) {
        this.userId = userId;
        this.nama = nama;
    }

    public void register() {
        System.out.println("User " + nama + " berhasil terdaftar.");
    }

    public void login() {
        System.out.println("User " + nama + " berhasil login.");
    }

    public void updateUserData(String newNama) {
        this.nama = newNama;
        System.out.println("Nama user berhasil diperbarui menjadi " + nama);
    }

    public void logout() {
        System.out.println("User " + nama + " berhasil logout.");
    }

    public String getNama() {
        return nama;
    }
}

