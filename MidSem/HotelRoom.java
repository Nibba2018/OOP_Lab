package MidSem;

public class HotelRoom {
    int room_number;
    double nightly_rate;

    HotelRoom(final int room_number) {
        this.room_number = room_number;
        if(room_number <= 299)
            this.nightly_rate = 69.95;
        else
            this.nightly_rate = 89.95;
    }

    int getRoomNumber(){
        return room_number;
    }

    double getNightlyRate(){
        return nightly_rate;
    }
}
