public class UseHotelRoom {
    public static void main(String[] args) {
        HotelRoom hotel1 = new HotelRoom(100);
        HotelRoom hotel2 = new HotelRoom(500);

        Suite suite1 = new Suite(100);
        Suite suite2 = new Suite(500);

        System.out.println("Hotel Room:");
        System.out.println("Room Number:"+hotel1.getRoomNumber()+
                           " Nightly Rate:"+hotel1.getNightlyRate());

        System.out.println("Room Number:"+hotel2.getRoomNumber()+
                           " Nightly Rate:"+hotel2.getNightlyRate());

        System.out.println();

        System.out.println("Suites:");
        System.out.println("Room Number:"+suite1.getRoomNumber()+
                           " Nightly Rate:"+suite1.getNightlyRate());

        System.out.println("Room Number:"+suite2.getRoomNumber()+
                           " Nightly Rate:"+suite2.getNightlyRate());
    }
}
