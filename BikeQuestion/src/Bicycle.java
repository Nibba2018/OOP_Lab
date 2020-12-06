public class Bicycle {
    Integer gear, speed;

    public Bicycle(Integer gear, Integer speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void putBrakes(int decrement){
        this.speed -= decrement;
    }

    public String toString(){
        return "Gear: "+this.gear+" Speed: "+this.speed;
    }
}
