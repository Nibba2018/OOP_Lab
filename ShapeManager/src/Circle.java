class Circle extends Shape{

    double radius;

    Circle(){
        super();
        this.radius = 0.0;
    }

    Circle(double radius){
        super();
        this.radius = radius;
    }

    Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }

    void manageShape(){
        super.manageShape(this);
    }

    @Override
    void printDescription(){
        System.out.println("Radius:"+this.radius);
        System.out.println("Color:"+this.color);
        System.out.println("Area:"+ (3.14*this.radius*this.radius));
    }
}
