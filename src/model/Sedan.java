package model;

public class Sedan extends Mobil{
    private String merk;
    private int tahunPembuatan;

    public Sedan() {
    }

    public Sedan(String merk, int tahunPembuatan) {
        this.merk = merk;
        this.tahunPembuatan = tahunPembuatan;
    }

    public String getMerk() {
        return this.merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getTahunPembuatan() {
        return this.tahunPembuatan;
    }

    public void setTahunPembuatan(int tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

}
