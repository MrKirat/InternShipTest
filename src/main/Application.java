package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        
        //create a university
        University university = new University("CH.U.I.");
        
        //create a students and add students to the university list
        university.addStudent(new Student("John Kostenko", new Knowledge(9)));
        university.addStudent(new Student("Andrew Kostenko", new Knowledge(3)));
        university.addStudent(new Student("Julia Veselkina", new Knowledge(6)));
        university.addStudent(new Student("Maria Perechrest", new Knowledge(4)));
        
        //show the list of university students
        System.out.println("List of university's students:");
        university.printStudents();
        System.out.println();
        
        //create a internship
        Internship internship = new Internship("Interlink");
        
        //add students to the internship list
        internship.setStudents(university.getStudents());
        
        //show the list of internship students
        System.out.println("List of internship's students:");
        internship.printStudents();
        System.out.println();
    }
}
