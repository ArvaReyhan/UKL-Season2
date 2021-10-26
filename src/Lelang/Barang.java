package Lelang;

import java.util.ArrayList;

public class Barang extends Lelang {
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<String> hargaAwal = new ArrayList<String>();

    public int getIdMasyarakat(int index) {
        return idMasyarakat.get(index);
    }

    public void addIdMasyarakat(int ID) {
        this.idMasyarakat.add(ID);
    }

    public String getNamaBarang(int index) {
        return namaBarang.get(index);
    }

    public void addNamaBarang(String nama) {
        this.namaBarang.add(nama);
    }

    public String getHargaAwal(int index) {
        return hargaAwal.get(index);
    }

    public void addHargaAwal(String harga) {
        this.hargaAwal.add(harga);
    }
}
