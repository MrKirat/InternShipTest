package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;
import java.util.List;

import static java.util.Arrays.asList;

public class Application {
    public static List<Student> createStudents() {
        return asList(
                new Student("John Kostenko", new Knowledge(9)),
                new Student("Andrew Kostenko", new Knowledge(3)),
                new Student("Julia Veselkina", new Knowledge(6)),
                new Student("Maria Perechrest", new Knowledge(4)),
                new Student("Ivan Tallman", new Knowledge(5))
        );
    }

    public static void main(String[] args) {
        
        //create a university
        University university = new University("CH.U.I.");
        
        //create a students and add students to the university list
        university.setStudents(createStudents());
        
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
