package org.example.DSA;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class FindMInAndMAxNumber {
    public static void main(String[] args) {


        int arr [] = {2,1,5,2,3,4,8,90,1,44,5};
        System.out.println( "Min value is "+min(arr));
        System.out.println( "Max value is "+max(arr));

    }

    static int min(int [] arr)
    {
        int min = arr[0];

        for (int i = 0 ; i <= arr.length-1 ; i++)
        {
            if (min > arr[i])
            {
                min = arr[i];
            }
        }

        return min ;
    }

    static int max(int [] arr)
    {
        int max = arr[0];

        for (int i = 0 ; i <= arr.length -1 ; i++)
        {
            if (max < arr[i])
            {
                max = arr[i];
            }
        }

        return max ;
    }


}
