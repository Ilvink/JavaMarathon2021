package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int []array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
            int max = 0;  int min = 10000; int count0 = 0;  int sum = 0;
            for (int element: array) {
                if(element > max){
                    max = element;
                }  if(element < min){
                    min = element;
                }if( element %10 ==0){
                    count0++;
                }   if( element %10 ==0){
                    sum+= element;
                }
            }
        System.out.println("наибольший элемент массива " + max );

        System.out.println("наименьший элемент массива " + min);

        System.out.println("количество элементов массива, оканчивающихся на 0 " + count0);

        System.out.println("суммa элементов массива, оканчивающихся на 0 " + sum);

    }
}
