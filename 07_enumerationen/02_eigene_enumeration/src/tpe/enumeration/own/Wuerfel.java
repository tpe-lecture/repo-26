package tpe.enumeration.own;

import java.util.Random;

/**
 * Ein einfacher Würfel.
 */
public class Wuerfel {

//    /** 4-seitiger Würfel. */
//    public static final int D4 = 4;
//
//    /** 6-seitiger Würfel. */
//    public static final int D6 = 6;
//
//    /** 8-seitiger Würfel. */
//    public static final int D8 = 8;
//
//    /** 10-seitiger Würfel. */
//    public static final int D10 = 10;
//
//    /** 12-seitiger Würfel. */
//    public static final int D12 = 12;

    /** Zufallszahlengenerator. */
    private final Random rnd = new Random();

    /** Anzahl der Seiten des Würfels. */
    private final WuerfelTyp numSides;



    /**
     * Einen neuen Würfel anlegen.
     *
     * @param numSides Anzahl der Seiten des Würfels.
     */
    public Wuerfel(WuerfelTyp numSides) {
        this.numSides = numSides;
    }

    /**
     * Den Würfel werfen.
     *
     * @return Ergebnis des Wurfes.
     */
    public int roll() {
        return rnd.nextInt(numSides.getwurfelSeiten()) + 1;
    }
}
