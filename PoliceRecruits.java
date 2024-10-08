import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of events
        int n = scanner.nextInt();
        int[] events = new int[n];
        
        // Read the events
        for (int i = 0; i < n; i++) {
            events[i] = scanner.nextInt();
        }
        
        int availableOfficers = 0;
        int untreatedCrimes = 0;
        
        // Process each event
        for (int event : events) {
            if (event == -1) {
                // A crime has occurred
                if (availableOfficers > 0) {
                    // If there is an officer available, assign them to the crime
                    availableOfficers--;
                } else {
                    // Otherwise, this crime goes untreated
                    untreatedCrimes++;
                }
            } else {
                // Recruits have been hired
                availableOfficers += event;
            }
        }
        
        // Output the number of untreated crimes
        System.out.println(untreatedCrimes);
        
        scanner.close();
    }
}

