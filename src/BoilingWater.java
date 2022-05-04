import java.util.Scanner;
public class BoilingWater {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number greater that 212: ");
        int num = scan.nextInt();
        if (num > 212) {
            System.out.println("Water is boiling!");
            scan.close();
        }
    }
}
