package com.amigoscode._4_datastructures._1_arrays;

// Exercise: Two-Dimensional Arrays
// Learn how to create and work with 2D arrays (matrices) in Java.

import java.util.Arrays;

public class TwoDArrays {

    public static void main(String[] args) {

        // TODO: 1 - Create a 3x3 int 2D array called 'matrix'


        // TODO: 2 - Fill the matrix with multiplication table values
        //           matrix[i][j] should equal (i + 1) * (j + 1)
        //           Expected result:
        //           1 2 3
        //           2 4 6
        //           3 6 9
        int[][] matrix = new int[3][3];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] =  (row+1) * (col + 1);
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            System.out.println(Arrays.toString(matrix[row]));
        }

        System.out.println(Arrays.deepToString(matrix));


        // TODO: 3 - Print the matrix in row/column format
        //           Each row on a new line, values separated by spaces or tabs


        // TODO: 4 - Find and print the sum of all elements in the matrix
        //           Use nested loops to accumulate the total
        int total = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                total = total + anInt;
            }
        }
        System.out.println("Total = "+total);

        int totals = Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();
        System.out.println("Totals = " + totals);

        // TODO: 5 - Find and print the sum of row index 1 (the second row: 2, 4, 6)
        //           Iterate through all columns of that specific row
        Arrays.stream(matrix)
                .mapToInt(row -> Arrays.stream(row).sum())
                .forEach(System.out::println);

        // TODO: 6 - Find and print the sum of the diagonal elements (top-left to bottom-right)
        //           Diagonal elements are where row index == column index
        //           Expected: matrix[0][0] + matrix[1][1] + matrix[2][2] = 1 + 4 + 9 = 14
        int rowSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i ==j) {
                    rowSum += matrix[i][j];
                }
            }


        }
        System.out.println("Sum: " + rowSum);
    }
}
