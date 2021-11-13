package com.bridgelabz;

public class UC3 {
    private String mood;

    public UC3(String mood) {
        this.mood = mood;
    }

    public UC3() {

    }

    public String validate() throws MoodAnalyserException{
        try {
            if (mood == null) {
                throw new MoodAnalyserException("Please provide proper mood");
            }
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
        UC3 mood1 = new UC3("I am in Sad Mood");
        UC3 mood2 = new UC3("I am in happy Mood");
        UC3 mood3 = new UC3();

        System.out.println(mood3.validate());


    }
}
