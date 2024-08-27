package org.example;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int arr [] = {1,4,7,2,3,9,1,-1};
        System.out.println(findLinearSearch(arr, -1));


    }

    // doing the works assigned my manager
    // now the second task completed ,goint to push those changes 



    static int findLinearSearch(int arr[],int target)
    {

        if (arr.length > 0)
        {
            for (int index=0; index <= arr.length-1 ; index++)
            {
                if (target== arr[index])
                {
                    return index;
                }
            }
        }
        return -1;
    }
}