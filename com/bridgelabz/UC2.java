package com.bridgelabz;

public class UC2 {
    private String mood;

    public UC2(String mood) {
        this.mood = mood;
    }

    public UC2() {
    }

    public String validate() throws MoodAnalyserException{
        try {
            if (mood == "I am in Sad Mood") {
                throw new MoodAnalyserException("SAD");
            }
            if (mood == "I am in happy Mood") {
                throw new MoodAnalyserException("HAPPY");
            }
        } catch (NullPointerException e) {
            System.out.println("HAPPY");
        }
        return "";
    }

    public static void main(String args[]) throws MoodAnalyserException {
        UC2 mood1 = new UC2("I am in Sad Mood");
        UC2 mood2 = new UC2("I am in happy Mood");
        UC2 mood3 = new UC2();

        System.out.println(mood3.validate());
    }
}
