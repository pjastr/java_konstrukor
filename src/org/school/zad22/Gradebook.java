package org.school.zad22;

import java.util.ArrayList;

class Gradebook {

    private String firstName;
    private String lastName;
    private ArrayList<Integer> grades;

    {
        grades = new ArrayList<>();
    }

    public Gradebook(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = new ArrayList<>(grades);
    }

    public ArrayList<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public void removeGrade(int index) {
        if(index >=0 && index < grades.size())
            grades.remove(index);
    }

    public double averageGrade() {
        if (grades.isEmpty())
            return 0;
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
