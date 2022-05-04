import java.util.Scanner;
public class SameOrNah {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Word: ");
        String data1 = scan.nextLine();
        System.out.println("Enter another Word: ");
        String data2 = scan.nextLine();
        if (data1.equals(data2)) {
            System.out.println("The words are the same"); 
        } else {
            System.out.println("The words are different");
            scan.close();
        }
    }
}