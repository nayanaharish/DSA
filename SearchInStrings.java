package org.example.DSA;

public class SearchInStrings {

    public static void main(String[] args) {

        String s = "Nayana";
        char c = 'y';
        System.out.println(findChar(s, c));

    }


    static boolean findChar(String word , char letter)
    {
        int i = 0;

        for (char c :word.toCharArray())
        {

            if (letter ==word.charAt(i))
            {
                return true;
            }
            i++;
        }
        return false;
    }
}

