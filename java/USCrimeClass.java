
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;


class USCrimeClass {

    private static Object input;
 static void displayPercentagePopulationGrowth(USCrimeClass[] data) {
        float growth;
        for (int i = 0; i < data.length - 1; i++) {
            growth = 100 * (float) (data[i + 1].getPopulation() - data[i].getPopulation()) / data[i].getPopulation();
            System.out.println("[" + data[i].getYear() + "-" + data[i + 1].getYear() + "]: " + String.format("%.4f", growth) + "%");
        }
    }

   
    public static String getUserInput() {
        String choice;
        System.out.println("Enter your selection: ");
        choice = input.next();
        return choice;
    }

    public static void inputManager(Map<Integer, USCrimeClass> map) {
        String choice = null;
        while (choice.toLowerCase() != "q") {

            // Displays the possible inputs.
            displayMenu();

            // This calls on the private method to grab users choice.
            choice = getUserInput();
            System.out.println();


    static ArrayList<Object> readFile(String filename) {
     // Makes sure the map is empty before adding objects.
     ArrayList<Object> csvList = new ArrayList<>();

        // This string represents a csv row including delimiters.
        String line;

        try {
            // Initialize a file reader to read the file.
            Scanner fileReader = new Scanner(new FileInputStream(
                    new File(filename)));

            // Skip headers
            fileReader.nextLine();

            /* This loop will continue until it reaches a blank row. 
               It will then add the record to the map.
             */
            while (fileReader.hasNextLine()) {
                line = fileReader.nextLine();

                USCrimeClass record = new USCrimeClass(line);
                csvList.add(record);
            }
        } catch (FileNotFoundException e) {
            // Catches file not found exception.
            System.out.println(e);
        }
        return csvList;
    }

    //This is used forJUNIT testing to make sure the program stored necessary number of map objects.
  
    public static int getSize() {
        return csvList.size();
    }

    public static void main(String[] args) {
        System.out.println("********** Welcome to the US Crime Statistical "
                + "Application **************************" + "\n");

        if (args.length != 1) {
            System.out.println("Usage: \"java UserCrimeStatsApp Crime.csv");
            return;
        }

        // Grabs the crime list.
        ArrayList<Object> crimeList = readFile(args[0]);
        System.out.println("Size is " + getSize());
        System.out.println(crimeList);
        System.out.println("The Year with max murder rate is " + yearWithLowestRobberyRate());
        
    }

    private static void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String yearWithLowestRobberyRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private USCrimeClass(String line) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private float getPopulation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getYear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    float getMurderRates() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
 
