package examsolutions;
import java.util.Comparator;

//Jocelynne Gonzales
public class CTATrain implements Comparable <CTATrain>{
    public static final Comparator<CTATrain> BY_STATION = new ByStation();
	public static final Comparator<CTATrain> BY_ARRIVAL_TIME = new ByArrivalTime();
    private final int runNumber;
    private final String lineColor;
    private final String nextStation;
    private final String arrivalTime;

    public CTATrain(
    		int runNumber, 
    		String lineColor, 
    		String nextStation, 
    		String arrivalTime){
        this.runNumber = runNumber;
        this.lineColor = lineColor;
        this.nextStation = nextStation;
        this.arrivalTime = arrivalTime;
      
    }

	public int runNumber(){
		return runNumber;
    }
    
    public String lineColor(){
		return lineColor;

    }
    public String nextStation(){
    	return nextStation;
    }
    public String arrivalTime(){
    	return arrivalTime;
    }
  
   
	public String toString(){
		return "[" + this.lineColor + ", " + this.runNumber + ", " + this.nextStation + ", " + this.arrivalTime + "]";
	}
	

    private static class ByStation implements Comparator<CTATrain> {
        public int compare(CTATrain a, CTATrain b) {
            return a.nextStation.compareTo(b.nextStation);
        	}
        }

    private static class ByArrivalTime implements Comparator<CTATrain> {
        public int compare(CTATrain a, CTATrain b) {
        	return a.arrivalTime.compareTo(b.arrivalTime);
        	}
}

	public int compareTo(CTATrain that){
        if (this.runNumber < that.runNumber) return -1;
        if (this.runNumber > that.runNumber) return +1;
        return 0;
        }
	}

