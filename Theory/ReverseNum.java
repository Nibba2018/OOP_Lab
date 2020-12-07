import java.util.Scanner;

public class ReverseNum {

    public static String rev(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        String number = sc.nextLine();
        sc.close();

        System.out.println("Reversed number:"+rev(number));
    }
}
