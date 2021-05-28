package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] x  = new int[12][8];
        Random rand = new Random();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j]= rand.nextInt(50);
            }
        }

        int maxSum = 0;
        int matrixInd = 0;
        for (int i = 0; i < x.length; i++) {
           int sum = 0;
            for (int j = 0; j < x[i].length; j++) {
                sum+= x[i][j];
            }
            if(sum >= maxSum){
                maxSum = sum;
                matrixInd = i;
            }
        }
        System.out.println(matrixInd);



    }
}
