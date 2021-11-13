package com.bridgelabz;

public class UC1 {

    static void validate(String message) throws MoodAnalyserException {
        if (message == "I am in Sad Mood") {
            throw new MoodAnalyserException("sad");
        }
      else if (message == "I am in any Mood") {
            throw new MoodAnalyserException("happy");
        }
        else {
            System.out.println("Welcome to custom exception");
        }
    }

    public static void main(String args[])
    {
        try {
            validate("I am in Sad Mood");
        }
        catch (MoodAnalyserException e) {
            e.printStackTrace();
            System.out.println("Exception occured: "+e);
        }

        try {
            validate("I am in any Mood");
        }
        catch (MoodAnalyserException e) {
            e.printStackTrace();
            System.out.println("Exception occured: "+e);
        }

    }

}
