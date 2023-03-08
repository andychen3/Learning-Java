import java.util.ArrayList;

public class Grades {
    private int sum;
    private ArrayList<Integer> grades;
    private ArrayList<Integer> gradePoints;
    private ArrayList<Integer> passingGrades;

    public Grades() {
        this.sum = 0;
        this.grades = new ArrayList<>();
        this.gradePoints = new ArrayList<>();
        this.passingGrades = new ArrayList<>();
    }

    public void add(int points) {
        if (points >= 0 && points <= 100) {
            this.sum += points;
            grades.add(points);
            passingGradeRequirements(points);
            this.gradePoints.add(pointsToGrade(points));
        }
    }

    public double findAverage() {
        return (sum / grades.size());
    }

    public void passingGradeRequirements(int points) {
        if (points >= 50) {
            passingGrades.add(points);
        }
    }

    public double passingGradeAverage() {
        int sum = 0;
        if (passingGrades.size() > 0) {
            for (int point: passingGrades) {
                sum += point;
            }
            return ((double) sum / passingGrades.size());
        }
        return 0.0;
    }

    public double passPercentage() {
        return ((100 * ((double) passingGrades.size() / (double) grades.size())));
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

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
        
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.gradePoints) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }
}
