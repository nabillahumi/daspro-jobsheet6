import java.util.Scanner;

public class Latihan1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1 = 28, bil2 = 54, bil3 = 15;
        int bilMax;

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                bilMax = bil1;
            } else {
                bilMax = bil3;
            }
        } else {
            if (bil2 > bil3){
                bilMax = bil2;
            } else {
                bilMax = bil3;
            }
        }
        System.out.println("bil max" + bilMax);
    }
}