package com.java.maven.MoodAnalyser;

public class MoodAnalyser
{
    private String message;

    /**
     * No Arguement Constructor
     */
    public MoodAnalyser() {

    }

    /**
     * Parameterised Constructor
     * @param message
     */
    public MoodAnalyser(String message) {
        this.message = message;
    }

    /**
     * ability to analyse  and Respond Happy or Sad
     * Call Anallyse Mood Function with Message as  parameter and return Happy or Sad Mood
     */

    public String analyzeMessage() {
        try {
            String msg=message.toLowerCase();
            if (msg.contains("sad")) {
                return "SAD";
            }else {
                return "HAPPY";
            }
        }catch(NullPointerException exception) {
            return "HAPPY";
        }
    }
}