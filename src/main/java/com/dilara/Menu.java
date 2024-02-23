package com.dilara;

public class Menu {
    private ECorbalar corba;
    private EYemekler yemek;
    private ETatlilar tatli;
    private EIcecekler icecek;

    public Menu(ECorbalar corba, EYemekler yemek, ETatlilar tatli, EIcecekler icecek) {
        this.corba = corba;
        this.yemek = yemek;
        this.tatli = tatli;
        this.icecek = icecek;
    }

    public ECorbalar getCorba() {
        return corba;
    }

    public void setCorba(ECorbalar corba) {
        this.corba = corba;
    }

    public EYemekler getYemek() {
        return yemek;
    }

    public void setYemek(EYemekler yemek) {
        this.yemek = yemek;
    }

    public ETatlilar getTatli() {
        return tatli;
    }

    public void setTatli(ETatlilar tatli) {
        this.tatli = tatli;
    }

    public EIcecekler getIcecek() {
        return icecek;
    }

    public void setIcecek(EIcecekler icecek) {
        this.icecek = icecek;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Menu{");
        sb.append("corba=").append(corba);
        sb.append(", yemek=").append(yemek);
        sb.append(", tatli=").append(tatli);
        sb.append(", icecek=").append(icecek);
        sb.append('}');
        return sb.toString();
    }
}
