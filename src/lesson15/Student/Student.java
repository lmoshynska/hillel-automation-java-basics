package lesson15.Student;

import java.util.HashMap;
import java.util.Map;

/*
* Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
Создать коллекцию, содержащую объекты класса Student. Написать метод, который удаляет студентов со средним баллом <3.
Если средний балл>=3, студент переводится на следующий курс. Напишите метод printStudents(List<Student> students, int course),
который получает список студентов и номер курса. А также печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.
*/
public class Student {

    private String name;
    private String group;
    private int course;
    private Map<String, Integer> marks;


    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        marks = new HashMap<>();
    }

    public boolean isGraduate() {
        return this.course == 5;
    }

    public int getAverageMark() {
        return marks.values()
                .stream()
                .mapToInt(i -> i)
                .sum() / marks.size();
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
