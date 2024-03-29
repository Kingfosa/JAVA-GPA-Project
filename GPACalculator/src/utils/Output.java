package utils;

import logic.TransformedScore;
import logic.PrintedGPACalculator;

public class Output {
//    public static double score = utils.CollectInfo.getCourseScore();
    public static void printCourseDetailsTable(String[] courseNames, int[] courseUnits,double[] courseScores, double[] courseGrades) {
        System.out.println("This is your Result:");
        printTableHeader();

        for (int i = 0; i < courseNames.length; i++) {
            System.out.format("| %-27s| %-21d | %-10s | %-19.2f |\n",
                    courseNames[i], courseUnits[i], TransformedScore.convertToLetterGrade(courseScores[i]), courseGrades[i]);
        }

        printTableFooter();
        double gpa = PrintedGPACalculator.calculatePrintedGpa(courseGrades, courseUnits);
        System.out.println("Your GPA is = " + String.format("%.2f", gpa) + " to 2 decimal places");
    }
    
    private static void printTableHeader() {
        System.out.println("|----------------------------|-----------------------|------------|---------------------|");
        System.out.println("| COURSE & CODE              | COURSE UNIT           | GRADE      | GRADE-UNIT          |");
        System.out.println("|----------------------------|-----------------------|------------|---------------------|");
    }

    private static void printTableFooter() {
        System.out.println("|---------------------------------------------------------------------------------------|");
    }
}
