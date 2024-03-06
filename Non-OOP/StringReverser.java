import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter your string:");
        String source = read.nextLine();
        System.out.println(source);

        for (String part : source.split(" ")) {
            System.out.print(new StringBuilder(part).reverse().toString());
            System.out.print(" ");
        }
        
        read.close();
    }
}