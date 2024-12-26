import models.Person;
import models.Student;
import models.Teacher;
import models.School;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {

    public static void main(String[] args) throws FileNotFoundException {

        File studentsFile = new File("C:\\Users\\shero\\IdeaProjects\\project2\\src\\students.txt");
        File teachersFile = new File("C:\\Users\\shero\\IdeaProjects\\project2\\src\\teachers.txt");

        Scanner studentz = new Scanner(studentsFile);
        Scanner teacherz = new Scanner(teachersFile);

        School school = new School();

        while (studentz.hasNext()) {

             String name = studentz.next();
            String surname = studentz.next();
           int age = studentz.nextInt();
            boolean gender = studentz.next().equals("Male");

           Student student = new Student(name, surname, age, gender);

            while (studentz.hasNextInt()) {
                int grade = studentz.nextInt();
                student.AddGrade(grade);
            }

            System.out.println(student + " " + "and my GPA is: " + student.calculateGPA());

            school.addMembers(student);

        }

        while (teacherz.hasNextLine()) {
            String name = teacherz.next();
            String surname = teacherz.next();
            int age = teacherz.nextInt();
            boolean gender = teacherz.next().equals("Male");
            String subject = teacherz.next();
            int experience = teacherz.nextInt();
            int salary = teacherz.nextInt();

            Teacher teacher = new Teacher(name, surname, age, gender, subject, experience, salary);

            if (experience > 10){
                teacher.giveRaise(10);
                System.out.println(name + "get a raise on 10% and now his salary: "  + teacher.getSalary());
            }

            school.addMembers(teacher);

        }

        System.out.println(school);
    }

}
