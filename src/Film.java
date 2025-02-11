public class Film {
    private String Nazev;
    private int rokVydani;
    private int hodnoceni;
    private Herec[] herci;



    public Film(String nazev, int rokVydani, int hodnoceni, Herec[] herci) {
        this.Nazev = nazev;
        this.rokVydani = rokVydani;
        this.hodnoceni = hodnoceni;
        this.herci = herci;
    }

    public String getNazev() {
        return Nazev;
    }

    public int getHodnoceni() {
        return hodnoceni;
    }

    public int getRokVydani() {
        return rokVydani;
    }

    public Herec[] getHerci() {
        return herci;
    }
}
