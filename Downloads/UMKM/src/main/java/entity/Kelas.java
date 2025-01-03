/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class Kelas {
    private String namaKelas;
    private String deskripsi;
    private String KelasList;

    public String getKelasList() {
        return KelasList;
    }

    public Kelas(String namaKelas, String deskripsi) {
        this.namaKelas = namaKelas;
        this.deskripsi = deskripsi;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}
