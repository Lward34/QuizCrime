import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;


public class USCrime {

    // Grabbing the standard scanner.
    private static final Scanner input = new Scanner(System.in);

    // This global ArrayList will store all our USCrimeClass objects.
    private static ArrayList<USCrimeClass> csvList;
    private static Object data;

    /**
     * This method will display the options available to the user.
     */
    public static void displayMenu() {
        System.out.println("Enter the number of the question you want answered. ");
        System.out.println("Enter ‘Q’ to quit the program :");
        System.out.println("1. What were the percentages in population growth");
        System.out.println("   for each consecutive year from 1994 – 2013?");
        System.out.println("2. What year was the Murder rate the highest?");
        System.out.println("3. What year was the Murder rate the lowest?");
        System.out.println("4. What year was the Robbery rate the highest?");
        System.out.println("5. What year was the Robbery rate the lowest?");
        System.out.println("6. What was the total percentage change in Motor Vehicle \"");
        System.out.println("   Theft between 1998 and 2012?");
        System.out.println("7. What was the total percentage change in property crimes ");
        System.out.println("   between 2011 and 2013?");
        System.out.println("8. What was the total percentage change in murder crimes");
        System.out.println("   between 2012 and 2013?");
        System.out.println("Q. Quit the program\"");
    }

 
     // function returns the highest murder rate for a year
     int year = -1;
        float currRate = -1;
        for (int i = 0; i < csvList.size(); i++) {
            if (csvList.get(i).getMurderRates() > currRate) {
                currRate = csvList.get(i).getMurderRates();
                year = csvList.get(i).getYear();
            }
        }
        return year;    

    private static class i<T0, T1> {

        public i() {
        }
    }
}



    // function returns the lowest murder rate for a year
     
    static int yearWithLowestMurderRate() {
        int year = -1;
        float currRate = 999999; // A high number test is used.
        for (int i = 0; i < csvList.size(); i++) {
            if (csvList.get(i).getMurderRates() < currRate) {
                currRate = csvList.get(i).getMurderRates();
                year = csvList.get(i).getYear();
            }
        }
        return year;
    }

    // function returns year with highest robbery rate
     
    static int yearWithHighestRobberyRate() {
       int year = -1;
        float currRate = -1; // A insanely low number is used to test.
        for (int i = 0; i < csvList.size(); i++) {
            if (csvList.get(i).getRobberyRate()> currRate) {
                currRate = csvList.get(i).getRobberyRate();
                year = csvList.get(i).getYear();
            }
        }
        return year;
    }

    //function returns year with lowest robbery rate
     
    static int yearWithLowestMRobberyRate() {
        int year = -1;
        float currRate = 999999; // A insanely high number is used to test.
        for (int i = 0; i < csvList.size(); i++) {
            if (csvList.get(i).getRobberyRate() < currRate) {
                currRate = csvList.get(i).getRobberyRate();
                year = csvList.get(i).getYear();
            }
        }
        return year;
    }

    private float getMurderRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getYear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    
