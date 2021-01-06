public class Flight implements Comparable<Flight>{
    String daysOfWeek;
    String flightNum;
    String depCity;
    String depTime;
    String arrTime;

    public Flight(String daysOfWeek, String flightNum, String depCity, String depTime, String arrTime) {
        this.daysOfWeek = daysOfWeek;
        this.flightNum = flightNum;
        this.depCity = depCity;
        this.depTime = depTime;
        this.arrTime = arrTime;
    }

    @Override
    public int compareTo(Flight flight){
        return this.flightNum.compareTo(flight.flightNum);
    }

    public boolean save() {
        return true;
    }
}