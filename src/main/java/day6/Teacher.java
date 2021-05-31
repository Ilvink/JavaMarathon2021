package day6;

import java.util.Random;

public class Teacher {

    private String name;
    private String lesson;

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }
    public void evaluate(Student student){
        Random random = new Random();
        int n = random.nextInt(5) + 2;
        String evaluation = "";
        switch (n) {
            case 2 : evaluation = "D";
                    break;
            case 3 : evaluation =" C";
            break;
            case 4: evaluation = "B";
            break;
            case 5 : evaluation = "A";
            break;
        }
        System.out.println("Teacher " + this.name + " is evaluate student " + student.getName() + " in lesson " + this.lesson + " for the assessment " + evaluation);
    }}
