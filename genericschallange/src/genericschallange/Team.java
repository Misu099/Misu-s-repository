
package genericschallange;
public class Team {

    private String name;
    private int points;

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public Team(String name, int points){
        this.name = name;
        this.points = points;
    }


    @Override
    public String toString() {
        return "Team: " + name + ": " + points + " points.";
    }
}
