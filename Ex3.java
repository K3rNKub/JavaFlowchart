import java.util.Scanner;
public class Ex3 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount :");
        int n = input.nextInt();
        System.out.println("Enter Price :");
        float x = input.nextFloat();
        float result = n * x ;
        System.out.println("Total Price :" +result);
    }
}
