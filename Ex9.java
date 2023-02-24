import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x =input.nextInt();
        if (x>0) {
            System.out.println("Positive Number");
        }
        else if (x < 0) {
            System.out.println("Negative Number");
        }else {
            System.out.println("Zero");
        }
    }
}
