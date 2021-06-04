package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student st1 = new Student("Henry", "Mechanical");
        Teacher teacher1 = new Teacher("Robby", "Math");
        System.out.println(st1.getGroupName());
        System.out.println(teacher1.getSubjectName());

        st1.printInfo();
        teacher1.printInfo();

    }
}
