package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String str) {
        String firstword = str.substring(0, 1);
        String afterfirstword = str.substring(1);
        return firstword.toUpperCase() + afterfirstword;
    }

    public String generateInitials(String firstName, String lastName) {
        String initials = firstName.substring(0, 1) + "." + lastName.substring(0, 1);
        return initials;
    }

    public double addVat(double originalPrice, double vatRate) {
        double inputtax = ((vatRate / 100) * originalPrice);
        double Margin = inputtax + originalPrice;
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(Margin));

    }

    public String reverse(String sentence) {
        StringBuilder sb = new StringBuilder(sentence);
        String reverseWord = sb.reverse().toString();
        return reverseWord;
    }

    public int countLinuxUsers(List<User> users) {
        int linuxUsercount = 0;
        for (User user : users) {
            if (user.getType().equalsIgnoreCase("Linux")) {
                linuxUsercount++;
            }
        }
        return linuxUsercount;
    }
}
