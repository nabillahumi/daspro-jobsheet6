import java.util.Scanner;

public class Pemilihan2Percobaan218 {

    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        int pilihan_menu;
        String member;
        double harga;
        double diskon = 0.0;
        double total_bayar = 0.0;
        double pembayaranQris;

        System.out.println("------------------------");
        System.out.println("===== MENU KFE JTI =====");
        System.out.println("------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input18.nextInt();
        input18.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input18.nextLine();
        System.out.println("--------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2){
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
  
            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }

            // Menghitung total bayar setelah diskon
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);

        } else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2){
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
  
            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            } 

            // Menghitung total bayar 
            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }
         double potonganDiskon = total_bayar * diskon / 100 ;
         double totalSetelahDiskon = total_bayar - potonganDiskon ;

         if (pembayaranQris.equalsIgnoreCase("y")) {
            totalSetelahDiskon -= 1000;
         }

        
        System.out.println("------------------------------------------");
        }
    }

