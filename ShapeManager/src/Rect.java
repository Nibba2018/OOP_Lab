class Rect extends Shape{

    double height, width;

    Rect(){
        super();
        this.height = 0.0;
        this.width = 0.0;
    }

    Rect(double height, double width){
        super();
        this.height = height;
        this.width = width;
    }

    Rect(double height, double width, String color){
        super(color);
        this.height = height;
        this.width = width;
    }

    void manageShape() {
        super.manageShape(this);
    }

    @Override
    void printDescription(){
        System.out.println("Height:"+this.height);
        System.out.println("Width:"+this.width);
        System.out.println("Color:"+this.color);
        System.out.println("Area:"+this.height*this.width);
    }

}
