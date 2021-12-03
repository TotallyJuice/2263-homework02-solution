package edu.isu.cs.cs2263.hw02.data;

import lombok.Getter;
import lombok.Setter;

public class Course {

    public static final String[] CODES = { "CS", "CHEM", "PHYS", "MATH", "BTNY", "ZOO" };
    public static final String[] DEPTS = { "Computer Science", "Chemistry", "Physics", "Mathematics", "Botany", "Zoology" };

    @Getter @Setter private int number;
    @Getter @Setter private String name;
    @Getter @Setter private int credits;
    @Getter @Setter private String code;

    public Course() {}

    public Course(String name, String code, int number, int credits) {
        this.name = name;
        this.code = code;
        this.number = number;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s (%d)", code, number, name, credits);
    }
}
