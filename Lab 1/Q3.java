public class Q3 {
    public static void main(final String[] args) {
        final int salary = Integer.parseInt(args[0]);
        final int merit = Integer.parseInt(args[1]);

        if(salary>=700 && salary<=799){
            if(merit<20)
                System.out.println("Grade B");
            else
                System.out.println("Grade A");
        }
        else if(salary>799 && salary<=899)
            System.out.println("Grade A");
        else if(salary>=600 && salary<=649){
            if(merit<10)
                System.out.println("Grade C");
            else
                System.out.println("Grade B");
        }
        else if(salary>600 && salary<700)
            System.out.println("Grade B");
        else
            System.out.println("Grade C");
    }
}