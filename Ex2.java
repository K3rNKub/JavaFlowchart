import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter many Product ?");
        int n = input.nextInt();
        double sum=0;
        do{
            System.out.println("Enter Price");
            double x = input.nextInt();
            sum=sum+x;
            n = (n-1);
        }while(n>0);
        System.out.println("sum="+sum);
    }
}
