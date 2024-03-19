import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle girin-->");
        String cumle = scanner.nextLine().trim(); // Boşlukları kaldırmak için  kullandım

        String[] kelime = cumle.split("\\s+");

        String[] kelimeDizisi = new String[kelime.length];

        for (int i = 0; i < kelime.length; i++) {
            kelimeDizisi[i] = kelime[i];
        }

        if (kontrolEt(kelimeDizisi)) {
            System.out.println("HAYIR");
        } else {
            System.out.println("EVET");
        }
    }

    public static boolean kontrolEt(String[] kelimeler) {
        int sp = kelimeler.length - 1;
        while (sp != 0) {
            if (kelimeler.length==3) {

                if (kelimeler[sp].equals("Gitmek")||kelimeler[sp].equals("Gelmek")
                        || kelimeler[sp].equals("Okumak") ||kelimeler[sp].equals("Yazmak") ||
                        kelimeler[sp].equals("Yürümek") ||kelimeler[sp].equals("Görmek")) {

                    if (kelimeler[sp - 1].equals("Bahçe") || kelimeler[sp - 1].equals("Okul") ||
                            kelimeler[sp -1].equals("Park") || kelimeler[sp - 1].equals("Sınıf") ||
                            kelimeler[sp -1].equals("Yarın") || kelimeler[sp - 1].equals("Pazartesi") ||
                            kelimeler[sp -1].equals("Salı") || kelimeler[sp - 1].equals("Çarşamba") ||
                            kelimeler[sp -1].equals("Perşembe") || kelimeler[sp - 1].equals("Cuma") ||
                            kelimeler[sp -1].equals("Cumartesi") || kelimeler[sp - 1].equals("Pazar") ||
                            kelimeler[sp -1].equals("Merkez") || kelimeler[sp - 1].equals("Ev") ||
                            kelimeler[sp -1].equals("Kitap") || kelimeler[sp - 1].equals("Defter") ||
                            kelimeler[sp -1].equals("Güneş") ||
                            kelimeler[sp -1].equals("Beydağı")) {

                        if (kelimeler[sp -2].equals("Ben") || kelimeler[sp - 2].equals("Sen") ||
                                kelimeler[sp -2].equals("Hasan") || kelimeler[sp - 2].equals("Nurşah") ||
                                kelimeler[sp -2].equals("Elif") || kelimeler[sp - 2].equals("Abdulrrezak") ||
                                kelimeler[sp -2].equals("Şehribanu") || kelimeler[sp - 2].equals("Zeynelabidin") ||
                                kelimeler[sp -2].equals("Naki")) {
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
