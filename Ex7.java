import java.util.Scanner;
public class Ex7 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number1 :");
        int a = scan.nextInt();
        System.out.println("Enter Number2 :");
        int b = scan.nextInt();
        System.out.println("a="+a);
        System.out.println("b ="+b);
        if (a == b){
            System.out.println("a =b");
            } else if (a > b) {
                System.out.println("จำนวน a มากกว่า");
            } else {
                System.out.println("จำนวน b มากกว่า");
            }
        }
    }

