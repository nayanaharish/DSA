package org.example.DSA;

public class SearchInRange {

    public static void main(String[] args) {

        int arr [] = {18,12,-7,3,4,6,1,28,45,9,12};

        int beg = 3 ;
        int end = 7 ;
        int target = 28 ;

        System.out.println(search(arr, beg, end ,target));

    }



    static boolean search(int arr [],int beg ,int end ,int target)
    {
        if (arr.length > 0)
        {
            for (int i = beg-1 ; i <= end -1 ; i++)
            {
                if (target == arr[i])
                {
                    return true;
                }
            }
        }

        return false;
    }
}
