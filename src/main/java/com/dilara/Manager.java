package com.dilara;

import java.util.Random;

public class Manager {
    public Menu gunlukMenu(){
        Random rastgeleMenu = new Random();
        ECorbalar corba = ECorbalar.values()[rastgeleMenu.nextInt(ECorbalar.values().length)];
        EIcecekler icecek = EIcecekler.values()[rastgeleMenu.nextInt(EIcecekler.values().length)];
        EYemekler yemek = EYemekler.values()[rastgeleMenu.nextInt(EYemekler.values().length)];
        ETatlilar tatli = ETatlilar.values()[rastgeleMenu.nextInt(ETatlilar.values().length)];

        return new Menu(corba, yemek, tatli, icecek);
    }


    private EIcecekler[] haftalikIcecekler = new EIcecekler[7];
    private int haftalikIcecekIndex = 0;
    public Menu gunlukMenuFarkliIcecek(){
        Random farkliIcecekliMenu = new Random();
        ECorbalar corba = ECorbalar.values()[farkliIcecekliMenu.nextInt(ECorbalar.values().length)];
        EIcecekler icecek;
        if (haftalikIcecekIndex < 7) {
            icecek = EIcecekler.values()[haftalikIcecekIndex];
            haftalikIcecekler[haftalikIcecekIndex++] = icecek;
        } else {
            icecek = haftalikIcecekler[farkliIcecekliMenu.nextInt(7)];
        }
        EYemekler yemek = EYemekler.values()[farkliIcecekliMenu.nextInt(EYemekler.values().length)];
        ETatlilar tatli = ETatlilar.values()[farkliIcecekliMenu.nextInt(ETatlilar.values().length)];

        return new Menu(corba, yemek, tatli, icecek);
    }
}
