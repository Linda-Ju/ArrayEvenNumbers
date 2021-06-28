package com.company;

public class Main {

    public static void main(String[] args) {

//        int[] numbers = {13, 45, 26, 22, 19, 24, 28, 30, 90, 12};
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0)
//                System.out.println("Even number:" + numbers[i]);
//
//        }

//                    0    1    0    1    0    1    0    1     0   1
//    twoDimArray = [[13, 45], [26, 22], [19, 24], [28, 30], [90, 12]] // multidimensional array
//                      0         1         2         3         4
// twoDimArray[0][1]


        int[][] numbers = {{13, 45}, {26, 22}, {19, 24, 20}, {20, 30, 80}, {90, 12}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) { // nested loop
                System.out.println(numbers[i][j]);
            }
            if (i == numbers.length - 1){
                System.out.println("Last iteration done");
                break;
            }
            System.out.println("One iteration done");
        }

    }
}
