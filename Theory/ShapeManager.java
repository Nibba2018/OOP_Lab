public class ShapeManager{
    public static void main(String[] args) {
        Rect rectangle = new Rect(10, 20);
        Circle circle = new Circle(20);
        Square square = new Square(20);

        rectangle.manageShape();
        circle.manageShape();
        square.manageShape();
    }
}

class Shape{
    double param1, param2;
    Shape(){
        this.param1 = 0.0;
        this.param2 = 0.0;
    }

    Shape(double param1){
        this.param1 = param1;
        this.param2 = 0.0;
    }

    Shape(double param1, double param2){
        this.param1 = param1;
        this.param2 = param2;
    }

    void manageShape(Shape myShape){
        myShape.printDescription();
    }

    void printDescription(){
        System.out.println("Prints description of shapes");
    }

}

class Rect extends Shape{

    Rect(){super();}
    Rect(double param1, double param2){super(param1, param2);}

    void manageShape() {
        super.manageShape(this);
    }

    @Override
    void printDescription(){
        System.out.println("Height:"+this.param1);
        System.out.println("Width:"+this.param2);
        System.out.println("Area:"+this.param1*this.param2);
    }

}

class Circle extends Shape{
    Circle(){super();}
    Circle(double param1){super(param1);}

    void manageShape(){
        super.manageShape(this);
    }

    @Override
    void printDescription(){
        System.out.println("Radius:"+this.param1);
        System.out.println("Area:"+ (3.14*this.param1*this.param1));
    }
}

class Square extends Shape{
    Square(){super();}
    Square(double param1){super(param1);}

    void manageShape(){
        super.manageShape(this);
    }

    @Override
    void printDescription(){
        System.out.println("Side:"+this.param1);
        System.out.println("Area:"+this.param1*this.param1);
    }
}