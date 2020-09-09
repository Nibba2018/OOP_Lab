public class App {
    public static void main(String[] args) {
        Rect rectangle = new Rect(10, 20);
        Circle circle = new Circle(20, "Green");
        Square square = new Square(20, "Blue");

        rectangle.manageShape();
        System.out.println();
        circle.manageShape();
        System.out.println();
        square.manageShape();
        System.out.println();
    }
}
