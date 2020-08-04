import java.lang.Math;

public class Series {

    double seriesSum(Double x, int n){
        double sum = 0.0;
        for(int i=0; i<=n; i++){
            sum += Math.pow(x, i);
        }
        return sum;
    }

    public static void main(String[] args) {
        final double x = Double.parseDouble(args[0]);
        final int n = Integer.parseInt(args[1]);

        Series srs = new Series();
        System.out.println("Sum of the series:"+srs.seriesSum(x, n));
    }
}