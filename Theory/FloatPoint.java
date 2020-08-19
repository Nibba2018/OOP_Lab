import java.io.PrintStream;

public class FloatPoint {

    public static void selectionSort(Double[] arr){
        for (int i = 0; i < 4 - 1; i++){
            int index = i;
            for (int j = i + 1; j < 4; j++){
                if (Double.compare(arr[j], arr[index]) < 0){
                    index = j;//searching for lowest index
                }
            }
            double smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String[] args){

        Double[] numbs = new Double[4];
        for(int i=0; i<4; i++)
            numbs[i] = Double.parseDouble(args[i]);

        selectionSort(numbs);

        PrintStream ps = new PrintStream(System.out);

        for(int i=0; i<4; i++)
            ps.format("%.2f ", numbs[i].doubleValue());

        ps.format("\n%.2f \n",
                  Double.sum(Double.sum(numbs[0], numbs[1]),
                             Double.sum(numbs[2], numbs[3])));
    }
}