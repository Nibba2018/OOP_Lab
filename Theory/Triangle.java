import java.util.Scanner;

public class Triangle {

    int base, height;

    public Triangle(){
        base=0;
        height=0;
    }

    public Triangle(int base, int height){
        if(base <= 0 || height <= 0)
            System.out.println("Error - Base or height cannot be negetive"+
                               " or zero.");

        this.base = base;
        this.height = height;
    }

    double getArea(){
        return 0.5*base*height;
    }

    void show(){
        System.out.println("Base:"+base+
                           "\nHeight:"+height+
                           "\nArea:"+this.getArea());
    }

    static void compare(Triangle t1, Triangle t2){
        if(Double.compare(t1.getArea(), t2.getArea()) < 0)
            System.out.println("t2 is larger");
        else if(Double.compare(t1.getArea(), t2.getArea()) > 0)
            System.out.println("t1 is larger");
        else
            System.out.println("t1 and t2 are equal");
    }

    public static void main(String[] args) {
        boolean quit = false;

        Scanner sc = new Scanner(System.in);

        while(!quit){
            System.out.println("Enter choice:");
            System.out.print("1. Area\n2. Compare\n3. Quit:");
            int choice = sc.nextInt();
            switch(choice){
                case 1:{
                    System.out.print("Enter base:");
                    int base = sc.nextInt();
                    System.out.print("Enter height:");
                    int height = sc.nextInt();

                    Triangle t = new Triangle(base, height);

                    System.out.println("Area:"+t.getArea());
                }break;
                case 2:{
                    System.out.print("Enter base of 1st triangle:");
                    int base1 = sc.nextInt();
                    System.out.print("Enter height of 1st triangle:");
                    int height1 = sc.nextInt();

                    Triangle t1 = new Triangle(base1, height1);

                    System.out.print("Enter base of 2nd triangle:");
                    int base2 = sc.nextInt();
                    System.out.print("Enter height of 2nd triangle:");
                    int height2 = sc.nextInt();

                    Triangle t2 = new Triangle(base2, height2);

                    Triangle.compare(t1, t2);
                }break;
                case 3:{
                    System.out.println("Exiting...");
                    quit = true;
                }break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}