public class Q1 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        if(x>=0 && y>=0)
            System.out.println("Quadrant 1");
        else if(x<0 && y>=0)
            System.out.println("Quadrant 2");
        else if(x<0 && y<0)
            System.out.println("Quadrant 3");
        else
            System.out.println("Quadrant 4");
    }
}