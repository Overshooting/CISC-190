import java.util.Arrays;
import java.io.IOException;

/**
 * Java Final Exam Driver for testing out Athlete and Person 
 * classes and interfaces.  
 *
 * @author Rico Cassoni, rcassoni@sdccd.edu
 * @since 4/23/2025
 * @version v1.1
 */
public class Olympics {

    public static void main(String[] args) throws IOException  {
        Athlete gameDay = new Athlete();
        gameDay.setFileNames();
        Athlete[] events = gameDay.csv2Array();
        gameDay.printArray2File(events, "***With TBDs***");
        events[0].setName("Tommy Track");
        events[2].setEventName("Javelin");
        gameDay.printArray2File(events, "\n\n***Without TBDs***");
        System.out.println("\"Have a GREAT and SAFE break\"");
    }

    // Labs/FinalExam2/athletes.csv
    // Labs/FinalExam2/finalexam2output.txt
}