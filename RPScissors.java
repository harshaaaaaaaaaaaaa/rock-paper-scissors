
import java.util.*;
public class RPScissors {
    public static void main(String[] args) {
        int n1, n2;
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        s = scanner.nextLine();
        s = s.toLowerCase();
        if (s.equals("rock")) {
            n2 = 0;
        } else if (s.equals("paper")) {
            n2 = 1;
        } else if (s.equals("scissors")) {
            n2 = 2;
        } else {
            System.out.println("Invalid input! Please enter rock, paper, or scissors.");
            scanner.close();
            return;  
        }
        Random rand = new Random();
        n1 = rand.nextInt(3);
        System.out.print("System's choice: ");
        if (n1 == 0) {
            System.out.println("rock");
        } else if (n1 == 1) {
            System.out.println("paper");
        } else {
            System.out.println("scissors");
        }
        if (n1 == n2) {
            System.out.println("It's a tie!");
        } else if ((n1 == 0 && n2 == 1) || (n1 == 1 && n2 == 2) || (n1 == 2 && n2 == 0)) {
            System.out.println("User won!");
        } else {
            System.out.println("System won!");
        }
        scanner.close();
    }
}


