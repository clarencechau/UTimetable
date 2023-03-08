package entities;

import java.util.ArrayList;

public record Section(String courseCode, String sectionCode, ArrayList<Interval> intervals) {
}
