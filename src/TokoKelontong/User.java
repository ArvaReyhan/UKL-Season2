package TokoKelontong;

public interface User {
    void setNama(String nama);
    void setAlamat(String alamat);
    void setTelepon(String telp);
    String getNama(int id);
    String getAlamat(int id);
    String getTelepon(int id);
}
