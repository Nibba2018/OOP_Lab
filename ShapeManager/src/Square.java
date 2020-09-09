class Square extends Rect{

    double side;

    Square(){
        super();
    }

    Square(double side){
        super(side, side);
        this.side = side;
    }

    Square(double side, String color){
        super(side, side, color);
        this.side = side;
    }

    void manageShape(){
        super.manageShape(this);
    }
}
