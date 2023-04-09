package com.sarac;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class sunsetViews {

    public static void main(String[] args) {

        int[] arr={3,5,4,4,1,3,2};
        System.out.println(sunsetView(arr, "east"));

    }

    public static ArrayList<Integer>sunsetView(int[]buildings,String direction){

        Deque<Integer>stack=new LinkedList<>();


        int t=0;
        stack.push(t);
        if (direction.equalsIgnoreCase("east")){


            for (int i = 1; i < buildings.length; i++) {

                if (buildings[i]>buildings[t]){
                    stack.pop();
                    stack.push(i);

                }else{
                    stack.push(t);
                }
                t++;
            }
        }
return new ArrayList<>(stack);
    }
}
