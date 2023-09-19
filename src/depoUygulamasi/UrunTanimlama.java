package depoUygulamasi;

public class UrunTanimlama {

    // 1-) burada oncelikle urunun tanimlamasi  yapilir. (6 adet fields mevcut) ==>> POJO Class

    // urunIsmi
    // uretici
    // miktar
    // birim
    // raf


    private String urunIsmi;
    private String uretici;
    private int miktar;
    private String birim;
    private String raf;


    public UrunTanimlama(String urunIsmi, String uretici, int miktar, String birim, String raf) {

        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }

    public UrunTanimlama() {
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "UrunTanimlama{" +
                ", urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'' +
                '}';
    }
}
