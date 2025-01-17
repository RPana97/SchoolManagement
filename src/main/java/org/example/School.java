package org.example;

import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created. list of students int the school. */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /** return the list of teachers int the school. */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /** Adds a teacher to the school. */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /** return the list of students in the school. */
    public List<Student> getStudents() {
        return students;
    }

    /** Adds a student to the school */
    public void addStudent(Student student) {
        students.add(student);
    }

    /** return the total money earned by the school. */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /** Adds the total money earned by the school.*/
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /** return the total money spent by the school. */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /** update the money that is spent by the school */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
    }
}
