import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle girin:");
        String cumle = scanner.nextLine().trim(); // Boşlukları kaldırmak için  kullandım 

        String[] kelimeler = cumle.split("\\s+");

        String[] kelimeDizisi = new String[kelimeler.length];

        for (int i = 0; i < kelimeler.length; i++) {
            kelimeDizisi[i] = kelimeler[i];
        }

        if (kontrolEt(kelimeDizisi)) {
            System.out.println("HAYIR");
        } else {
            System.out.println("EVET");
        }
    }

    public static boolean kontrolEt(String[] kelimeDizisi) {
        int sp = kelimeDizisi.length - 1;
        while (sp != 0) {
            if (kelimeDizisi.length == 3) {

                if (kelimeDizisi[sp].equals("Gitmek")||kelimeDizisi[sp].equals("Gelmek")
                        || kelimeDizisi[sp].equals("Okumak") ||kelimeDizisi[sp].equals("Yazmak") ||
                        kelimeDizisi[sp].equals("Yürümek") ||kelimeDizisi[sp].equals("Görmek")) {

                    if (kelimeDizisi[sp - 1].equals("Bahce") || kelimeDizisi[sp - 1].equals("Okul") ||
                            kelimeDizisi[sp - 1].equals("Park") || kelimeDizisi[sp - 1].equals("Sınıf") ||
                            kelimeDizisi[sp - 1].equals("Yarın") || kelimeDizisi[sp - 1].equals("Pazartesi") ||
                            kelimeDizisi[sp - 1].equals("Salı") || kelimeDizisi[sp - 1].equals("Çarşamba") ||
                            kelimeDizisi[sp - 1].equals("Perşembe") || kelimeDizisi[sp - 1].equals("Cuma") ||
                            kelimeDizisi[sp - 1].equals("Cumartesi") || kelimeDizisi[sp - 1].equals("Pazar") ||
                            kelimeDizisi[sp - 1].equals("Merkez") || kelimeDizisi[sp - 1].equals("Ev") ||
                            kelimeDizisi[sp - 1].equals("Kitap") || kelimeDizisi[sp - 1].equals("Defter") ||
                            kelimeDizisi[sp - 1].equals("Güneş") ||
                            kelimeDizisi[sp - 1].equals("Beydağı")) {

                        if (kelimeDizisi[sp - 2].equals("Ben") || kelimeDizisi[sp - 2].equals("Sen") ||
                                kelimeDizisi[sp - 2].equals("Sen") || kelimeDizisi[sp - 2].equals("Hasan") ||
                                kelimeDizisi[sp - 2].equals("Nurşah") || kelimeDizisi[sp - 2].equals("Elif") ||
                                kelimeDizisi[sp - 2].equals("Abdulrrezak") || kelimeDizisi[sp - 2].equals("Şehribanu") ||
                                kelimeDizisi[sp - 2].equals("Zeynelabidin") || kelimeDizisi[sp - 2].equals("Naki")) {
                            return false;
                        }
                    }
                }
            }
            sp--;
        }
        return true;
    }
}
