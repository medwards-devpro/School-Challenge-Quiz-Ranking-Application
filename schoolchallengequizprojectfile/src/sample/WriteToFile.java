package sample;

import java.io.FileNotFoundException;
import java.util.Formatter;

/**
 * Created by Michael on 10/22/2016.
 */
public class WriteToFile {
    private static Formatter writeToFile;
    private static Formatter writeRoundOneTeams;
    private static Formatter writeRound5Losers;

    public static void writeToRoundOneFile(String[] winners)
    {
        try {
            writeToFile = new Formatter("roundOneResults.txt");

            for (String s : winners)
            {
                writeToFile.format("%s\n",s);
            }
        }
        catch(FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
            AlertBox.errorBox("File could not be found nor created","File Lookup/Creation Error", 500, 200);
        }
        catch(NullPointerException nullPointerException)
        {
            AlertBox.errorBox("An empty string was attempted to store to file","Null Pointer Exception",500,200);
        }//END TRY CATCH

    }//END WRITE TO ROUND ONE FILE

    public static void writeToRoundTwoFile(String[] winners)
    {
        try {
            writeToFile = new Formatter("roundTwoResults.txt");

            for (String s : winners)
            {
                writeToFile.format("%s\n",s);
            }
        }
        catch(FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
            AlertBox.errorBox("File could not be found nor created","File Lookup/Creation Error", 500, 200);
        }
        catch(NullPointerException nullPointerException)
        {
            AlertBox.errorBox("An empty string was attempted to store to file","Null Pointer Exception",500,200);
        }//END TRY CATCH

    }//END WRITE TO ROUND TWO FILE

    public static void writeToRoundOnePairings(String[] teams)
    {
        try {
            writeRoundOneTeams = new Formatter("RoundOnePairings.txt");

            for (String s : teams)
            {
                writeRoundOneTeams.format("%s\n",s);
            }
        }
        catch(FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
            AlertBox.errorBox("File could not be found nor created","File Lookup/Creation Error", 500, 200);
        }
        catch(NullPointerException nullPointerException)
        {
            AlertBox.errorBox("An empty string was attempted to store to file","Null Pointer Exception",500,200);
        }//END TRY CATCH

        writeRoundOneTeams.close();
    }//END WRITE TO ROUND ONE PAIRINGS

    public static void writeToRoundThreeFile(String[] winners)
    {
        try {
            writeToFile = new Formatter("roundThreeResults.txt");

            for (String s : winners)
            {
                writeToFile.format("%s\n",s);
            }
        }
        catch(FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
            AlertBox.errorBox("File could not be found nor created","File Lookup/Creation Error", 500, 200);
        }
        catch(NullPointerException nullPointerException)
        {
            AlertBox.errorBox("An empty string was attempted to store to file","Null Pointer Exception",500,200);
        }//END TRY CATCH

    }//END WRITE TO ROUND THREE FILE

    public static void writeToRoundFourFile(String[] winners)
    {
        try {
            writeToFile = new Formatter("roundFourResults.txt");

            for (String s : winners)
            {
                writeToFile.format("%s\n",s);
            }
        }
        catch(FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
            AlertBox.errorBox("File could not be found nor created","File Lookup/Creation Error", 500, 200);
        }
        catch(NullPointerException nullPointerException)
        {
            AlertBox.errorBox("An empty string was attempted to store to file","Null Pointer Exception",500,200);
        }//END TRY CATCH

    }//END WRITE TO ROUND FOUR FILE

    public static void writeToRoundFiveFile(String[] winners, String[] losers)
    {
        try {
            writeToFile = new Formatter("roundFiveResults.txt");
            writeRound5Losers = new Formatter("roundFiveLosers.txt");

            for (String s : winners)
            {
                writeToFile.format("%s\n",s);
            }

            for (String l : losers)
            {
                writeRound5Losers.format("%s\n", l);
            }
        }
        catch(FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
            AlertBox.errorBox("File could not be found nor created","File Lookup/Creation Error", 500, 200);
        }
        catch(NullPointerException nullPointerException)
        {
            AlertBox.errorBox("An empty string was attempted to store to file","Null Pointer Exception",500,200);
        }//END TRY CATCH

    }//END WRITE TO ROUND FIVE FILE

    public static void writeToRoundSixFile(String[] winners)
    {
        try {
            writeToFile = new Formatter("roundSixResults.txt");

            for (String s : winners)
            {
                writeToFile.format("%s\n",s);
            }
        }
        catch(FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
            AlertBox.errorBox("File could not be found nor created","File Lookup/Creation Error", 500, 200);
        }
        catch(NullPointerException nullPointerException)
        {
            AlertBox.errorBox("An empty string was attempted to store to file","Null Pointer Exception",500,200);
        }//END TRY CATCH

    }//END WRITE TO ROUND SIX FILE

    public static void writeToRoundSevenFile(String[] winners)
    {
        try {
            writeToFile = new Formatter("roundSevenResults.txt");

            for (String s : winners)
            {
                writeToFile.format("%s\n",s);
            }
        }
        catch(FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
            AlertBox.errorBox("File could not be found nor created","File Lookup/Creation Error", 500, 200);
        }
        catch(NullPointerException nullPointerException)
        {
            AlertBox.errorBox("An empty string was attempted to store to file","Null Pointer Exception",500,200);
        }//END TRY CATCH

    }//END WRITE TO ROUND Seven FILE

    public static void closeFile()
    {
        writeToFile.close();
    }

    public static void closeRound5LoserFile()
    {
        writeRound5Losers.close();
    }

    public static void resetMatchFixtures()
    {
        String[] resetRound1Pairings = new String[64];
        String[] resetRound1Winners = new String[32];
        String[] resetRound2Winners = new String[16];
        String[] resetRound3Winners = new String[8];
        String[] resetRound4Winners = new String[4];
        String[] resetRound5Results = new String[2];
        String[] resetRound6Winners = new String[1];
        String[] resetRound7Winners = new String[1];

        for(int i = 0; i < 64; i++)
        {
            resetRound1Pairings[i] = "1";
        }
        for(int i = 0; i < 32; i++)
        {
            resetRound1Winners[i] = "1";
        }
        for(int i = 0; i < 16; i++)
        {
            resetRound2Winners[i] = "1";
        }
        for(int i = 0; i < 8; i++)
        {
            resetRound3Winners[i] = "1";
        }
        for(int i = 0; i < 4; i++)
        {
            resetRound4Winners[i] = "1";
        }
        for(int i = 0; i < 2; i++)
        {
            resetRound5Results[i] = "1";
        }
        for(int i = 0; i < 1; i++)
        {
            resetRound6Winners[i] = "1";
        }
        for(int i = 0; i < 1; i++)
        {
            resetRound7Winners[i] = "1";
        }

        writeToRoundOnePairings(resetRound1Pairings);

        writeToRoundOneFile(resetRound1Winners);
        closeFile();

        writeToRoundTwoFile(resetRound2Winners);
        closeFile();

        writeToRoundThreeFile(resetRound3Winners);
        closeFile();

        writeToRoundFourFile(resetRound4Winners);
        closeFile();

        writeToRoundFiveFile(resetRound5Results,resetRound5Results);
        closeFile();
        closeRound5LoserFile();

        writeToRoundSixFile(resetRound6Winners);
        closeFile();

        writeToRoundSevenFile(resetRound7Winners);
        closeFile();

        AlertBox.informationBox("Match fixtures have been reset. Please restart application for changes to take effect.",
                "Reset Match Fixtures Completed", 500, 200);

    }//END RESET MATCH FIXTURES

}//END WRITE TO FILE
