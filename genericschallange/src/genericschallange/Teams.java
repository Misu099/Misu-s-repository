
package genericschallange;


import java.util.ArrayList;
import java.util.Collections;

public class Teams  {

    private final ArrayList<Team> LIST = new ArrayList<>();

    public void add(Team t) {
        LIST.add(t);
    }

    public void sort(){
        Collections.sort(LIST, (Team t1, Team t2) -> Integer.compare(t1.getPoints(), t2.getPoints()));
    }



    public String toString(){
        return LIST.toString();
    }


}

