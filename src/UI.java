import java.util.Scanner;

public class UI {
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        blankLine();
        hr();
        System.out.println("▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢");
        System.out.println("▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢");
        System.out.println(" ▢▢▢▢▢▢▢▢▢ GÜZERGAH OTOMASYONU ▢▢▢▢▢▢▢▢▢▢ ");
        System.out.println("▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢");
        System.out.println("▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢▢");
        hr();
        System.out.println("Otomasyona giriş yapmak için lütfen ENTER'a basınız.");
        sc.nextLine();
    }

    public static void blankLine(){
        System.out.println();
    }

    public static void hr(){
        System.out.println("——————————————————————————————————————————————————");
    }

    public static void title(int index){
        String [] titles = {"————————— Otobüs 1 - Güzergah Tanımlama —————————", "————————— Otobüs 2 - Güzergah Tanımlama —————————", "————————— Otobüs 3 - Güzergah Tanımlama —————————"};
        hr();
        System.out.println(titles[index]);
        hr();
        blankLine();

    }

}
