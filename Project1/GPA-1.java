import java.util.Scanner;
public class GPA { 
    static String[] possibleGrades = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-","D+", "D", "F"};
    static String[] gradeScale = {"4.0", "3.7", "3.3", "3.0", "2.7", "2.3", "2.0", "1.7", "1.3", "1.0","0.0"};
    public static boolean courseNumInputChecker(int num) {
        if ((num <= 20) && (num > 0)) {
            return true;
        }
        else {
            System.out.println("Can't have more than 20 courses or invalid input.");
        }
        return false;
    }
    public static void displayRefScale() {
        System.out.println("Here is the gpa reference scale");
        System.out.println("Grade \tScale");
        for (int i = 0; i < 11; i++) {
            System.out.println(possibleGrades[i] + "\t" + gradeScale[i]);
        }
    }
    public static boolean greaterThanTwelve(double totalUnits) {
        if (totalUnits >= 12) {
            return true;
        }
        System.out.println("Total units must be at least 12 in order to calculate GPA.");
         
        return false;
    }
    public static void displayTransNoGrades(double units[], double points[]) { 
        System.out.println("Units \tGrades");
        for (int i = 0; i < units.length; i++) {
            System.out.println(units[i] + "\t" + points[i]);
        }
    }
    public static String[] convertPointsToLetters(double gradePoints[]) {
        String letterGrades[] = new String[gradePoints.length];
        for (int i = 0; i < gradePoints.length; i++) {
            if (gradePoints[i] >= 4.0) {
                letterGrades[i] = "A";
            }
            else if (gradePoints[i] >= 3.7) {
                letterGrades[i] = "A-";
            }
            else if (gradePoints[i] >= 3.3) {
                letterGrades[i] = "B+";
            }
            else if (gradePoints[i] >= 3.0) {
                letterGrades[i] = "B";
            }
            else if (gradePoints[i] >= 2.7) {
                letterGrades[i] = "B-";
            }
            else if (gradePoints[i] >= 2.3) {
                letterGrades[i] = "C+";
            }
            else if (gradePoints[i] >= 2.0) {
                letterGrades[i] = "C";
            }
            else if (gradePoints[i] >= 1.7) {
                letterGrades[i] = "C-";
            }
            else if (gradePoints[i] >= 1.3) {
                letterGrades[i] = "D+";
            }
            else if (gradePoints[i] >= 1.0) {
                letterGrades[i] = "D";
            }
            else if (gradePoints[i] >= 0.7) {
                letterGrades[i] = "D-";
            }
            else if (gradePoints[i] >= 0.0) {
                letterGrades[i] = "F";
            }
        }
        return letterGrades;
    }
    public static void displayTransLetters(double units[], String letters[]) { 
        System.out.println("Units \tGrades");
        for (int i = 0; i < units.length; i++) {
            System.out.println(units[i] + "\t" + letters[i]);
        }
    }
    public static double pointSum(double points[], double units[]) {
        double sum = 0;
        for (int i = 0; i < points.length; i++) {
            sum += (points[i] * units[i]);
        }
        return sum;
    }
    public static double unitSum(double units[], int numClasses) {
        double sum = 0;
        for (int i = 0; i < numClasses; i++) {
            sum += units[i];
        }
        return sum;
    }
    public static double calcGPA(double numerator, double denominator) {
        double gpa = numerator / denominator;
        return gpa;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalUnits;
        System.out.println("How many classes are you taking?  (1-20) ");
        int numCourses = input.nextInt();
        if (!courseNumInputChecker(numCourses)) {
            System.out.println("Resetting...");
            System.out.println();
            main(args);
        }
        double[] gradePoints = new double[numCourses];
        double[] numUnits = new double[numCourses];
        displayRefScale();
        System.out.println("Please enter the grades");
        for (int i = 0; i < numCourses; i++) {
            numUnits[i] = input.nextDouble();
            gradePoints[i] = input.nextDouble();
        }
        totalUnits = unitSum(numUnits, numCourses);
        if (!greaterThanTwelve(totalUnits)) {
            System.out.println("Resetting...");
            System.out.println();
            main(args);
        }
        String[] letterGrades = convertPointsToLetters(gradePoints);
        System.out.println();
        System.out.println("Do you want to see your transcript? (y or n)");
        String choice = input.next();
        if (choice.charAt(0) == 'y' || choice.charAt(0) == 'Y') {
            System.out.println("Do you want to see Letter Grades? (y or n)");
            choice = input.next();
            if (choice.charAt(0) == 'y' || choice.charAt(0) == 'Y') {
                displayTransLetters(numUnits, letterGrades);
            }
            else {
                displayTransNoGrades(numUnits, gradePoints);
            }
        }
        System.out.println();
        System.out.println("Your GPA is " + (double)(int)((calcGPA(pointSum(gradePoints, numUnits), totalUnits)*100))/100);
        input.close();
    }
}
