package Lelang;

import java.util.ArrayList;

public class Masyarakat extends User{
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public void addMasyarakat(String nama, String alamat, String telp){
        setNama(nama);
        setAlamat(alamat);
        setTelepon(telp);
    }

    @Override
    public void setNama(String nama) {
        this.namaMasyarakat.add(nama);
    }

    @Override
    public void setAlamat(String Alamat) {
        this.alamat.add(Alamat);
    }

    @Override
    public void setTelepon(String telp) {
        this.telepon.add(telp);
    }

    @Override
    public String getNama(int ID) {
        return namaMasyarakat.get(ID);
    }

    @Override
    public String getAlamat(int ID) {
        return alamat.get(ID);
    }

    @Override
    public String getTelepon(int ID) {
        return alamat.get(ID);
    }
}
