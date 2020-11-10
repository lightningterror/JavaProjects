package fikt_proekti;

public class Covek {
    private String s_ime;
    private String s_prezime;
    private int s_godini;

    public String toStringCovek() {
        return "Informacii za studiranje na student:\n" +
                "Ime na student:" + s_ime + '\n' +
                "Prezime na student:" + s_prezime + '\n' +
                "Godini na student:" + s_godini + '\n';
    }

    public Covek(int godini, String ime, String prezime) {
        this.s_godini = godini;
        this.s_ime = ime;
        this.s_prezime = prezime;
    }

    public Covek() {

    }

    public String getIme() {
        return s_ime;
    }

    public void setIme(String ime) {
        this.s_ime = ime;
    }

    public String getPrezime() {
        return s_prezime;
    }

    public void setPrezime(String prezime) {
        this.s_prezime = prezime;
    }

    public void setGodini(int godini) {
        this.s_godini = godini;
    }
}
