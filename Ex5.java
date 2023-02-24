import java.util.Scanner;
public class Ex5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter square width :");
        float w = input.nextFloat();
        System.out.println("Enter square height :");
        float l = input.nextFloat();
        float result = w * l;
        System.out.println("Area of the square is"+ result);  
    }
}
