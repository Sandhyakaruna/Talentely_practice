import java.util.LinkedList;
import java.util.Scanner;

public class HouseCaptainSelector {

    public static int selectHouseCaptain(int n) {
        LinkedList<Integer> contestants = new LinkedList<>();
        
        // Fill the list with contestants from 1 to n
        for (int i = 1; i <= n; i++) {
            contestants.add(i);
        }
        
        // Alternating between left to right and right to left sieving process
        boolean leftToRight = true;
        
        while (contestants.size() > 1) {
            LinkedList<Integer> remaining = new LinkedList<>();
            
            if (leftToRight) {
                for (int i = 1; i < contestants.size(); i += 2) {
                    remaining.add(contestants.get(i));
                }
            } else {
                for (int i = contestants.size() - 2; i >= 0; i -= 2) {
                    remaining.addFirst(contestants.get(i));
                }
            }
            
            // Prepare for next round
            contestants = remaining;
            leftToRight = !leftToRight; // Switch the direction
        }
        
        // The last remaining contestant is the house captain
        return contestants.getFirst();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of housemates: ");
        int n = scanner.nextInt();
        System.out.println("The house captain is contestant: " + selectHouseCaptain(n));
    }
}
