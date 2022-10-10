package lab1;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
       int[][] a = {{1,3,1},{1,0,0}};
       int[][] a2 = {{0,0,5},{7,5,0}};
       int[][] b = {{1,8,-3},{4,-2,5}};
       int[][] c = {{1,2,3},{0,-6,7}};

       int[][] e1 = {{1,2,3},{4,5,6}};
       int[][] e2 = {{7,8},{9,10},{11,12}};

       int[][]  f  = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] f2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] arr2 = {{8, 5, 4,4, 67},
                {687, 68, 974, 546, 5},
                {65, 65, 12, 56, 34},
                {1, 23, 35,6,7},
                {32, 123, 23,32,32}};
        int[][] arr =
                {{1, 3,1,4}, {3,9,5,15},{0,2,1,1},{0,4,2,3}};


        MultiDimentionalArrays.toString(
                MultiDimentionalArrays.sumArrays(a,a2));
        System.out.println("_______________");
        MultiDimentionalArrays.toString(
                MultiDimentionalArrays.multiplyByNumber(b,2));
        System.out.println("_______________");
        MultiDimentionalArrays.toString(
                MultiDimentionalArrays.transportArray(c));

        System.out.println("_______________");
        MultiDimentionalArrays.toString(
                MultiDimentionalArrays.multiplyTwoArrays(e1,e2));
        System.out.println("_______________");
        MultiDimentionalArrays.toString(
                MultiDimentionalArrays.getSubmatrix(f2,3,2));
        System.out.println("_______________");
        MultiDimentionalArrays.toString(
                MultiDimentionalArrays.getSubmatrix(arr,1,3));

        System.out.println("_______________");
        MultiDimentionalArrays.toString(
                MultiDimentionalArrays.changeToDiagonal(f));

        System.out.println("_______________");
        MultiDimentionalArrays.toString(
                MultiDimentionalArrays.changeToLowerTriangle(f));

        System.out.println("_______________");
        MultiDimentionalArrays.toString(
                MultiDimentionalArrays.changeToUpperTriangle(f));











        System.out.println(MultiDimentionalArrays.getDeterminant(arr));




        System.out.println(MultiDimentionalArrays.getDeterminant(arr2));

    }
}