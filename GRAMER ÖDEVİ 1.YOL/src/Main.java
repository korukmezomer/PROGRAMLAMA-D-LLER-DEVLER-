import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lütfen bir cümle girin-->");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        a = a.trim();//cumlenin başında boşluk olması durumunda boşluğu kaldırmak için kullandım
        String[] kelimeler = a.split("\\s+");
        boolean bollean = false;

        String[] ozne = {"Ben","Sen","Hasan","Nurşah","Elif","Abdulrezzak","Şehribanu","Zeynelabidin","Naki"};
        String[] nesne = {"Bahçe", "Okul", "Park", "Sınıf", "Yarın", "Pazartesi", "Salı", "Çarşamba", "Perşembe",
                "Cuma", "Cumartesi", "Pazar", "Merkez","Ev","Kitap","Defter","Güneş","Beydağı"};
        String[] yuklem = {"Gitmek","Gelmek","Okumak","Yazmak","Yürümek","Görmek"};


        if (kelimeler.length== 3) {
        for (int i = 0; i < ozne.length; i++)
            if (kelimeler[0].equals(ozne[i])) {
                for (int j = 0; j < nesne.length; j++) {
                    if (kelimeler[1].equals(nesne[j])) {
                        for (int k = 0; k < yuklem.length; k++) {
                            if (kelimeler[2].equals(yuklem[k])) {
                                bollean = true;
                            }
                        }
                    }
                }
            }
        }
        if (bollean) {
            System.out.println("EVET");
        } else {
            System.out.println("HAYIR");
        }
    }
}
