/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo;

/**
 *
 * @author applejenius.id
 */
public class UMKM extends User{
    private String telephoneNumber;
    private String[] listKelasDiikuti;

    public UMKM(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        this.listKelasDiikuti = new String[0];
    }

    public void register() {}

    public void login() {}

    public void updateUserData(String newTelephoneNumber) {
        this.telephoneNumber = newTelephoneNumber;
    }

    public String getUserInfo() {
        return "Nomor Telepon: " + telephoneNumber;
    }

    public void ikutKelas(String namaKelas) {
        String[] newListKelas = new String[listKelasDiikuti.length + 1];
        System.arraycopy(listKelasDiikuti, 0, newListKelas, 0, listKelasDiikuti.length);
        newListKelas[listKelasDiikuti.length] = namaKelas;
        listKelasDiikuti = newListKelas;
    }
}
