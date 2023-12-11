package logic;

public class PrintedGPACalculator {
    public static double calculatePrintedGpa(double[] grades, int[] units) {
        double totalPoints = 0.0;
        int totalUnits = 0;
        for (int i = 0; i < grades.length; i++) {
            totalPoints += grades[i] * units[i];
            totalUnits += units[i];
        }
        
        return totalPoints / totalUnits;
    }
}