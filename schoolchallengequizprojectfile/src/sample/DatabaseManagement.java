package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

import javax.swing.*;
import java.sql.*;

/**
 * Created by Michael Edwards (Intern) on 12/29/2016.
 */
public class DatabaseManagement {

    private static final String URL = "jdbc:mysql://localhost/schoolchallengequiz";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Root@password";

    private static ObservableList<TeamRank> teamList = FXCollections.observableArrayList();
    private static ObservableList<SchoolData> schoolList = FXCollections.observableArrayList();

    public static int pointSelectQuery(String teamName)
    {
        int points = 0;

            Connection connection = null;
            Statement statement = null;
            ResultSet resultset = null;

            try {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                statement = connection.createStatement();
                resultset = statement.executeQuery("SELECT NewPoints FROM School WHERE SchoolName = \"" + teamName + "\"");

            } catch (SQLException e) {
                e.printStackTrace();
                AlertBox.errorBox("An error occurred when trying to retrieve data from the database", "Query error", 500, 100);
            }//END TRY CATCH

            try {
                if (resultset.next()) {
                    points = resultset.getInt(1);
                }

                connection.close();
                statement.close();
                resultset.close();

            } catch (SQLException e) {
                e.printStackTrace();
                AlertBox.errorBox("An error occurred when trying to close the database", "Connection Error", 500, 100);
                System.exit(0);
            }//END TRY CATCH

        return points;
    }//END POINT SELECT QUERY

    public static int rankSelectQuery(String teamName)
    {
        int rank = 0;
        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;

            try {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                statement = connection.createStatement();
                resultset = statement.executeQuery("SELECT Rank FROM Ranking WHERE SchoolID = (SELECT SchoolID FROM School WHERE SchoolName = \"" + teamName + "\")");

            } catch (SQLException e) {
                e.printStackTrace();
                AlertBox.errorBox("An error occurred when trying to retrieve data from the database", "Query Error", 500, 100);
            }//END TRY CATCH

            try {
                if (resultset.next())
                    rank = resultset.getInt(1);

                connection.close();
                statement.close();
                resultset.close();

            } catch (SQLException e) {
                e.printStackTrace();
                AlertBox.errorBox("An error occurred when trying to close the database", "Connection Error", 500, 100);
                System.exit(0);
            }//END TRY CATCH
        return rank;
    }//END RANK SELECT QUERY

    public static void pointUpdateQuery(String teamName, int teamPoints)
    {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            statement.executeUpdate("UPDATE School SET NewPoints = "+teamPoints+" WHERE SchoolName = \"" +teamName+"\"");

        } catch (SQLException e) {
            e.printStackTrace();
            AlertBox.errorBox("An error occurred when updating the database","Query Error",500,100);
        }//END TRY CATCH

        try {
            connection.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            AlertBox.errorBox("The operation performed successfully but an error occurred when trying to close the database","Connection Error",500,100);
            System.exit(0);
        }//END TRY CATCH

    }//END POINT UPDATE QUERY

    public static boolean addSchool(String teamName)
    {
        boolean status = true;
        Connection conn = null;
        Statement statement = null;

        try {
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement = conn.createStatement();
            statement.executeUpdate("INSERT INTO School(SchoolName) Values('"+teamName+"')");
            AlertBox.informationBox(teamName+" was inserted into the database","Insert Notification",500,100);
        } catch (SQLException e) {
            e.printStackTrace();
            AlertBox.errorBox("An error occurred when storing "+teamName+" to database","Insert Error",500,100);
            status = false;
        }

        try {
            conn.close();
            statement.close();
        } catch (SQLException e) {
            AlertBox.errorBox("An error occurred when trying to close the database","Connection Error",500,100);
            System.exit(0);
        }
        return status;

    }//END ADD SCHOOL

    public static boolean deleteSchool(int teamID, String teamName)
    {
        boolean status = true;
        Connection conn = null;
        Statement statement = null;

        try {
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement = conn.createStatement();
            statement.executeUpdate("DELETE FROM School WHERE SchoolID = '"+teamID+"'");
            AlertBox.informationBox(teamName+" was deleted from database","Delete Notification",500,100);

        } catch (SQLException e) {
            e.printStackTrace();
            AlertBox.errorBox("An error occurred when deleting "+teamName+" from database","Query Error",500,100);
            status = false;
        }

        try {
            conn.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            AlertBox.errorBox("An error occurred when closing the database","Connection Error",500,100);
            System.exit(0);
        }
        return status;
    }//END DELETE SCHOOL

    public static boolean updateSchool(int id,String newName)
    {
        boolean status = true;
        Connection conn = null;
        Statement statement = null;

        try {
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement = conn.createStatement();
            statement.executeUpdate("Update School SET SchoolName = '"+newName+"' WHERE SchoolID = "+id);
        } catch (SQLException e) {
            e.printStackTrace();
            AlertBox.errorBox("An error occurred when submitting changes","Query Error",500,100);
            status = false;
        }

        try {
            conn.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            AlertBox.errorBox("An error occurred when trying to close the database","Connection Error",500,100);
            System.exit(0);
        }

        return status;

    }//END CHANGE SCHOOL

    public static int getSchoolID(String school)
    {
        int schoolID = 0;
        Connection conn = null;
        Statement statement = null;
        ResultSet result =  null;

        try {
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement = conn.createStatement();
            result = statement.executeQuery("Select SchoolID FROM School WHERE SchoolName = '"+school+"'");
            result.next();
            schoolID = result.getInt("SchoolID");
        } catch (SQLException e) {
            e.printStackTrace();
            AlertBox.errorBox("Could not find "+school+" in database","Query Error",500,100);
        }

        try {
            conn.close();
            statement.close();
            result.close();
        } catch (SQLException e) {
            e.printStackTrace();
            AlertBox.errorBox("An error occurred when trying to close the database","Connection Error",500,100);
            System.exit(0);
        }

        return schoolID;
    }//END GET SCHOOL ID

    public static void regenerateRanking()
    {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            statement.executeUpdate("TRUNCATE TABLE Ranking");
            statement.executeUpdate("INSERT INTO Ranking(SchoolID,Points) SELECT SchoolID, NewPoints FROM School ORDER BY NewPoints DESC");

        } catch (SQLException e) {
            e.printStackTrace();
            AlertBox.errorBox("An error occurred when trying to regenerate the database","Table Regeneration Error",500,100);
        }//END TRY CATCH

        try {
            connection.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            AlertBox.errorBox("An error occurred when trying to close the database","Connection Error",500,100);
            System.exit(0);
        }

    }//END REGENERATE RANKING

    public static void getSchoolData()
    {
        schoolList.clear();
        Connection conn = null;
        Statement statement = null;
        ResultSet result = null;

        try {
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement = conn.createStatement();
            result = statement.executeQuery("Select * FROM School");

            while(result.next())
            {
                schoolList.add(new SchoolData(result.getInt("SchoolID"),result.getString("SchoolName"),
                        result.getInt("OldPoints"),result.getInt("NewPoints")));
            }//END WHILE
        } catch (SQLException e) {
            e.printStackTrace();
            AlertBox.errorBox("An error occurred when retrieving school data","Query Error",500,100);
        }//END TRY CATCH | POPULATE SCHOOL LIST

        try {
            conn.close();
            statement.close();
            result.close();
        } catch (SQLException e) {
            e.printStackTrace();
            AlertBox.errorBox("An error occurred when trying to close the database","Connection Error",500,100);
        }//END TRY CATCH | CLOSE DATABASE CONNECTION

    }//END GET SCHOOL DATA

    public static void pointTransfer()
    {
        Connection conn = null;
        Statement statement = null;

        try {
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement = conn.createStatement();

            for (SchoolData d : schoolList)
            {
                statement.executeUpdate("UPDATE School SET OldPoints = "+d.getNewPoints()+" WHERE SchoolID ="
                +d.getId());
            }
        } catch (SQLException e) {
            e.printStackTrace();
            AlertBox.errorBox("An error occurred when transferring new points","Query Error",500,100);
        }//END TRY CATCH | QUERY

        try {
            conn.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            AlertBox.errorBox("An error occurred when trying to close the database","Connection Error",500,100);
        }//END TRY CATCH | CLOSE DATABASE CONNECTION

    }//END POINT TRANSFER

    public static void getRanking()
    {
        teamList.clear();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;


        try {
            connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement = connection.createStatement();
            resultset = statement.executeQuery("SELECT * FROM RankingSheet");

            while(resultset.next())
            {
                teamList.add(new TeamRank(resultset.getInt("Rank"),resultset.getString("School Name"),resultset.getInt("Points")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            AlertBox.errorBox("An error occurred when retrieving ranking sheet","Query Error",500,100);
        }//END TRY CATCH

        try {
            connection.close();
            statement.close();
            resultset.close();
        } catch (SQLException e) {
            e.printStackTrace();
            AlertBox.errorBox("An error occurred when trying to close the database","Connection Error",500,100);
            System.exit(0);
        }//END TRY CATCH

    }//END GET RANKING

    public static ObservableList<TeamRank> getTeamList()
    {
        getRanking();
        return teamList;
    }//END GET TEAM LIST


}//END CLASS DATABASE MANAGEMENT
