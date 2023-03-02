package com.sarac;

import java.util.*;

public class ArrayListReview {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        //Add elements to ArrayList

        students.add(new Student(1, "Jack"));
        students.add(new Student(2, "Julia"));
        students.add(new Student(3, "Mike"));
        students.add(new Student(4, "Mary"));

        //Itertion on ArrayList
        //1.For Loop with get(index)
        System.out.println("Printing with legacy foor-loop......");
        for (int i = 0; i < students.size(); i++) {

            System.out.println(students.get(i));
        }
        //2.Iteration
        //Forward Iteration
        System.out.println("Printing with iteratior......");
        Iterator iter = students.listIterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        //Backwards Iteration
        System.out.println("Printing Backwards with iteratior......");

        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());
        }
        System.out.println("Printing with for each .......");
        //For each Loop
        for (Student student : students) {
            System.out.println(student);
        }

        //Lambda
        System.out.println("Printing with lambda .......");
        students.forEach(student -> System.out.println(student));

        //Sorting Elements in List
        System.out.println("Sorting Comparator Interface By ID Descending .......");
        Collections.sort(students,new sortByIdDescending());
        students.forEach(student -> System.out.println(student));
        //Sorting Elements in List
        System.out.println("Sorting Comparator Interface By Name Descending .......");
        Collections.sort(students,new sortByNameDescending());
        students.forEach(student -> System.out.println(student));
    }

    static class sortByIdDescending implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.Id-o1.Id;
        }
    }
    static class sortByNameDescending implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }

}
