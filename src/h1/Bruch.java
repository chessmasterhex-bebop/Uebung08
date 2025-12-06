package h1;

public class Bruch {

    public int zaehler;
    public int nenner;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    private int ggT(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);

        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }

        return x;
    }

    public void shorten() {
        int g = ggT(zaehler, nenner);
        if (g != 0) {
            zaehler /= g;
            nenner /= g;
        }
    }

    public boolean hasSameValueAs(Bruch b) {
        // Kopien der Werte, denn shorten() darf Brüche außen nicht verändern
        int z1 = this.zaehler;
        int n1 = this.nenner;
        int z2 = b.zaehler;
        int n2 = b.nenner;

        // ggT kürzen
        int g1 = ggT(z1, n1);
        int g2 = ggT(z2, n2);

        if (g1 != 0) {
            z1 /= g1;
            n1 /= g1;
        }
        if (g2 != 0) {
            z2 /= g2;
            n2 /= g2;
        }

        return (z1 == z2 && n1 == n2);
    }
}
