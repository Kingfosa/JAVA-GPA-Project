package main;

import logic.TransformedScore;
import utils.Output;
import utils.CollectInfo;

public class GPACalculator {
    public static void main(String[] args) {
        int numberOfCourses = CollectInfo.getNumberOfCourses();

        String[] courseNames = new String[numberOfCourses];
        double[] courseScores = new double[numberOfCourses];
        double[] courseGrades = new double[numberOfCourses];
        int[] courseUnits = new int[numberOfCourses];

        int iterationCount = 1;
        for (int i = 0; i < numberOfCourses; i++) {
            System.out.println("Course #" + iterationCount++);
            courseNames[i] = CollectInfo.getCourseName();
            courseUnits[i] = CollectInfo.getCourseUnits();
            double score = CollectInfo.getCourseScore();
            courseScores[i] = score;

            
//            work on course score
            double numericGrade = TransformedScore.convertToNumericGrade(score);
            courseGrades[i] = numericGrade;
        }
        Output.printCourseDetailsTable(courseNames, courseUnits, courseScores, courseGrades);
    }
}