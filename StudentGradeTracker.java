import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> subject = new ArrayList<>();
        ArrayList<double[]> grades = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter student name: ");
                    names.add(scanner.nextLine());

                    System.out.print("Enter subject name: ");
                    subject.add(scanner.nextLine());

                    double[] studentGrades = new double[3];
                    System.out.print("Enter grade 1: ");
                    studentGrades[0] = scanner.nextDouble();

                    System.out.print("Enter grade 2: ");
                    studentGrades[1] = scanner.nextDouble();

                    System.out.print("Enter grade 3: ");
                    studentGrades[2] = scanner.nextDouble();

                    grades.add(studentGrades);
                }

                case 2 -> {
                    System.out.println("\nStudent Data:");
                    for (int i = 0; i < names.size(); i++) {
                        for (int j = 0; j< subject.size();j++) {
                            double[] studentGradesArray = grades.get(i);
                            double average = (studentGradesArray[0] + studentGradesArray[1] + studentGradesArray[2]) / 3;
                            System.out.printf("Name: %s,Subject: %s,Grades: %.2f, %.2f, %.2f, Average: %.2f%n",
                                    names.get(i),subject.get(j), studentGradesArray[0], studentGradesArray[1], studentGradesArray[2], average);
                            
                        }
                    }
                }

                case 3 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }
}
