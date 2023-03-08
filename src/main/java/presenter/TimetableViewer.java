package presenter;

import entities.Section;
import entities.Timetable;

import java.util.ArrayList;

public class TimetableViewer {
    public ArrayList<String> visualizeTimetable(Timetable timetable) {

        ArrayList<Section> sections = timetable.getSections();
        ArrayList<String> schedule = new ArrayList<String>();

        StringBuilder sch = new StringBuilder();

        for (Section sec: sections) {
            sch.append('\n' + sec.courseCode() + '\n' );
            sch.append(sec.sectionCode() + '\n');
            sch.append(sec.intervals());

        }
        return schedule;
    }
}

