import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number:");
        String acc_num = sc.nextLine();
        System.out.print("Enter account balance:");
        Integer balance = Integer.parseInt(sc.nextLine());

        System.out.println();
        CheckingAccount acc1 = new CheckingAccount(acc_num, balance);
        acc1.details();

        System.out.println();
        System.out.print("Enter account number:");
        acc_num = sc.nextLine();
        System.out.print("Enter account balance:");
        balance = Integer.parseInt(sc.nextLine());

        System.out.println();
        CheckingAccount acc2 = new CheckingAccount(acc_num, balance);
        acc2.details();
    }
}
