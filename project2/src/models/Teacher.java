package models;

public class Teacher  extends Person{
    private String subject;
    private int YearsOfExperience;
    private int salary;


    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        YearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void giveRaise(int  percentage){
        salary += salary * percentage/100;
    }

    @Override
    public String toString(){
        return super.toString() + ",I teach" + subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearsOfExperience() {
        return YearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        YearsOfExperience = yearsOfExperience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }




}
