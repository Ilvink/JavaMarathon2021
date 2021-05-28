package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int []array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
            int max = 0;
            for (int element: array) {
                if(element > max){
                    max = element;
                }
            }
        System.out.println("наибольший элемент массива " + max );

        int min = 10000;
        for (int element: array) {
            if(element < min){
                min = element;
            }
        }
        System.out.println("наименьший элемент массива " + min);

        int count0 = 0;
        for (int element: array) {
            if( element %10 ==0){
                count0++;
            }
        }

        System.out.println("количество элементов массива, оканчивающихся на 0 " + count0);

        int sum = 0;
        for (int element: array) {
            if( element %10 ==0){
                sum+= element;
            }
        }


        System.out.println("суммa элементов массива, оканчивающихся на 0 " + sum);

    }
}
