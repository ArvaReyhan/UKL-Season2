package TokoKelontong;

import java.util.ArrayList;

public class Barang {
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public Barang() {
        this.namaBarang.add("Cokelat Enak");
        this.stok.add(15);
        this.harga.add(10000);

        this.namaBarang.add("Sabun Wangy-wangy");
        this.stok.add(30);
        this.harga.add(5000);

        this.namaBarang.add("Odol siwak");
        this.stok.add(20);
        this.harga.add(15000);
    }

    //get jumlah
    public int getJmlhBarang(){
        return this.namaBarang.size();
    }

    //anything correlated with namaBarang
    public void setNamaBarang(String _namaBarang){
        this.namaBarang.add(_namaBarang);
    }
    public String getNamaBarang(int idBarang){
        return this.namaBarang.get(idBarang);
    }
    //anything correlated with namaBarang

    //anything correlated with stok
    public void setStok(int _stok){
        this.stok.add(_stok);
    }
    public int getStok(int idBarang){
        return this.stok.get(idBarang);
    }
    public void editStok(int idBarang, int stok){
        this.stok.set(idBarang, stok);
    }
    //anything correlated with stok

    //anything correlated with harga
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    public int getHarga(int idBarang){
        return this.harga.get(idBarang);
    }
    //anything correlated with harga
}
