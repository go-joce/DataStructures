package examsolutions;
//Jocelynne Gonzales
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import examsolutions.CTATrain;
import stdlib.In;
import stdlib.StdIn;
import stdlib.StdOut;

public class PrintCTATrains {
	public static void main(String[] args) {

        StdIn.fromFile ("CTAdata.txt");

        ArrayList<CTATrain> arrayToSort = new ArrayList<CTATrain>();

        while (StdIn.hasNextLine()){
            String line = StdIn.readLine();
            String[] fields = line.split("\\s+");
            int runNumber= Integer.parseInt(fields[0]);
            String color= fields[1];
            String station=fields[2];
            String arrivalTime = fields[3];
            CTATrain train = new CTATrain(runNumber, color, station, arrivalTime);
            arrayToSort.add(train);
    }

		Collections.sort(arrayToSort);
		StdOut.println("\nSorted by run number:");
		for(CTATrain item:arrayToSort){
			StdOut.println(item);
}

		StdOut.println("\nSorted by next station:");
        Collections.sort(arrayToSort, CTATrain.BY_STATION);

        for(CTATrain item:arrayToSort){
            StdOut.println(item);
        }

		StdOut.println("\nSorted by arrival time:");
        Collections.sort(arrayToSort, CTATrain.BY_ARRIVAL_TIME);

        for(CTATrain item:arrayToSort){
            StdOut.println(item);
        }
    }
}




