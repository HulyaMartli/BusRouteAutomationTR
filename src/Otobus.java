import java.util.Scanner;

public class Otobus {
    String ad;
    Guzergah guzergah;
    Durak duraklar[];
    static int index;

    public Otobus(Guzergah guzergah,String[] tumDuraklar) {
        this.guzergah=guzergah;
        duraklar=guzergah.guzergahOlustur(tumDuraklar);
        ad = guzergah.ad.replace("Güzergah","");
        System.out.println("Devam etmek için lütfen ENTER'a basınız.");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }

    public void otobusBilgileri(){
        index++;
        UI.blankLine();
        UI.hr();
        System.out.println(index+". otobüse \""+"00"+ad+"\" adı atanmış ve\ngüzergahı \""+guzergah.ad+"\" olarak\noluşturulmuştur.\n\n\""+guzergah.ad+"\" güzergahındaki\nduraklar:");
        UI.hr();
        for (Durak durak : duraklar) {
            System.out.println(durak.numara+"-"+durak.ad);
        }
        UI.hr();
        UI.blankLine();
    }
}
