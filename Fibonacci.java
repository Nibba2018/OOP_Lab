public class Fibonacci {

    void printSeries(int n){
        int first = 0, second = 1, next;

        for(int i=0; i<n; i++){
            if(i<=1)
                next = i;
            else{
                next = first + second;
                first = second;
                second = next;
            }
            System.out.print(next+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        final int n = Integer.parseInt(args[0]);

        Fibonacci fibo = new Fibonacci();
        System.out.println("Fibonacci series for first "+
                           n+" terms:");
        fibo.printSeries(n);
    }
}