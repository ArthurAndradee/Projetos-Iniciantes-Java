import java.util.Scanner;

public class IsNumberEven
 {
     public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();

        if (number % 2 == 0)
        System.out.println(number + " is Even");
        else
        System.out.println(number + " is odd");

        read.close();
    }
 }