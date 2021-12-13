package com.techreturners.exercise005;

public class Exercise005 {
    public boolean isPangram(String input) {
        //String str = "The quick brown fox jumps over the lazy dog";
        boolean[] alphaList = new boolean[26];
        int index = 0;
        int flag = 1;
        for (int i = 0; i < input.length(); i++) {
            if ( input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                index = input.charAt(i) - 'A';
            }else if( input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                index = input.charAt(i) - 'a';
            }
            alphaList[index] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (!alphaList[i])
                flag = 0;
        }

        if (flag == 1)
            System.out.print("\nThe above string is a pangram.");
        else
            System.out.print("\nThe above string is not a pangram.");
        return true;
    }

}
