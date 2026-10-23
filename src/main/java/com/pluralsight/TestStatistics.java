package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int[] testScores = {99,97,80,78,59,84,79,68,88,100};

        System.out.println("Average test scores : " + getTestScoresAvg(testScores));
        System.out.println("Highest test score: " + getHighestTestScore(testScores));
        System.out.println("Lowest test score: " + getLowestTestScore(testScores));
        //Bonus : return median
        System.out.println("Median test score: " + getMedianTestScore(testScores));

    }
    public static double getTestScoresAvg(int[] testscores) {
        double avg = 0;

        for (double scores : testscores) {
            avg += scores;
        }

        avg /= testscores.length;

        return avg;
    }

    public static double getHighestTestScore(int[] testScores) {
        Arrays.sort(testScores);
        return testScores[testScores.length - 1];
    }

    public static double getLowestTestScore(int[] testScores) {
        Arrays.sort(testScores);
        return testScores[0];
    }

    public static double getMedianTestScore(int[] testScores) {
        Arrays.sort(testScores);
        return(testScores[(testScores.length / 2) - 1]);
    }
}

