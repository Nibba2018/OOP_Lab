public class Suite extends HotelRoom{
    Suite(final int room_number) {
        super(room_number);
        if(this.room_number <= 299)
            this.nightly_rate += 40;
        else
            this.nightly_rate += 0.15*this.nightly_rate + 40;
    }
}
