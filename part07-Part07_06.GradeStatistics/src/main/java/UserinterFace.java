
import java.util.Scanner;

public class UserinterFace {

    private PointAverages average;
    private Scanner scanner;

    public UserinterFace(PointAverages averages, Scanner scanner) {
        this.average = averages;
        this.scanner = scanner;

    }

    public void start() {
        readPoints();
        System.out.println("");
        printAllPoints();
        printPassingPoints();
        printPassPercentage();
        printGradeDistribution();
    }

    public void readPoints() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {

            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1) {
                break;

            }
            if (points < 0 || points > 100) {
                continue;
            }
//      

            this.average.addPoints(points);

        }

    }

    public void printAllPoints() {
        System.out.println("Point average (all): " + average.calculateAllPoints());

    }

    public void printPassingPoints() {
        String nonPassed = "-";

        if (average.calculatePassingPoints() == 0 || average.calculatePassingPoints() < 0) {
            System.out.println("Point average (passing): " + nonPassed);
        } else {
            System.out.println("Point average (passing): " + average.calculatePassingPoints());
        }

    }

    public void printPassPercentage() {

        System.out.println("Pass percentage: " + average.passPercentage());

    }

    public void printGradeDistribution() {
        int grade = 5;
        System.out.println("Grade distribution:");
        while (grade >= 0) {

            int stars = average.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }

    }

    public void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

}
