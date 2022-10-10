package lab1;

public class MultiDimentionalArrays {

    public static int [][] sumArrays ( int [][] first, int [][] second){

        if (first == null || second == null)
            throw new IllegalArgumentException("array is null!");

        if (!sameSize(first,second))
            throw new IllegalArgumentException("they dont have same size");

        int [][] resultArray = new int[first.length][first[0].length];
        
        for (int i = 0; i < first.length; i++) {

            for (int j = 0; j < first[i].length; j++) {
                 resultArray[i][j] = first[i][j] + second[i][j];
            }

        }
        return resultArray;
    }


    public static int [][] multiplyByNumber (int [][] array , int number){

        if (array == null)
            throw new IllegalArgumentException("array is null!");

        int [][] resultArray =  new int [array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resultArray[i][j] = array[i][j]*number;
            }
        }
        return resultArray;
    }

    public static int [][] transportArray (int [][] array){

        if (array == null)
            throw new IllegalArgumentException("array is null!");

        int[][] resultArray = new int[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resultArray[j][i] = array[i][j];
            }

        }
        return resultArray;
    }
    
    
    public static int [][] multiplyTwoArrays (int [][] first, int[][] second){

        if (first == null || second == null)
            throw new IllegalArgumentException("array is null!");

        // check if left column equal right rows.
        if (first[0].length != second.length)
            throw new IllegalArgumentException
                    ("left column should be equal right row");

        int[][] resultArray = new int[first.length][second[0].length];
        int sum;
        for (int i = 0; i < resultArray.length; i++) {

            for (int j = 0; j < resultArray[i].length; j++) {
                sum =0;
                for (int k = 0; k < first[i].length; k++) {
                   sum = sum + (first[i][k]*second[k][j]);
                }
                resultArray[i][j] = sum;
            }
            
        }
        return resultArray;
    }

    public static int[][] changeToDiagonal (int [][] array){

        if (array == null)
            throw new IllegalArgumentException("array is null!");

        //check if square
        if (!isSquare(array))
            throw new IllegalArgumentException("should be square!");


        int [][] resultArray = copy(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i != j)
                    resultArray[i][j] = 0;
            }

        }
        return resultArray;
    }

    public static int[][] changeToLowerTriangle(int [][] array){

        if (array == null)
            throw new IllegalArgumentException("array is null!");

        int [][] resultArray = copy(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(j>i)
                    resultArray[i][j] = 0;
            }

        }
        return resultArray;
    }



    public static int[][] changeToUpperTriangle(int [][] array){

        if (array == null)
            throw new IllegalArgumentException("array is null!");

        int [][] resultArray = copy(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(j<i)
                    resultArray[i][j] = 0;
            }

        }
        return resultArray;
    }



public static int[][] getSubmatrix(int[][]array,int rowNum,int colNum){

    if (array == null)
        throw new IllegalArgumentException("array is null!");

        rowNum--;
        colNum--;
    int [][] resultArray =new int[array.length-1][array[0].length-1];
    int row = -1;
    int column =-1;
    for (int i = 0; i < array.length ; i++) {
        if (i == rowNum)
            continue;
           row++;
        for (int j = 0; j < array[i].length ; j++) {

            if (j==colNum)
                continue;



            column++;
           resultArray[row][column] = array[i][j];
        }
        column=-1;

    }
    return resultArray;
}
    public static int[][] copy (int[][] array){

        if (array == null)
            throw new IllegalArgumentException("array is null!");

        int [][] copyArray = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                copyArray[i][j] = array[i][j];
            }

        }
        return copyArray;
    }



    public static void toString (int [][] array){

        if (array == null)
            throw new IllegalArgumentException("array is null!");

        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" "+ array[i][j]+" ");
            }
            System.out.print("]");
            System.out.println("");
        }

    }

    public static boolean sameSize ( int [][] first, int [][] second){

        if (first == null || second == null)
            throw new IllegalArgumentException("array is null!");

        if (first.length == second.length
        && first[0].length == second[0].length)
            return true;
        else
            return false;
    }

    public static boolean isSquare (int [][] array){

        if (array == null)
            throw new IllegalArgumentException("array is null!");

        if (array[0].length == array.length)
            return true;
        else
            return false;
    }



    public static int getDeterminant (int [][] array){
        int sum=0;
        if (!isSquare(array))
            throw new IllegalArgumentException("array should be square");

        if (array.length == 2)
            return   array[0][0] * array[1][1] - array[0][1]* array[1][0];

        for (int i = 0; i < array[0].length; i++) {

            if (i%2 == 0)
               sum = sum+array[0][i] *
                       getDeterminant( getSubmatrix(array,1,i+1));
            else
                sum = sum + ( -1 * array[0][i] )*
                        getDeterminant( getSubmatrix(array,1,i+1));
        }
        return sum;
    }


}
