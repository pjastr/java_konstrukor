package org.school.zad22;

class TestGradebook {

    public static void main(String[] args) {
        Gradebook gradebook = new Gradebook("Jan", "Kowalski");
        gradebook.addGrade(5);
        gradebook.addGrade(4);
        gradebook.addGrade(3);
        gradebook.addGrade(2);
        gradebook.addGrade(1);
        System.out.println(gradebook.averageGrade());
        gradebook.removeGrade(0);
        System.out.println(gradebook.averageGrade());
        gradebook.setFirstName("Adam");
        gradebook.setLastName("Nowak");
        System.out.println(gradebook.getFirstName());
        System.out.println(gradebook.getLastName());
    }
}
