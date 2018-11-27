import java.util.Scanner;

public class RunAnalyzer{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("How many weeks of running data do you have?");
        int weeks = scnr.nextInt();
        //  analyze the data from the run
        addRunData(weeks);
    }

//determines weekly average change
    public static double calculateAverageChange(double[] dataChange){
        double newData=0;
        double diff = 0;
        for(int i=0;i <dataChange.length;i++){
            diff += dataChange[i];
            newData=((diff/dataChange.length));

        }
        return newData;
            //  the output
    }

    public static void addRunData(int weeks){
        //  array with the length of the amount of weeks(used double in case of 2.5 weeks of running instead of full week )

        double[] runData1 = new double[weeks];

        // Loops  each week getting the mileage and setting the right data in runData array
        double sum =0;
        for(int i = 0; i < weeks; i++){
            System.out.println("Enter miles run for week " + (i + 1) + ":");
            Scanner scnr = new Scanner(System.in);
            runData1[i] = scnr.nextDouble();
        }
        analyzeRunData(runData1);
    }

    // Analyzes the runData array
    public static void analyzeRunData(double[] runData){
        boolean isConsistentlyIncreasing = true;
        double totalMiles = 0;
        double previousData = 0;

        // Loop through the runData array and check if the mileage was the same or less than last week
        for(int i = 0; i < runData.length; i++){
            totalMiles += runData[i];


            if(runData[i] <= previousData){
                isConsistentlyIncreasing = false;
            }

            // For the following weeks data
            previousData = runData[i];
        }
        System.out.println("Your weekly mileage is" + (isConsistentlyIncreasing ? " " : " NOT ") + "consistently increasing");
        System.out.println("Average weekly mileage: " + (double)(totalMiles/runData.length));
    }

}
