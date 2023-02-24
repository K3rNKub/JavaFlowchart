import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Midterm score :");
        int a = input.nextInt();
        System.out.println("Final score :");
        double b = input.nextDouble();
        double sum = a+b ;
        if (sum >= 80){
            System.out.println("Score" + sum + "," + "A");
        }else if(sum >= 75){
            System.out.println("Score" + sum + "," + "B+");
        }else if(sum>=70){
        System.out.println("Score" + sum + "," + "B");
        }else if(sum>=65){
        System.out.println("Score" + sum + "," + "C+");
        }else if(sum>=60){
        System.out.println("Score" + sum + "," + "C");
        }else if(sum>=55){
        System.out.println("Score" + sum + "," + "D+");
        }else if(sum>=50){
        System.out.println("Score" + sum + "," + "D");
        }else if(sum>=45){
        System.out.println("Score" + sum + "," + "E");
        }
    }
}
