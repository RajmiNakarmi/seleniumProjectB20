package com.cybertek.tests.day11_utils_review_actions;

public class Singleton {

    private Singleton(){}

    //making the String private so that we can only reach this using getter method
        private static String word;

    //Creating a'getter' method to allow users to reach private String above
    public static String getWord(){

        if(word == null){

            System.out.println("First time call. Word object is null" + "Assigning value to it");
            word = "something";
        }else{
            System.out.println("word already has value");
        }
        return word;
    }
    }


