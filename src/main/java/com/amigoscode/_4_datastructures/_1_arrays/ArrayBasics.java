package com.amigoscode._4_datastructures._1_arrays;

// Exercise: Array Basics
// Learn how to create, manipulate, and search through arrays in Java.

import java.util.Arrays;

public class ArrayBasics {

    public static void main(String[] args) {

        // TODO: 1 - Create an int array of size 5
        int[] intAr = new int[5];


        // TODO: 2 - Fill the array with values 10, 20, 30, 40, 50 using a for loop
        //           (hint: use i * 10 + 10 or similar pattern)
        for (int i = 0; i < intAr.length; i++) {
            intAr[i] = (i+1) * 10;
        }

//        Arrays.stream(intAr).forEach(System.out::println);

        // TODO: 3 - Print all elements of the array using Arrays.toString()
        Arrays.stream(intAr).forEach(System.out::println);


        // TODO: 4 - Find the maximum value in the array
        //           Iterate through the array and track the largest value found
        int max = Arrays.stream(intAr).max().getAsInt();
        System.out.println("Max=" + max);

        // TODO: 5 - Find the minimum value in the array
        //           Iterate through the array and track the smallest value found
        int min = Arrays.stream(intAr).min().getAsInt();
        System.out.println("Min=" + min);

        // TODO: 6 - Sort the array using Arrays.sort()
        //           Then print the sorted array
        Arrays.stream(intAr).sorted().forEach(System.out::println);

        // TODO: 7 - Use Arrays.binarySearch() to find the index of value 30
        //           Note: the array must be sorted before using binarySearch
        //           Print the index where the value was found
        int index = Arrays.binarySearch(intAr, 30);
        System.out.println("Index=" + index);
    }
}
