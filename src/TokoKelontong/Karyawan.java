package TokoKelontong;

import java.util.ArrayList;

public class Karyawan implements User{

    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    /*Constructor*/
    public Karyawan() {
        this.namaKaryawan.add("admin");
        this.alamat.add("kedung kandang");
        this.telepon.add("081112223333");
        this.jabatan.add(0);
    }

    //setter getter
    public void setJabatan(int jabatan ){
        this.jabatan.add(jabatan);
    }
    public int getJabatan(int id){
        return this.jabatan.get(id);
    }
    public int getJmlKaryawan(){
        return this.namaKaryawan.size();
    }
    //setter getter

    //overrided method
    @Override
    public void setNama(String nama) {
        this.namaKaryawan.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telp) {
        this.telepon.add(telp);
    }

    @Override
    public String getNama(int id) {
        return this.namaKaryawan.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
}
