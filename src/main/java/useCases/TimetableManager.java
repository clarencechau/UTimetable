package useCases;

import entities.Interval;
import entities.Section;
import entities.Timetable;

import java.util.ArrayList;
import java.util.TreeMap;

public class TimetableManager {

    public ArrayList<Interval> compareTimetable(ArrayList<Timetable> timetables) {

        TreeMap<Integer, Boolean> intervalTree = new TreeMap<>();

        intervalTree.put(-1, true);
        intervalTree.put(Integer.MAX_VALUE, false);

        for (Timetable t : timetables) {
            for (Section s : t.getSections()) {
                for (Interval i : s.intervals()) {
                    int x = i.start();
                    int y = i.end();
                    int gx = intervalTree.ceilingKey(x);

                    while (gx <= y) {
                        intervalTree.remove(gx);
                        gx = intervalTree.ceilingKey(x);
                    }
                    if (!intervalTree.get(intervalTree.floorKey(x))) {
                        intervalTree.put(x, true);
                    }
                    if (intervalTree.get(gx)) {
                        intervalTree.put(y, false);
                    }
                }
            }
        }

        ArrayList<Integer> intervalTreeKeys = new ArrayList<>(intervalTree.keySet());
        ArrayList<Interval> intervals = new ArrayList<>();

        for (int i = 0; i < intervalTree.size(); i += 2) {
            intervals.add(new Interval(intervalTreeKeys.get(i), intervalTreeKeys.get(i + 1)));
        }

        return intervals;
    }


}