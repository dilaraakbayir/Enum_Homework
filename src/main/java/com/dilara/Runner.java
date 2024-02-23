package com.dilara;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Manager manager = new Manager();
        List<Menu> haftalikMenu = new ArrayList<>();

        for (EGun gun : EGun.values()) {
            Menu menu = manager.gunlukMenu();
            haftalikMenu.add(menu);
            System.out.println(gun+" MENUSU:");
            System.out.println("Corba: "+menu.getCorba());
            System.out.println("Yemek: "+menu.getYemek());
            System.out.println("Tatlı: "+menu.getTatli());
            System.out.println("Icecek: "+menu.getIcecek());
            System.out.println();
        }

        System.out.println("- - HER GUN FARKLI ICECEKLI MENU - -");

        for (EGun gun : EGun.values()) {
            Menu menu = manager.gunlukMenuFarkliIcecek();
            haftalikMenu.add(menu);
            System.out.println(gun + " MENUSU: " + menu);
        }









    }
}
