import java.util.Scanner;

public class OtobusTest {

    // Güzergah 1 = Dikimevi, Kurtuluş, Kolej, Kızılay - Otobüs 1 - Başlangıç:0 Bitiş:3
    // Güzergah 2 = Kızılay, Demirtepe, Maltepe, Tandoğan - Otobüs 2 - Başlangıç:3 Bitiş:6
    // Güzergah 3 = Tandoğan, Beşevler, Bahçelievler, Emek, AŞTİ - Otobüs 3 - Başlangıç:6 Bitiş:10

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] tumDuraklar = {"Dikimevi","Kurtuluş","Kolej","Kızılay", "Demirtepe", "Maltepe", "Tandoğan", "Beşevler","Bahçelievler", "Emek", "AŞTİ"};

        UI.menu();

        UI.title(0);
        Guzergah guzergah1 = new Guzergah();
        Otobus otobus1 = new Otobus(guzergah1,tumDuraklar);


        UI.title(1);
        Guzergah guzergah2 = new Guzergah();
        Otobus otobus2 = new Otobus(guzergah2,tumDuraklar);

        UI.title(2);
        Guzergah guzergah3 = new Guzergah();
        Otobus otobus3 = new Otobus(guzergah3,tumDuraklar);

        System.out.println("Teşekkürler! Sistemde yer alan bütün otobüslerin\nisim ve güzergahı tanımlanmıştır.\n\nOtobüs bilgilerini listelemek için lütfen ENTER'a\nbasınız.");
        sc.nextLine();


        otobus1.otobusBilgileri();

        otobus2.otobusBilgileri();

        otobus3.otobusBilgileri();




    }
}