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
            sayisinif[] dizi1 = new sayisinif[200];
            sayisinif[] dizi2 = new sayisinif[200];//yan yana yazdırmak için kopya oluşturdum
            int index = 0;
            String satir;
            for (int i = 0; i < dizi1.length; i++) {
                dizi1[i] = new sayisinif();
                dizi2[i] = new sayisinif();
            }

            while ((satir = bufferedReader.readLine()) != null) {
                if (!satir.isEmpty() && index < dizi1.length) {
                    dizi1[index].sayi1 = Integer.parseInt(satir);
                    dizi1[index].sayi2 = index;
                    index++;
                }
            }
            for (int j = 0; j <index ;j++) {
                dizi2[j]=dizi1[j];
            }

            for (int i = 0; i < index - 1; i++) {
                for (int j = 0; j < index - i - 1; j++) {
                    if (dizi1[j].sayi1 > dizi1[j+1].sayi1) {
                        sayisinif temp = dizi1[j];
                        dizi1[j] = dizi1[j + 1];
                        dizi1[j + 1] = temp;
                    }
                }
            }

            for (int i = 0; i < index; i++) {
                String bosluk = "%-" + (15) + "s";
                System.out.printf(bosluk, dizi2[i].sayi1 + " " + dizi2[i].sayi2);
                System.out.println("    " + dizi1[i].sayi1 + " " + dizi1[i].sayi2);
            }
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " );
        }
    }
}