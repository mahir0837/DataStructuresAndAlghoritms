package com.sarac;

import java.util.*;

public class SunsetViews {

    public static void main(String[] args) {

        int[] arr = {3, 5, 4, 4, 3, 1, 3, 2};
        sunsetView(arr,"east").forEach(System.out::println);

    }

    public static ArrayList<Integer> sunsetView(int[] buildings, String direction) {

        Stack<Integer> stack=new Stack<>();
        //for east
        int i=0;
        int step=1;
        //for west
        if (direction.equalsIgnoreCase("west")){
            i= buildings.length-1;
            step=-1;
        }
        // int[] arr = {3, 5, 4, 4, 3, 1, 3, 2};
        while(i>=0&&i< buildings.length) {

            while(!stack.isEmpty()&&buildings[i]>=buildings[stack.peek()]){

                stack.pop();
            }
            stack.push(i);
            i+=step;

        }
        if (direction.equalsIgnoreCase("west")) Collections.reverse(stack);

return new ArrayList<Integer>(stack);
    }
}
