import java.util.Scanner;
public class SoulmateFinder {
    public static boolean overlappingJourneys(int start1, int end1, int start2, int end2) {

    if ((end2 > start1) && (end1 > start2))
        return true;
    else
        return false;
    }


    public static int getTravellers(int startoftravel, int endoftravel) {
    
    Scanner kbd = new Scanner(System.in);
    System.out.println("Enter the overall number of travellers on the train:");
    int travellers = kbd.nextInt();
    int found = 0;
    
    
    for (int i = 1; i <= travellers; i++) {
    
        System.out.println("Enter the traveller's name:");
        String name = kbd.next();

        System.out.println("Enter the boarding station:");
        int boarding = kbd.nextInt();

        System.out.println("Enter the exit station:");
        int exit = kbd.nextInt();
        
        boolean matching = overlappingJourneys(startoftravel, endoftravel, boarding, exit) ;
        
        if (matching == true) {
            System.out.println(name + " might be the soulmate.");
            found ++;
        }else{
            System.out.println(name + " is not the soulmate.");
            }
            
    }
    
        return found;
    }
    
    public static void main (String[] args){
    Scanner kbd = new Scanner(System.in);
    
    System.out.println("Where did your journey start? ");
    int startofjourney = kbd.nextInt();
    
    System.out.println("Where did your journey end? ");
    int endofjourney = kbd.nextInt();
    
    int potentialmatching = getTravellers(startofjourney, endofjourney);
    System.out.println("Number of potential soulmates: " + potentialmatching);
    
    
    }
    

    public static boolean overlappingLongJourneys(int start1, int end1, int start2, int end2, int overlap) {
    
    boolean overlapping = false;
    int min = Math.min(end1, end2);
    int max = Math.max(start1, start2);
    int numbers = min - max;
    if (numbers >= overlap){
        overlapping = true;
        }
    return overlapping;
    }
} 

