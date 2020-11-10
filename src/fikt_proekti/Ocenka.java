package fikt_proekti;

//public class Ocenka extends Student {
public class Ocenka {
    private String predmetIme;
    private int predmetOcenka;
    int [] arr_oceni;
    private int[] predmetOcenkaArr;
    private String[] predmetPredmetiArr;

    public String toStringPolozeniInfo() {
        return  "Polozeni predmeti na studentot i ocenki:";
    }

    public String toStringLista( int index) {
        return  predmetPredmetiArr[index] + '\n' + predmetOcenkaArr[index];
    }

    public String toStringOcenka() {
        return  "Studentot ima prosek:\n";
    }

    public Ocenka(String predmet, int ocenka) {
        this.predmetIme = predmet;
        this.predmetOcenka = ocenka;
    }

    public Ocenka() {
    }

    public String getPredmet() {
        return predmetIme;
    }

    public void setPredmet(String predmet) {
        this.predmetIme = predmet;
    }


    public void setOcenka(int oceniarr[]) {
        predmetOcenkaArr = oceniarr;
    }

    public void setPredmeti(String predmeti[]) {
        predmetPredmetiArr = predmeti;
    }

    public double getProsek() {
        double total = 0;

        for (int i = 0; i < predmetOcenkaArr.length; i++) {
            total = total + predmetOcenkaArr[i];
        }

        return total / predmetOcenkaArr.length;
    }

}
