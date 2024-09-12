package org.example.DSA;

public class FindTheEvenNumberOfDigits_Leetcode_1295 {


    public static void main(String[] args) {

        int [] nums = {12,0,345,2,6,7896,123456};
        System.out.println(findNumbers(nums));

    }


    public static int findNumbers(int[] nums) {
        int count = 0 ;

        for (int i = 0 ; i < nums.length ; i++)
        {
            int num = nums[i];
            int round = 0 ;
            while(num > 0)
            {
                
                num = num / 10 ;
                round++;
            }
            if (round > 1 && round % 2 == 0)
            {
                count++;
            }





        }

        return count;

    }
}
