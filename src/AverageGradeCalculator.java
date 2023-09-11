import java.util.Scanner;

public class AverageGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numGrades = 0;
        int currentInput = 0;

        System.out.println("List your grades below (0-100), type -1 to STOP.");

        do {
            currentInput = scanner.nextInt();
            if (currentInput == -1) { continue; }

            if (currentInput >= 0 && currentInput <= 100) {
                sum += currentInput;
                numGrades++;
            } else {
                System.out.println("That number isn't right.");
                continue;
            }
        } while (currentInput != -1);

        double average = (double)sum / numGrades;
        System.out.println("Your average grade is " + average + "%");
    }
}