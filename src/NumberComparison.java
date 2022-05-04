import java.util.Scanner;
public class NumberComparison {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter another number: ");
        int num2 = scan.nextInt();
        if (num1 == num2) {
            System.out.println("Numbers are the same"); 
        } else if (num1 > num2) {
            System.out.println("The first number was larger than the second");
        } else {
            System.out.println("The second number was larger than the first");
            scan.close();
        }
    }
}
