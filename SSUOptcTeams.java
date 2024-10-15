import java.util.Scanner;

public class SSUOptcTeams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of students and the minimum number of additional participations required
        int n = scanner.nextInt();  // Number of students
        int k = scanner.nextInt();  // Minimum number of additional times a team should participate
        
        // Input the number of times each student has already participated
        int[] participationCounts = new int[n];
        for (int i = 0; i < n; i++) {
            participationCounts[i] = scanner.nextInt();
        }
        
        // Count the number of students who can still participate at least 'k' more times
        int eligibleStudents = 0;
        for (int i = 0; i < n; i++) {
            if (participationCounts[i] <= 5 - k) {
                eligibleStudents++;
            }
        }
        
        // The maximum number of teams that can be formed is the number of eligible students divided by 3
        int maxTeams = eligibleStudents / 3;
        
        // Output the result
        System.out.println(maxTeams);
        
        scanner.close();
    }
}
