package datastructures;

import java.util.Arrays;

public class WorkingWithArrays {

    public static void main(String[] args) {

        String [] colors = new String[5];
        colors[0] = "pink";
        colors[1] = "blue";
        colors[2] = "yellow";

        System.out.println(Arrays.toString(colors));


        int [] nums = {100, 200};
        System.out.println(Arrays.toString(nums));

        for(int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        System.out.println(colors.length);

        for(String color : colors) {
            System.out.println(color);
        }

        System.out.println("_________________");

        Arrays.stream(colors).forEach(System.out::println);
    }
}
