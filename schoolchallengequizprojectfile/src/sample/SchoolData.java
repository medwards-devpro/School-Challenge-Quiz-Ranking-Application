package sample;

/**
 * Created by news1 on 26/6/2016.
 */
public class SchoolData {
    private int id;
    private String name;
    private int oldPoints;
    private int newPoints;

    public SchoolData(int id, String name, int oldPoints, int newPoints)
    {
        this.id = id;
        this.name = name;
        this.oldPoints = oldPoints;
        this.newPoints = newPoints;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOldPoints() {
        return oldPoints;
    }

    public void setOldPoints(int oldPoints) {
        this.oldPoints = oldPoints;
    }

    public int getNewPoints() {
        return newPoints;
    }

    public void setNewPoints(int newPoints) {
        this.newPoints = newPoints;
    }
}//END SCHOOL DATA CLASS
