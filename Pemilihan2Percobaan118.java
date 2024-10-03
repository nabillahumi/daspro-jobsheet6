import java.util.Scanner;

public class Pemilihan2Percobaan118 {

    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        int tahun = 2000;

        System.out.print("Masukkan tahun :");
        tahun = input18.nextInt();

        if (tahun % 4 == 0) {
            if (tahun % 100 != 0) {
                System.out.println("Tahun Kabiset");

            } else {
                if(tahun%400 == 0)
                    System.out.println("Tahun Kabisat");
                else 
                    System.out.println("Bukan Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan TAhun Kabisat");
        }
    }
}