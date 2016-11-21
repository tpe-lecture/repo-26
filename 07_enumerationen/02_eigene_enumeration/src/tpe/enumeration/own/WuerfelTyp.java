package tpe.enumeration.own;

public enum WuerfelTyp {

    D4(4), D6(6), D8(8), D10(10), D12(12);

    private final int wurfelSeiten;

    private WuerfelTyp(int wurfelSeiten)
    {
        this.wurfelSeiten = wurfelSeiten;
    }

    public int getwurfelSeiten() {
        return wurfelSeiten;
    }

    public double average()
    {
        return (wurfelSeiten+1) * 0.5;
    }

}
