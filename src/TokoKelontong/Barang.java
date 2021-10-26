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
}
