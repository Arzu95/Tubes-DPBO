/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

import entity.Item;
import java.util.ArrayList;
import java.util.HashMap;
import entity.Kelas;

public class UMKM extends User {
    private String noTelp;
    private ArrayList<Item> itemList;
    private HashMap<String, Double> pendapatanPerBulan;
    private ArrayList<Kelas> kelasList; 

    public UMKM(String username, String password, String nama, String noTelp) {
        super(username, password, nama);
        this.noTelp = noTelp;
        this.itemList = new ArrayList<>();
        this.pendapatanPerBulan = new HashMap<>();
        this.kelasList = new ArrayList<>(); // Inisialisasi kelasList
    }

    public void tambahItem(Item item) {
        itemList.add(item);
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void tambahKelas(Kelas kelas) {
        kelasList.add(kelas); // Tambahkan kelas ke daftar kelas UMKM
    }

    public ArrayList<Kelas> getKelasList() {
        return kelasList; // Kembalikan daftar kelas UMKM
    }

    public void tambahPendapatan(String bulan, double jumlah) {
        pendapatanPerBulan.put(bulan, pendapatanPerBulan.getOrDefault(bulan, 0.0) + jumlah);
    }

    public double lihatPendapatan(String bulan) {
        return pendapatanPerBulan.getOrDefault(bulan, 0.0);
    }

    @Override
    public void displayInfo() {
        System.out.println("UMKM: " + nama + " | No. Telp: " + noTelp);
    }
}
