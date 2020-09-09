public class Shape{

    String color;
    Shape(){
        this.color = "Red";
    }

    Shape(String color){
        this.color = color;
    }

    void manageShape(Shape myShape){
        myShape.printDescription();
    }

    void printDescription(){
        System.out.println("Prints description of shapes");
    }

}
