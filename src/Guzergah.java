import java.util.Scanner;

public class Guzergah {
    String ad;
    static int numara;

    public Durak [] guzergahOlustur(String [] tumDuraklar) {
        Scanner sc = new Scanner(System.in);

        UI.hr();
        System.out.println("————————————————— TÜM DURAKLAR: ——————————————————");
        UI.hr();
        for (int i=0; i< tumDuraklar.length; i++) {
            System.out.println(i+"-"+tumDuraklar[i]);
        }

        UI.hr();
        UI.blankLine();
        System.out.println("Lütfen güzergahta yer alacak İLK durağın yukarı\nlistedeki indeks numarasını giriniz:");
        int durakBaslangicIndeksi=sc.nextInt();
        System.out.println("Lütfen güzergahta yer alacak SON durağın yukarı\nlistedeki indeks numarasını giriniz:");
        int durakBitisIndeksi= sc.nextInt();

        numara ++;
        ad ="Güzergah"+numara+": "+tumDuraklar[durakBaslangicIndeksi]+"-"+tumDuraklar[durakBitisIndeksi];
        Durak duraklar[]= new Durak[durakBitisIndeksi-durakBaslangicIndeksi+1];

        for (int i=0; i<duraklar.length; i++) {
            Durak durak = new Durak(i+1,tumDuraklar[i+durakBaslangicIndeksi]);
            duraklar[i]=durak;
        }
        return duraklar;
    }
}
