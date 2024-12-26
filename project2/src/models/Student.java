package models;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int id;
    private List<Integer>grades = new ArrayList<>();
    private static int id_gen = 1;

    private void generateID() {
        id = id_gen++;
    }

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
    }

    public void AddGrade(int grade) {
        grades.add(grade);
    }
    public double calculateGPA() {
        double gpa = 0;
        for(int i=0; i<grades.size(); i++){
           int  grade = grades.get(i);
           gpa+=grade;
        }
        return gpa/grades.size();
    }



    @Override
    public String toString() {
        return super.toString() + ",I'm a student with id" +id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
}
}
