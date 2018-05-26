package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Michael Edwards (Intern) on 14/6/2016.
 */

public class TeamRank {
    private int rank;
    private String school;
    private int points;

    /*private IntegerProperty rankProperty;
    private StringProperty schoolProperty;
    private IntegerProperty pointsProperty;*/

    public TeamRank(int ranking, String name, int point)
    {
        rank = ranking;
        school = name;
        points = point;

        /*setRankProperty(ranking);
        setPointsProperty(point);
        setSchoolProperty(name);*/
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    /*public int getRankProperty() {
        return rankProperty.get();
    }

    public IntegerProperty rankPropertyProperty() {
        return rankProperty;
    }

    public void setRankProperty(int rankProperty) {
        this.rankProperty.set(rankProperty);
    }

    public String getSchoolProperty() {
        return schoolProperty.get();
    }

    public StringProperty schoolPropertyProperty() {
        return schoolProperty;
    }

    public void setSchoolProperty(String schoolProperty) {
        this.schoolProperty.set(schoolProperty);
    }

    public int getPointsProperty() {
        return pointsProperty.get();
    }

    public IntegerProperty pointsPropertyProperty() {
        return pointsProperty;
    }

    public void setPointsProperty(int pointsProperty) {
        this.pointsProperty.set(pointsProperty);
    }*/

}//END CLASS TEAM RANK
