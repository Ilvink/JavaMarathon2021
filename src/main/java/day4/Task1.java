package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Random ran = new Random();

        int[] array = new int[x];

        int y = Arrays.binarySearch(array, 8);

        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(10);

             }


        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " +array.length);
        int count = 0; int count1 = 0; int count2 = 0; int count3 = 0;  int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) {
                count++;
            }if (array[i] == 1) {
                count1++;
            }   if (array[i] %2 ==0 ) {
                count2++;
            }  if (array[i] %2 != 0) {
                count3++;
            } sum += array[i];
        }
        System.out.println("Количествo чисел больше 8: " + count ) ;

        System.out.println("Количество чисел равных 1: " + count1) ;

        System.out.println("Количество четных чисел: " + count2) ;

        System.out.println("Количество нечетных чисел: " + count3) ;

        System.out.println("Сумма всех элементов массива: " + sum ) ;



    }
}
