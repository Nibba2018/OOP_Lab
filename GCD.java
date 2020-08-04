public class GCD {

    int calculate(int num1, int num2){
        if(num2 != 0)
            return calculate(num2, num1 % num2);
        else
            return num1;
    }

    public static void main(String[] args) {
        final int num1 = Integer.parseInt(args[0]);
        final int num2 = Integer.parseInt(args[1]);

        GCD gcd = new GCD();
        System.out.println("GCD of "+num1+" and "+num2+" is:"+
                           gcd.calculate(num1, num2));
    }
}