package Lelang;

import java.util.Random;

public class bot {
    public int generateHarga(int hargaSebelum){
        Random rand = new Random();
        int lelang = rand.nextInt(2);
        if(lelang != 1){
            return rand.nextInt(hargaSebelum) + hargaSebelum;
        }else{
            return 0;
        }
    }
}
