import java.util.Scanner;

class MountainBike extends Bicycle {
    Integer seatHeight;

    public MountainBike(Integer gear, Integer speed, Integer seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        return super.toString() + " Seat Height: "+this.seatHeight;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Gear:");
        Integer gear = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Speed:");
        Integer speed = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Seat Height:");
        Integer seatHeight = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Decrement:");
        Integer decrement = Integer.parseInt(sc.nextLine());
        sc.close();

        MountainBike bike = new MountainBike(gear, speed, seatHeight);
        bike.putBrakes(decrement);
        System.out.println(bike);
    }

}