package fikt_proekti;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        // Informacii za student od klasa Covek
        student.setIme("Sotir");
        student.setPrezime("Kitanovski");
        student.setGodini(22);
        System.out.println(student.toStringCovek());

        // Informacii za student od klasa student
        student.setFakultet("FIKT");
        student.setBrIndeks("20/KNI");
        System.out.println(student.toStringStudent());

        // Informacii za student od klasa ocenka
        // 4 predmeti za test
        Ocenka o = new Ocenka();
        int ocenki[] = new int[]{ 6,8,7,10 };
        o.setOcenka(ocenki);
        String predmeti[] = new String[]{"Organizacisko pretpriemnistvo", "Strukturirano Programiranje",
                "Napredno Programiranje", "Ekonomija i biznis"};
        o.setPredmeti(predmeti);

        // Info za polozeni predmeti i ocenki
        System.out.println(o.toStringPolozeniInfo());
        for (int i = 0; i < ocenki.length; i++) {
            System.out.println(o.toStringLista(i));
        }

        // Prosek
        System.out.println(o.toStringOcenka() + o.getProsek());
    }
}
