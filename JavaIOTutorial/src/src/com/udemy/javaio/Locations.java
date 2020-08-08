package src.com.udemy.javaio;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {
    private static final Map<Integer, Location> locations = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {

        //    try (DataOutputStream locFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")))) {
        //        for (Location location : locations.values()) {
        //            locFile.writeInt(location.getLocationID());
        //            locFile.writeUTF(location.getDescription());
        //            System.out.println("Writing locations " + location.getLocationID() + " : " + location.getDescription());
        //            System.out.println("Writing " + (location.getExits().size() - 1) + " exits.");
        //            locFile.writeInt(location.getExits().size() - 1);
        //            for (String direction : location.getExits().keySet()) {
        //                if (!direction.equalsIgnoreCase("Q")) {
        //                    System.out.println("\t\t" + direction + ", " + location.getExits().get(direction));
        //                    locFile.writeUTF(direction);
        //                    locFile.writeInt(location.getExits().get(direction));
        //                }
        //            }
        //        }
        //    }
        /*
         * this is so much cleaner than the above, this is because we have made locations serializable
         */
        try (ObjectOutputStream locFile = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")))) {
            for (Location location : locations.values()) {
                locFile.writeObject(location);
            }
        }
    }

    // static initialization of locations block
    // 1. The first four bytes will contain the number of locations (bytes 0-3)
    // 2. The next four bytes will contain the start offset of the locations section (bytes 4-7)
    // 3. The next section of the file will contain the index ( the index is 1692 bytes long. It will start at byte 8 and end at byte 1699)
    // 4. The final section of the file will contain the location records ( the data ). It will start at byte 1700.

    static {
        try (ObjectInputStream locFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("locations.dat")))) {
            boolean endOfFile = false;
            while (!endOfFile) {
                try {
                    Location location = (Location) locFile.readObject();
                    System.out.println("Read location" + location.getLocationID() + " : " + location.getDescription());
                    System.out.println("Found: " + location.getExits().size() + "exits");

                    locations.put(location.getLocationID(), location);
                } catch (EOFException e) {
                    endOfFile = true;
                }
            }
        } catch (InvalidClassException invalidClassException) {
            System.out.println("Cant find ClassPath?" + invalidClassException.getMessage());
        } catch (IOException io) {
            System.out.println("IO Exception!" + io.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exeption" + e.getMessage());
        }

        //    while (!endOfFile) {
        //        try {
        //            Map<String, Integer> exits = new LinkedHashMap<>();
        //            int locID = locFile.readInt();
        //            String descritption = locFile.readUTF();
        //            int numExits = locFile.readInt();
        //            System.out.println("Read location" + locID + " : " + descritption);
        //            System.out.println("Found" + numExits + " exits");
        //            for (int i = 0; i < numExits; i++) {
        //                String direction = locFile.readUTF();
        //                int destination = locFile.readInt();
        //                exits.put(direction, destination);
        //                System.out.println("\t\t" + direction + "," + destination);
        //            }
        //            locations.put(locID, new Location(locID, descritption, exits));
        //        } catch (EOFException e) {
        //            endOfFile = true;
        //        }
        //    }
        try (BufferedReader dirfile = new BufferedReader(new FileReader("directions_big.txt"))) {
            String input;
            while ((input = dirfile.readLine()) != null) {
                String[] data = input.split(",");
                int loc = Integer.parseInt(data[0]);
                String directions = data[1];
                int destination = Integer.parseInt(data[2]);
                System.out.println(loc + ": " + directions + ": " + destination);
                Location location = locations.get(loc);
                location.addExit(directions, destination);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsKey(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {
    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
