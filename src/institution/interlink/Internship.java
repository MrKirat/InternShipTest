package institution.interlink;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import person.Student;

public class Internship {
    private String name;
    private List <Student> students = new ArrayList <>(); // list of internship students
    
    public Internship(String name) {
        this.name = name;
    }
    
    public void setStudents(List <Student> students) { //adding students to the intenship
        Stream<Student> streamStudents = students.stream();
        double averageLevel = streamStudents
                .distinct()
                .mapToDouble(n -> n.getKnowledge().getLevel())
                .average()
                .orElse(0);
        System.out.println("averageLevel:" + averageLevel);
        if(averageLevel != 0) {
            for (Student st : students) {
                if (!this.students.contains(st) && st.getKnowledge().getLevel() > averageLevel) {
                    this.students.add(st);
                }
            }
        } else {
            System.out.println("Students for internship is not.");
        }
    }

    public List<Student> getStudents(){
        return students;
    }
    
    public void printStudents(){ //printing a list of student
        for(Student st: students){
            System.out.println(st.getName() + " with a level of knowledge " + st.getKnowledge().getLevel());
        }
    }
}
