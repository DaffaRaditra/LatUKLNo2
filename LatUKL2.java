import java.util.Scanner;
public class LatUKL2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Penentuan Bilangan Ganjil atau Genap");
        System.out.print("Masukkan sebuah bilangan bulat: ");
        
        while (!scanner.hasNextInt()) {
            System.out.println("Input tidak valid. Harap masukkan bilangan bulat.");
            scanner.next(); 
            System.out.print("Masukkan sebuah bilangan bulat: ");
        }
        
        int bilangan = scanner.nextInt();

        double hasilBagiDouble = (double) bilangan / 2;

        int hasilBagiInt = bilangan / 2;

        double hasilBagiIntKeDouble = (double) hasilBagiInt;

        if (hasilBagiDouble == hasilBagiIntKeDouble) {
            System.out.println("Bilangan " + bilangan + " adalah bilangan Genap.");
        } else {

            System.out.println("Bilangan " + bilangan + " adalah bilangan Ganjil.");
        }

        
    }
}
    

