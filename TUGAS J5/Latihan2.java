import java.util.Scanner;

public class Latihan2 {

    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);
        
        String jeniBuku = "";
        int jumlahBuku;
        Double diskon = 0.0, totalDiskon = 0.0;

        System.out.print("Jenis buku yang akan dibeli : ");
        jeniBuku = input18.nextLine();

        System.out.print("masukkan jumlah buku yang akan dibeli : ");
        jumlahBuku = input18.nextInt();
        
        
        if (jeniBuku.equalsIgnoreCase("Komik")) {
            if (jumlahBuku > 2) {
                diskon = 0.12;
            } else {
                diskon = 0.1;
            }
            
        } else if (jeniBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku > 3) {
                diskon = 0.09;
            } else if (jumlahBuku <= 3) {
                diskon = 0.01;
            } else {
                diskon = 0.07;    
            }
            
        } else if (jeniBuku.equalsIgnoreCase("lainnya")) {
            if (jumlahBuku > 3){
                diskon = 0.05;
            }
        } else 
            System.out.println("input tidak valid");
        
            totalDiskon = jumlahBuku * diskon;
            System.out.println("Total Diskon : " + totalDiskon );
    }
}
