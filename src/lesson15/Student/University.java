package lesson15.Student;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students;

    public List<Student> createStudentsList(){
        students = new ArrayList<>();
        students.add(new Student("Kevin", "CS53", 2));
        students.add(new Student("Eva", "CS53", 2));
        students.add(new Student("John", "CS54", 1));
        students.add(new Student("Silvia", "CS52", 3));
        students.add(new Student("Adelle", "CS52", 3));
        students.add(new Student("Mark", "CS53", 2));
        students.add(new Student("Peter", "CS51", 4));
        students.add(new Student("Anna", "CS50", 5));
        students.add(new Student("Mary", "CS51", 4));
        students.add(new Student("Alex", "CS51", 4));
        students.add(new Student("Edward", "CS53", 2));
        students.add(new Student("Jake", "CS50", 5));
        students.add(new Student("Jill", "CS52", 3));
        students.add(new Student("Helen", "CS50", 5));
        students.add(new Student("Anthony", "CS54", 1));
        return students;
    }

    public void assignMarksToAllStudents() {
        for(Student student : students) {
            assignMarksToStudent(student);
        }
    }

   /* public List<Student> makeTransferDecision(List<Student> initialStudents) {

    }*/

    public void assignMarksToStudent(Student student) {
        for(Subjects subject : Subjects.values()) {
           int mark = (int) (Math.random() * 5) + 1;
           student.getMarks().put(subject.getName(), mark);
        }
    }
}
