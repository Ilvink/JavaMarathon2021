package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Audi");
        arrayList.add("BMW");
        arrayList.add("Toyota");
        arrayList.add("Nissan");
        arrayList.add("Chevrolet");

        System.out.println(arrayList);

        arrayList.set(2,"Infinity");

        System.out.println(arrayList);

        arrayList.remove(0);
        System.out.println(arrayList);


    }
}
