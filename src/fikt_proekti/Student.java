package fikt_proekti;

public class Student extends Covek{
    private String brIndeks;
    private String fakultet;
    private double prosek;

    public String toStringStudent() {
        return "Indeks:" + brIndeks + '\n' +
                "Fakultet:" + fakultet + '\n';
    }

    public Student(String indeks, String fakultet, double prosek) {
        this.brIndeks = indeks;
        this.fakultet = fakultet;
        this.prosek = prosek;
    }

    public Student() {

    }

    public String GetFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public double getProsek() {
        return prosek;
    }

    public void setProsek(double prosek) {
        this.prosek = prosek;
    }

    public String getBrIndeks() {
        return brIndeks;
    }

    public void setBrIndeks(String brIndeks) {
        this.brIndeks = brIndeks;
    }
}
