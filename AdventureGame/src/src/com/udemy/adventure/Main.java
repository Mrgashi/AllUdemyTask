package src.com.udemy.adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        // write your code here

        Map<String, Integer> tempExit = new HashMap<>();
        locations.put(0, new Location(0, "You are sitting in front of the computer learning to code", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing in front of a road before a small brick bulding", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for small spring", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley besides a stream", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest", tempExit));


        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are: ");

            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }

            // Using findDirection method made.
            String direction = findDirection(scanner.nextLine().toUpperCase());

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("you cannot go in that direction");
            }

            if (!locations.containsKey(loc)) {
                System.out.println("You cannot go to that direction");
            }
        }

        // alternative way to do check if contains directions by using a map.
        // adding vocabulary to check in a HashMap();
        // and checking via the directions scanner.
        // Map<String, String> vocabulary = new HashMap<>();
        // vocabulary.put("Quit", "Q");
        // vocabulary.put("WEST", "W");
        // vocabulary.put("EAST", "E");
        // vocabulary.put("SOUTH", "S");
        // vocabulary.put("NORTH", "N");


        // String directions = scanner.nextLine().toUpperCase();
        // if (directions.length() > 1) {
        //     String[] words = directions.split(" ");
        //     for (String word : words) {
        //         if (vocabulary.containsKey(word)) {
        //             directions = vocabulary.get(word);
        //             break;
        //         }
        //     }
        // }

    }

    public static String findDirection(String text) {
        if (text.toUpperCase().contains("WEST") || text.equals("W")) {
            return "W";
        }
        if (text.toUpperCase().contains("EAST") || text.equals("E")) {
            return "E";
        }
        if (text.toUpperCase().contains("SOUTH") || text.equals("S")) {
            return "S";
        }
        if (text.toUpperCase().contains("NORTH") || text.equals("N")) {
            return "N";
        }
        if (text.toUpperCase().contains("QUIT") || text.equals("Q")) {
            return "Q";
        }
        return "Cannot go in that direction";
    }
}
