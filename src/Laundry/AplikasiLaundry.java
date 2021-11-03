package Laundry;
public class AplikasiLaundry {
    public static void main(String[] args) {
        JenisLaundry daftarJenisLaundry = new JenisLaundry();
        Client daftarClient = new Client();
        Petugas petugas1 = new Petugas();
        Transaksi transaksiLaundry = new Transaksi();
        Laporan laporanLaundry = new Laporan();

        laporanLaundry.laporan(daftarClient);
        laporanLaundry.laporan(daftarJenisLaundry);
        System.out.println();//jarak
        transaksiLaundry.prosesTransaksi(daftarClient, transaksiLaundry, daftarJenisLaundry);
        System.out.println();//jarak
        laporanLaundry.laporan(transaksiLaundry, daftarJenisLaundry);
        
        
    }
}
