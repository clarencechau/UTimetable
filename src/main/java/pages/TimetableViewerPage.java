package pages;

import entities.Timetable;
import presenter.TimetableViewer;

import java.util.ArrayList;

public class TimetableViewerPage extends Page{
    public Timetable getTimetable() {
        return timetable;
    }

    public void setTimetable(Timetable timetable) {
        this.timetable = timetable;
    }

    private Timetable timetable;
    private TimetableViewer timetableViewer;

    public TimetableViewerPage(Router router) {
        super(router);
        this.timetableViewer = new TimetableViewer();
    }

    @Override
    public Page run() {
        ArrayList<String> visualization = this.timetableViewer.visualizeTimetable(this.timetable);

        // show visualization
        // prompt user to continue

        System.out.println(visualization);

        return this.router.getFriendListPage();
    }
}
