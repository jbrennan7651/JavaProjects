package com.example.demo.learningstrings;

import java.util.Locale;
import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        var str = "Learn String Handling";
        var str2 = "LEARN STRING HANGLING";

        // 1) Using the string "Learn string handling": what index is the last letter in the string?
        System.out.println("Last letter in the Index: " + str.charAt((str.length()-1)));

        // 2) Using the same string as above, what character is located at the 10th index?
        System.out.println("10th Index: " + str.charAt(10));

        // 3)Do a check to see if the character at index 10 and 15 the same?
        if (str.charAt(10) == str.charAt(15)){
            System.out.println("Index 10 and 15 have the same letter");
        }
        else {
            System.out.println("Index 10 and 15 do not have the same letter");
        }

        // 4) Create a scenario that returns false if the character at the 0 index equals the 5 index
        boolean switcher;
        switcher = str.charAt(0) != str.charAt(5);
        System.out.println(switcher);

        boolean isTrue = false;


        if(str.equalsIgnoreCase(str2)){
            isTrue = true;
        }
        else{
            isTrue = false;
        }

        //substring()

        //toLowerCase()
        //toUpperCase()

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");

        var input = scanner.nextLine();

        //length()
        if(input.length() < 3){
            System.out.println("Please enter a longer string");
        }
        //equals()
        //equalsIgnoreCase()
        if(input.equals("Hello World") || input.equalsIgnoreCase("Hello World")){
            System.out.println("Be a little less creative");
        }

        //charAt()
        if(input.charAt(0) == input.charAt(input.length() - 1)){
            System.out.println("first and last letter are the same");
        }
        //contains()
        if(input.contains("Hello World".toLowerCase())){
            System.out.println(input += "Loser");
        }

        //substring()
        System.out.println("Quartered Strings: " + input.substring(0,input.length()/4));
        //startsWith
        if(input.startsWith("A")){
            System.out.println("First letter is A");
        }

        //endsWith
        if (input.endsWith(".")){
            System.out.println("good punctuation");
        }
        //toLowerCase()
        //toUpperCase()
        System.out.println(input.toLowerCase());
        System.out.println(input.toUpperCase());







    }


}
