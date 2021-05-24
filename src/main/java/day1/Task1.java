package day1;

public class Task1 {
    public static void main(String[] args) {
      int k = 9;
      int i = 1;
      while(i < 10){
          int count = i * k;
          System.out.println(i + " * " + k + " = " + count);
          i++;
      }
    }
}
