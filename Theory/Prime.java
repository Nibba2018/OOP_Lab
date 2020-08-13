public class Prime {

    boolean isPrime(int n){
        for(int i=2; i<=n/2; i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }

    void printPrimes(int lowerLimit, int upperLimit){
        for(int i=lowerLimit; i<=upperLimit; i++)
            if(isPrime(i))
                System.out.print(i+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        final int lowerLimit = Integer.parseInt(args[0]);
        final int upperLimit = Integer.parseInt(args[1]);

        Prime prime = new Prime();
        System.out.println("Prime numbers between "+
                           lowerLimit+" and "+upperLimit+" are:");
        prime.printPrimes(lowerLimit, upperLimit);

    }
}