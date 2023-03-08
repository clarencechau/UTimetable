
package entities;

import java.util.ArrayList;

public class Timetable {

    ArrayList<Section> sections;

    public Timetable(ArrayList<Section> sections) {
        this.sections = sections;
    }

    public ArrayList<Section> getSections() { return this.sections; }

}

