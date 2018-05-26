package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by Michael on 10/17/2016.
 */
public class OpenFile {
    private static Scanner readFile;
    private static Scanner readLosers;
    private static Scanner readRoundOnePairings;
    private static String[] roundOnePairings = new String[64];
    private static String[] roundOneWinners = new String[32];
    private static String[] roundTwoWinners = new String[16];
    private static String[] roundThreeWinners = new String[8];
    private static String[] roundFourWinners = new String[4];
    private static String[] roundFiveWinners = new String[2];
    private static String[] roundFiveLosers = new String[2];
    private static String[] roundSixWinners = new String[1];
    private static String[] roundSevenWinners = new String[1];

    public static void openRoundOneFile()
    {

        try {
            readFile = new Scanner(new File("roundOneResults.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            AlertBox.errorBox("File could not be found","File Not Found",500,200);
        }//END TRY CATCH

        int index = 0;
        while(readFile.hasNext())
        {
            roundOneWinners[index] = readFile.nextLine();
            index++;
        }

    }//END OPEN ROUND ONE FILE

    public static void openRoundOnePairings()
    {
        try
        {
            readRoundOnePairings = new Scanner( new File("RoundOnePairings.txt"));
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
            AlertBox.errorBox("File could not be found","File not found",500, 200);
        }//END TRY CATCH

        int index = 0;
        while(readRoundOnePairings.hasNext())
        {
            roundOnePairings[index] = readRoundOnePairings.nextLine();
            index ++;
        }

        readRoundOnePairings.close();
    }//END OPEN ROUND ONE PAIRINGS

    public static String[] getRoundOnePairings()
    {
        return roundOnePairings;
    }//END GET ROUND ONE PAIRINGS

    public static void closeRoundOneFile()
    {
        readFile.close();
    }//END CLOSE ROUND ONE FILE

    public static String[] getRoundOneWinners()
    {
        return roundOneWinners;
    }//END GET ROUND ONE WINNERS

    public static void setRoundOneWinners(String winner, int index)
    {
        roundOneWinners[index] = winner;
    }//END SET ROUND ONE WINNERS

    //...........................................END OF ROUND ONE FILE FUNCTIONS

    public static void openRoundTwoFile()
    {

        try {
            readFile = new Scanner(new File("roundTwoResults.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            AlertBox.errorBox("File could not be found","File Not Found",500,200);
        }//END TRY CATCH

        int index = 0;
        while(readFile.hasNext())
        {
            roundTwoWinners[index] = readFile.nextLine();
            index++;
        }

    }//END OPEN ROUND TWO FILE

    public static void closeRoundTwoFile()
    {
        readFile.close();
    }//END CLOSE ROUND TWO FILE

    public static String[] getRoundTwoWinners()
    {
        return roundTwoWinners;
    }//END GET ROUND TWO WINNERS

    public static void setRoundTwoWinners(String winner, int index)
    {
        roundTwoWinners[index] = winner;
    }//END SET ROUND TWO WINNERS

    //...........................................END OF ROUND TWO FILE FUNCTIONS

    public static void openRoundThreeFile()
    {

        try {
            readFile = new Scanner(new File("roundThreeResults.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            AlertBox.errorBox("File could not be found","File Not Found",500,200);
        }//END TRY CATCH

        int index = 0;
        while(readFile.hasNext())
        {
            roundThreeWinners[index] = readFile.nextLine();
            index++;
        }

    }//END OPEN ROUND TWO FILE

    public static void closeRoundThreeFile()
    {
        readFile.close();
    }//END CLOSE ROUND THREE FILE

    public static String[] getRoundThreeWinners()
    {
        return roundThreeWinners;
    }//END GET ROUND THREE WINNERS

    public static void setRoundThreeWinners(String winner, int index)
    {
        roundThreeWinners[index] = winner;
    }//END SET ROUND THREE WINNERS

    //...........................................END OF ROUND THREE FILE FUNCTIONS

    public static void openRoundFourFile()
    {

        try {
            readFile = new Scanner(new File("roundFourResults.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            AlertBox.errorBox("File could not be found","File Not Found",500,200);
        }//END TRY CATCH

        int index = 0;
        while(readFile.hasNext())
        {
            roundFourWinners[index] = readFile.nextLine();
            index++;
        }

    }//END OPEN ROUND FOUR FILE

    public static void closeRoundFourFile()
    {
        readFile.close();
    }//END CLOSE ROUND FOUR FILE

    public static String[] getRoundFourWinners()
    {
        return roundFourWinners;
    }//END GET ROUND FOUR WINNERS

    public static void setRoundFourWinners(String winner, int index)
    {
        roundFourWinners[index] = winner;
    }//END SET ROUND FOUR WINNERS

    //...........................................END OF ROUND FOUR FILE FUNCTIONS

    public static void openRoundFiveFile()
    {

        try {
            readFile = new Scanner(new File("roundFiveResults.txt"));
            readLosers = new Scanner(new File("roundFiveLosers.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            AlertBox.errorBox("File could not be found","File Not Found",500,200);
        }//END TRY CATCH

        int index = 0;
        while(readFile.hasNext())
        {
            roundFiveWinners[index] = readFile.nextLine();
            roundFiveLosers[index] = readLosers.nextLine();
            index++;
        }

    }//END OPEN ROUND FIVE FILE

    public static void closeRoundFiveFile()
    {
        readFile.close();
        readLosers.close();
    }//END CLOSE ROUND FIVE FILE

    public static String[] getRoundFiveWinners()
    {
        return roundFiveWinners;
    }//END GET ROUND FIVE WINNERS

    public static String[] getRoundFiveLosers()
    {
        return roundFiveLosers;
    }//END GET ROUND FIVE LOSERS

    public static void setRoundFiveWinners(String winner, int index)
    {
        roundFiveWinners[index] = winner;
    }//END SET ROUND FIVE WINNERS

    public static void setRoundFiveLosers(String loser, int index)
    {
        roundFiveLosers[index] = loser;
    }//END SET ROUND FIVE LOSERS

    //...........................................END OF ROUND FIVE FILE FUNCTIONS

    public static void openRoundSixFile()
    {

        try {
            readFile = new Scanner(new File("roundSixResults.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            AlertBox.errorBox("File could not be found","File Not Found",500,200);
        }//END TRY CATCH

        int index = 0;
        while(readFile.hasNext())
        {
            roundSixWinners[index] = readFile.nextLine();
            index++;
        }

    }//END OPEN ROUND SIX FILE

    public static void closeRoundSixFile()
    {
        readFile.close();
    }//END CLOSE ROUND SIX FILE

    public static String[] getRoundSixWinners()
    {
        return roundSixWinners;
    }//END GET ROUND SIX WINNERS

    public static void setRoundSixWinners(String winner, int index)
    {
        roundSixWinners[index] = winner;
    }//END SET ROUND SIX WINNERS

    //...........................................END OF ROUND SIX FILE FUNCTIONS

    public static void openRoundSevenFile()
    {

        try {
            readFile = new Scanner(new File("roundSevenResults.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            AlertBox.errorBox("File could not be found","File Not Found",500,200);
        }//END TRY CATCH

        int index = 0;
        while(readFile.hasNext())
        {
            roundSevenWinners[index] = readFile.nextLine();
            index++;
        }

    }//END OPEN ROUND SEVEN FILE

    public static void closeRoundSevenFile()
    {
        readFile.close();
    }//END CLOSE ROUND SEVEN FILE

    public static String[] getRoundSevenWinners()
    {
        return roundSevenWinners;
    }//END GET ROUND SEVEN WINNERS

    public static void setRoundSevenWinners(String winner, int index)
    {
        roundSevenWinners[index] = winner;
    }//END SET ROUND SEVEN WINNERS

    //...........................................END OF ROUND SEVEN FILE FUNCTIONS

}//END CLASS FILE MANAGEMENT
