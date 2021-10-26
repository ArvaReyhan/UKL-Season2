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
        login();
        askGeneratebarang();
        askAjukanBarang();
    }

    static boolean UserAnswerIsYes(String input){
        return input.equalsIgnoreCase("y");
    }

    static void login(){
        System.out.print("Nama : ");
        String nama = userInput.nextLine();
        System.out.print("Alamat : ");
        String alamat = userInput.nextLine();
        System.out.print("telp : ");
        String telp = userInput.nextLine();
        masyarakat.Masyarakat(nama, alamat, telp);
    }
    static void askGeneratebarang(){
        //ask for generate
        System.out.print("Generate Barang ? (y/n) : ");
        user_input = userInput.nextLine();

        if (UserAnswerIsYes(user_input)){
            generatebarang();
            System.out.println("Barang Lelang generated");
        }else{
            System.out.println("oke");
        }
    }

    static void askAjukanBarang(){
        //ask if you want to create barang yourself
        System.out.print("Ajukan barang untuk lelang? (y/n) : ");
        user_input = userInput.nextLine();
        if (UserAnswerIsYes(user_input)){
            petugas.doYourJob(barangLelang);
            System.out.println("barang ditambahkan");
        }else{
            System.out.println("oke");
        }
    }

    static void lelangStart() {
        do {
            /*logic here*/

            /*logic here*/

            System.out.print("apakah anda ingin menawar lagi ? (Y/T) : ");
            jawab = ulangi.nextLine();

        } while (UserAnswerIsYes(jawab));
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