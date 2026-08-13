
import java.util.Scanner;

class Student {

    String name;
    String courseName;
    int completedTopics;
    int questionSolved;

    void setDetail(String name, String courseName) {
        this.name = name;
        this.courseName = courseName;
    }

    void setProgress(int completedTopics, int questionSolved) {
        this.completedTopics = completedTopics;
        this.questionSolved = questionSolved;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Course Name: " + courseName);
    }

    void displayProgress() {
        System.out.println("CompletedTopics: " + completedTopics);
        System.out.println("Question Solved: " + questionSolved);
    }

    void addTopics(int newTopicsCompleted) {
        this.completedTopics += newTopicsCompleted;
    }

    void addQuestions(int newQuestionsSolved) {
        this.questionSolved += newQuestionsSolved;
    }

}

public class StudentApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student s = new Student();

        System.out.println("===============================");
        System.out.println("   STUDENT PRACTICE TRACKER");
        System.out.println("===============================");

        System.out.println();
        System.out.println("Enter Student Name:");
        String name = scanner.nextLine();

        System.out.println();
        System.out.println("Enter Course Name:");
        String courseName = scanner.nextLine();

        System.out.println();
        System.out.println("Enter Completed Topics:");
        int completedTopics = scanner.nextInt();

        System.out.println();
        System.out.println("Enter Questions Solved:");
        int questionSolved = scanner.nextInt();

        s.setDetail(name, courseName);
        s.setProgress(completedTopics, questionSolved);

        while (true) {
            System.out.println();
            System.out.println("===============================");
            System.out.println("           MENU");
            System.out.println("===============================");

            System.out.println();
            System.out.println("1. View Student Details");
            System.out.println("2. View Progress");
            System.out.println("3. Add Completed Topics");
            System.out.println("4. Add Solved Questions");
            System.out.println("5. Exit");

            System.out.println();
            System.out.println("Enter your choice:");
            int ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    s.displayDetails();
                    break;

                case 2:
                    s.displayProgress();
                    break;

                case 3:
                    System.out.println("How many new topics did you complete?");
                    int topics = scanner.nextInt();
                    s.addTopics(topics);
                    System.out.println("Completed Topics: " + s.completedTopics);
                    break;

                case 4:
                    System.out.println("How many new questions did you solve?");
                    int questions = scanner.nextInt();
                    s.addQuestions(questions);
                    System.out.println("Questions Solved: " + s.questionSolved);
                    break;

                case 5:
                    System.out.println("Thank You for using Student Practice Tracker");
                    return;

                default:
                    System.out.println("Invalid choice. Please enter value between 1 and 5.");
                    System.out.println("Keep Practicing");
            }
        }
    }
}
