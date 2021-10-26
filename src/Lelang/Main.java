package Lelang;

import java.util.Scanner;

public class Main {
    static Masyarakat masyarakat = new Masyarakat();
    static Barang barangLelang = new Barang();
    static Petugas petugas = new Petugas("Anonimus", "jalan jalan", "08123425624");

    static Scanner userInput = new Scanner(System.in);
    static Scanner ulangi = new Scanner(System.in);

    static String jawab = "";
    static String user_input = "";
    public static void main(String[] args) {
        System.out.print("Generate Barang ? (y/n) : ");
        user_input = userInput.nextLine();

        if (user_input.equalsIgnoreCase("y")){
            generatebarang();
            barangLelang.tampilBarang();
        }else{
            System.out.println("Skip dlu");
        }

    }
    static void lelangStart() {
        do {
            /*logic here*/

            /*logic here*/

            System.out.print("apakah anda ingin menawar lagi ? (Y/T) : ");
            jawab = ulangi.nextLine();

        } while (jawab.equalsIgnoreCase("Y"));
    }


    static void generatebarang() {
        barangLelang.addNamaBarang("Sabun wangy wangy");
        barangLelang.addHargaAwal("10000");
        barangLelang.setStatus(true);

        barangLelang.addNamaBarang("Artefak");
        barangLelang.addHargaAwal("400000");
        barangLelang.setStatus(true);

        barangLelang.addNamaBarang("keyboard");
        barangLelang.addHargaAwal("200000");
        barangLelang.setStatus(true);
    }
}