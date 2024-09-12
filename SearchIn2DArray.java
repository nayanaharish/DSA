package org.example.DSA;

import java.util.Arrays;

import static java.lang.Integer.MAX_VALUE;

public class SearchIn2DArray {

    public static void main(String[] args) {

        int [][] twoDArray= {

                {2,3,4,},
                {5,3,4,5,6},
                {8,9,0},
                {10,11}
        };

        System.out.println(Arrays.toString(searchItem(twoDArray, 10)));

    }

    static int[] searchItem(int [][] arr , int target)
    {
        for (int i = 0 ; i < arr.length ; i++ )
        {
            for (int j = 0 ; j < arr[i].length ; j++)
            {
                if (target == arr[i][j])
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
