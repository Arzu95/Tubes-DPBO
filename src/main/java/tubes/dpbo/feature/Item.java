/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes.dpbo.feature;

import java.util.ArrayList;
import java.util.HashMap;
import tubes.dpbo.common.CrudInterface;

public class Item implements CrudInterface<Item> {
    private String namaBarang;
    private int stok;
    private double hargaBarang;
    private String kategori;

    private static ArrayList<Item> itemList = new ArrayList<>();

    public Item(String namaBarang, int stok, double hargaBarang, String kategori) {
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.hargaBarang = hargaBarang;
        this.kategori = kategori;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    @Override
    public HashMap<Integer, ArrayList<Item>> get() {
        HashMap<Integer, ArrayList<Item>> categorizedItems = new HashMap<>();
        int id = 1;
        for (Item item : itemList) {
            ArrayList<Item> items = categorizedItems.get(id);
            if (items == null) {
                items = new ArrayList<>();
                categorizedItems.put(id, (ArrayList<Item>) items);
            }
            items.add(item);
            id++;
        }
        return categorizedItems;
    }

    @Override
    public Item cariBerdasarkanId(int id) {
        if (id > 0 && id <= itemList.size()) {
            System.out.println("Mencari item dengan ID: " + id);
            return itemList.get(id - 1);
        } else {
            System.out.println("Item dengan ID " + id + " tidak ditemukan.");
            return null;
        }
    }

    @Override
    public void create(Item entity) {
        itemList.add(entity);
        System.out.println("Item ditambahkan: " + entity.getNamaBarang());
    }

    @Override
    public void update(Item entity) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).equals(entity)) {
                itemList.set(i, entity);
                System.out.println("Item berhasil diupdate: " + entity.getNamaBarang());
                return;
            }
        }
        System.out.println("Item tidak ditemukan untuk diupdate.");
    }

    @Override
    public void delete(int id) {
        if (id > 0 && id <= itemList.size()) {
            Item removedItem = itemList.remove(id - 1);
            System.out.println("Item dengan nama " + removedItem.getNamaBarang() + " berhasil dihapus.");
        } else {
            System.out.println("Item dengan ID " + id + " tidak ditemukan.");
        }
    }

    public void tampilkanBerdasarkanKategori(String kategori) {
        System.out.println("Menampilkan barang dengan kategori: " + kategori);
        boolean found = false;
        for (Item item : itemList) {
            if (item.getKategori().equalsIgnoreCase(kategori)) {
                System.out.println("Nama Barang: " + item.getNamaBarang() + ", Stok: " + item.getStok() + ", Harga: " + item.getHargaBarang());
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("Tidak ada barang dengan kategori: " + kategori);
        }
    }
}
