import java.util.Scanner;

public class ArrayMenu {
    public static void main(String[] args) {
        boolean quit = false;
        int[] arr = {0};

        Scanner sc = new Scanner(System.in);

        while(!quit){
            System.out.println("Enter choice number:");
            System.out.println("1. Initialize\n2. Insert\n3. Remove");
            System.out.print("4. Display\n5. Quit:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:{
                    arr = new int[11];
                    System.out.println("\nArray Initialised\n");
                }break;
                case 2:{
                    System.out.print("Enter position:");
                    int pos = sc.nextInt();

                    System.out.print("Enter Value:");
                    int val = sc.nextInt();

                    System.out.println();

                    if(arr[pos] == 0)
                        arr[0] += 1;
                    arr[pos] = val;
                }break;
                case 3:{
                    System.out.print("Enter position to remove:");
                    int pos = sc.nextInt();

                    int val = arr[pos];

                    for(int i = pos+1; i<11; i++)
                        arr[i-1] = arr[i];

                    System.out.println("\nRemoved Value: "+val+"\n");
                    arr[0] -= 1;
                }break;
                case 4:{
                    int len = arr[0];

                    System.out.println("\nElements in the array:");
                    for(int i=1; i<=len; i++)
                        System.out.print(arr[i]+" ");
                    System.out.println("\n");
                }break;
                case 5:{
                    System.out.println("\nExiting Application...");
                    quit = true;
                }break;
                default:
                    System.out.println("\nInvalid Choice\n");
            }
        }
    }
}