import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String isim;
        System.out.println("lutfen dosya ismi girin == src/dosya.txt ");
        isim =scanner.nextLine();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(isim))) {
            sayisinif[] bagliListe = new sayisinif[200];
            sayisinif[] bagliListe2 = new sayisinif[200];//yan yana yazdırmak için kopya oluşturdum
            int index = 0;
            String satir;
            for (int i = 0; i < bagliListe.length; i++) {
                bagliListe[i] = new sayisinif();
                bagliListe2[i] = new sayisinif();
            }

            while ((satir = bufferedReader.readLine()) != null) {
                if (!satir.isEmpty() && index < bagliListe.length) {
                    bagliListe[index].sayi1 = Integer.parseInt(satir);
                    bagliListe2[index].sayi1=Integer.parseInt(satir);
                    bagliListe[index].sayi2 = index;
                    bagliListe2[index].sayi2=index;
                    index++;
                }
            }

            for (int i = 0; i < index - 1; i++) {
                for (int j = 0; j < index - i - 1; j++) {
                    if (bagliListe[j].sayi1 > bagliListe[j + 1].sayi1) {
                        sayisinif temp = bagliListe[j];
                        bagliListe[j] = bagliListe[j + 1];
                        bagliListe[j + 1] = temp;
                    }
                }
            }

            for (int i = 0; i < index; i++) {
                String bosluk = "%-" + (15) + "s";
                System.out.printf(bosluk, bagliListe2[i].sayi1 + " " + bagliListe2[i].sayi2);
                System.out.println("    " + bagliListe[i].sayi1 + " " + bagliListe[i].sayi2);
            }
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " );
        }
    }
}