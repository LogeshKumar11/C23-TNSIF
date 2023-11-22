import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        StringBuilder binary = new StringBuilder(); 

        while (n != 0) {
            r = n % 2;
            n = n / 2;
            binary.insert(0, r); 
        }

        System.out.println("Binary representation: " + binary);
    }
}
