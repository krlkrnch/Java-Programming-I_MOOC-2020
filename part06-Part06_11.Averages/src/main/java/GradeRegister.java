
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> examPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.examPoints.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public double averageOfPoints() {
        if (this.examPoints.isEmpty()) {   // (93 + 91 + 92) / 3
            return -1;
        }

        int points = this.examPoints.get(0); //93

        for (int i = 1; i < this.examPoints.size(); i++) {
            points = points + this.examPoints.get(i);  //93 + 91 + 92
        }

        return 1.0 * points / this.examPoints.size(); // 276 / 3

    }

    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }

        int gradeTotal = this.grades.get(0); // 5.0 
        for (int i = 1; i < grades.size(); i++) { // 1 < 4
            gradeTotal = gradeTotal + this.grades.get(i);   //i = 1 -> gradetotal + 5; i = 2 -> 10 + 5; i = 3 -> 15 + 4

        }
        return 1.0 * gradeTotal / this.grades.size();

    }

    public static int pointsToGrade(int points) {

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
        } else {
            grade = 5;
        }

        return grade;
    }
}
