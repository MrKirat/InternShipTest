package institution;

import java.util.ArrayList;
import java.util.List;
import person.Student;

public class University {
    private String name;
    private List <Student> students = new ArrayList <>(); // list of university students
    public University(String name) {
        this.name = name;
    }

    public void setStudents(List <Student> students) { //adding students to the university
        for(Student st: students){
            if(!this.students.contains(st)){
                this.students.add(st);
            }
        }
    }

    public void addStudent(Student student) { //adding student to the university
        students.add(student);
    }
    
    public List<Student> getStudents() {
       return students;
    }
    
    public void printStudents(){//printing a list of student
        for(Student st: students){
            System.out.println(st.getName() + " with a level of knowledge " + st.getKnowledge().getLevel());
        }
    }
}
