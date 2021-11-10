package com.binarySearch;

import java.util.Arrays;

public class BS2dmatrix {
    public static void main(String[] args) {
        int [][] nums = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int target = 5;

        System.out.println(Arrays.toString(searchinMatrix(nums,target)));


    }

    static int[] binarySearch(int[][] matrix, int target,int row, int colStart,int colEnd){
        while(colStart <= colEnd){
            int mid = colStart + (colEnd - colStart)/2;

            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }else if(matrix[row][mid] > target){
                colEnd = mid ;
            }else{
                colStart = mid ;
            }
        }
        return  new int[] {-1,-1};
    }

    static  int[] searchinMatrix(int[][] matrix, int target){
        int rows = matrix.length;
        int columns = matrix[0].length;

        if(rows == 1){
            binarySearch(matrix,target,0,0,columns-1);
        }
        int rowStart = 0;
        int rowEnd = rows - 1;
        int columnsMid = columns / 2;
        while (rowStart < rowEnd - 1){
            int mid = rowStart + (rowEnd - rowStart)/2;
            if(matrix[mid][columnsMid]== target){
                return new int[]{mid,columnsMid};
            }else if(matrix[mid][columnsMid] > target){
                rowEnd = mid ;
            }else{
                rowStart = mid ;
            }
        }

        if(matrix[rowStart][columnsMid] == target){
            return new int[]{rowStart,columnsMid};
        }

        if(matrix[rowStart+1][columnsMid] == target){
            return  new int[]{rowStart + 1 , columnsMid};
        }

        if(target <= matrix[rowStart][columnsMid-1]){
            return binarySearch(matrix,target,rowStart,0,columnsMid-1);
        }

        if(target <= matrix[rowStart + 1][columnsMid-1]){
            return binarySearch(matrix,target,rowStart + 1,0,columnsMid-1);
        }

        if(target >= matrix[rowStart][columnsMid+1] && target <= matrix[rowStart][columns -1]){
            return binarySearch(matrix,target,rowStart,columnsMid+1,columns-1);
        }else{
            return binarySearch(matrix,target,rowStart + 1,columnsMid+1,columns-1);
        }




    }

}
