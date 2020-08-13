import java.lang.Math;

public class Amstrong {

    int numOfDigits(int n){
        int digits = 0;
        while(n!=0){
            n /= 10;
            digits++;
        }
        return digits;
    }

    boolean isAmstrong(int n){
        int digits = numOfDigits(n), digit, sum=0, n_copy = n;

        while(n!=0){
            digit = n%10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return n_copy == sum;
    }

    public static void main(final String[] args) {
        final int n = Integer.parseInt(args[0]);

        Amstrong ams = new Amstrong();
        boolean is_amstrong = ams.isAmstrong(n);
        System.out.println("Amstrong:" + is_amstrong);

    }
}
