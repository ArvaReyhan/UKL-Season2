package TokoKelontong;

public class TokoOnline {
    public static void main(String[] args) {
        Member orang = new Member();
        Karyawan pegawai = new Karyawan();
        Barang barang = new Barang();
        Transaksi transaksi = new Transaksi();

        Laporan laporan = new Laporan();
        laporan.Laporan(orang);
        laporan.Laporan(barang);
        laporan.Laporan(transaksi, barang);

        System.out.println();

        transaksi.prosesTransaksi(orang, transaksi, barang);
        laporan.Laporan(orang);
        laporan.Laporan(barang);
        laporan.Laporan(transaksi, barang);
    }
}
