package com.company;

/**
 * Yogie Alfin Salim
 */
public class Main {

    public static void main(String[] args) {
        Emas gold = new Emas();
        gold.setNamaPembeli("Hendi");
        gold.setBeratEmas(15.7);
        gold.setHargaEmas(570000);
        gold.tampilData(gold.getNamaPembeli(),
                gold.getBeratEmas(),gold.getHargaEmas(),
                gold.HargaTotal(gold.getBeratEmas(),gold.getHargaEmas()));
    }
}
