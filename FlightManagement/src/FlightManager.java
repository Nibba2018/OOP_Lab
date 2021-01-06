import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class FlightManager{

    Flight readLine(String line){
        String[] dataEntries = line.split("\\|");
        String[] timings = dataEntries[3].split("/");
        return new Flight(dataEntries[1], dataEntries[2], dataEntries[0],
                          timings[0], timings[1]);
    }

    String writeLine(Flight flight){
        String timings = String.join("/", flight.depTime, flight.arrTime);
        return String.join("|", flight.depCity, flight.daysOfWeek,
                           flight.flightNum, timings);
    }

    ArrayList<Flight> sortFlight(ArrayList<Flight> flightList){
        Collections.sort(flightList);
        return flightList;
    }

    public static void main(String[] args) throws Exception {
        FlightManager flManager = new FlightManager();
        ArrayList<Flight> flights = new ArrayList<Flight>();
        try {
            FileReader reader = new FileReader("2015.silkair.csv");
            BufferedReader bufReader = new BufferedReader(reader);

            for(int i=0; i<3; i++)
                bufReader.readLine();

            String line = bufReader.readLine();
            while(line != null){
                System.out.println(line);
                flights.add(flManager.readLine(line));
                line = bufReader.readLine();
            }
            bufReader.close();

            flManager.sortFlight(flights);

            FileWriter writer = new FileWriter("sorted.silkair.csv");
            for(Flight flight : flights){
                writer.write(flManager.writeLine(flight)+"\n");
            }
            writer.close();

        } catch (FileNotFoundException e) {
            System.err.println("Unable to find requested file.");
        } catch (IOException e){
            System.err.println("Unable to perform IO operations.");
        }
    }
}
