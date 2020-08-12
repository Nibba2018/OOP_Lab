public class Q2 {
    public static void main(String[] args) {
        char choice = Character.toUpperCase(args[0].charAt(0));

        switch(choice){
            case 'A': System.out.println("Action Movie Fan"); break;
            case 'C': System.out.println("Comedy Movie Fan"); break;
            case 'D': System.out.println("Drama Movie Fan"); break;
            default: System.out.println("Invalid Choice");
        }
    }
}