package institution.interlink;

import java.util.ArrayList;
import java.util.List;
import person.Student;

public class Internship {
    private String name;
    private List <Student> students = new ArrayList <>(); // list of internship students
    
    public Internship(String name) {
        this.name = name;
    }

    public void setStudents(List <Student> students) { //adding students to the intenship
        for(Student st: students){
            if(!this.students.contains(st) && st.getKnowledge().getLevel() > 5){
                this.students.add(st);
            }
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
