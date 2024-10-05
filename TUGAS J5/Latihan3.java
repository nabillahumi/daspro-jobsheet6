import java.util.Scanner;

public class Latihan3 {

    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        String kode = "1";
        String merk;
        String kategori;
        int ukuran;
        double harga = 0.0;

        System.out.print("Masukkan merk sepatu (converse/sketcher/nike) ");
        merk = input18.nextLine();

        System.out.print("Masukkan kategori sepatu : ");
        kategori = input18.nextLine();

        System.out.print("Masukkan ukuran sepatu : ");
        ukuran = input18.nextInt();

        if (merk.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip On") && ukuran >= 36 && ukuran <= 40) {
                harga = 800000;
            } else if (kategori.equalsIgnoreCase("High Top") && ukuran >= 40 && ukuran <= 44) {
                harga = 1200000;

            } 
            
        } else if (merk.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman") && ukuran >= 36 && ukuran <= 41) {
                harga = 1000000;
            } else if (kategori.equalsIgnoreCase("Man") && ukuran >= 41 && ukuran <= 44) {
                harga = 1800000;
            }
        } else if (merk.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids") && ukuran >= 36 && ukuran <= 40) {
                harga = 750000;
            } else if (kategori.equalsIgnoreCase("Adult") && ukuran >= 40 && ukuran <= 44) {
                harga = 1500000;
            }
        } else {
            System.out.println("Input tidak valid");
        }

        System.out.println("Harga yang harus dibayar : " + harga);

        
    }
}
