
import java.util.ArrayList;

public class PointAverages {

    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;
    private ArrayList<Integer> grades;

    public PointAverages() {
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
        this.grades = new ArrayList<>();

    }

    public void addPoints(int points) {

        this.grades.add(pointsToGrade(points));

        this.points.add(points);

        if (points >= 50) {
            this.passingPoints.add(points);
        }

    }

    public int pointsToGrade(int points) {

        int grade = 0;

        if (points < 50) {
            grade = 0;

        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else if (points <= 100) {
            grade = 5;
        }

        return grade;

    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (Integer received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public double calculateAllPoints() { //calculating all points
        if (this.points.isEmpty()) {
            return -1;
        }

        int average = 0;

        for (Integer i : points) {
            average = average + i;

        }

        return 1.0 * average / this.points.size();

    }

    public double calculatePassingPoints() { //calculating passing points
        if (passingPoints.isEmpty()) {
            return -1;

        }

        int total = 0;

        for (Integer i : passingPoints) {
            total = total + i;
        }

        return 1.0 * total / this.passingPoints.size();

    }

    public double passPercentage() {

        if (this.points.isEmpty()) {
            return 0.0;
        }

        return 100.0 * passingPoints.size() / points.size(); //100.0 = 100 * (double) ..;
    }

}
