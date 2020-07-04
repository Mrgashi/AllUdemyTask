import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Album album = new Album("Strombringer", "Deep Purple");
        album.addSong("StormBringer", 4.6);
        album.addSong("Hold on", 3.4);
        album.addSong("Holy man", 2.4);
        album.addSong("Lady double dealer", 2.4);
        album.addSong("You cant do it right", 5.9);
        album.addSong("High ball shooter", 3.5);
        album.addSong("The gypsy", 6.2);
        album.addSong("Soldier of fortune", 3.2);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("I put the finger on you", 5.44);
        album.addSong("Lets go", 3.25);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("C.O.D", 5.24);
        album.addSong("Breaking the rules", 3.44);
        album.addSong("night of the long knives", 5.12);
        album.addSong("For those about to rock", 5.12);
        album.addSong("Evil walks", 5.12);
        albums.add(album);


        LinkedList<Song> playlist = new LinkedList<Song>(); // since we now changed this to a Interface of List,
        // we can change the playlist to whatever kind of List
        // without breaking the code.
        albums.get(0).addToPlaylist("You cant do it right", playlist);
        albums.get(0).addToPlaylist("Holy man", playlist);
        albums.get(0).addToPlaylist("Speed king", playlist); // does not exist
        albums.get(1).addToPlayList(9, playlist);
        albums.get(1).addToPlayList(8, playlist);
        albums.get(1).addToPlayList(3, playlist);
        albums.get(1).addToPlayList(2, playlist);
        albums.get(1).addToPlayList(24, playlist); // does not exist

        play(playlist);

    }

    public static void play(LinkedList<Song> playlist) {
        boolean quit = false;
        boolean next = false;
        ListIterator<Song> songListIterator = playlist.listIterator();

        if (playlist.size() == 0) {
            System.out.println("No songs in this playlist!");
            return;
        } else {
            System.out.println("Now listening to " + songListIterator.next().toString());
            printOptions();
        }

        while (!quit) {
            int choise = scanner.nextInt();
            scanner.nextLine();

            switch (choise) {
                case 1:
                    System.out.println("Quitting");
                    quit = true;
                    break;
                case 2:
                    if (!next) {
                        if (songListIterator.hasNext()) {
                            songListIterator.next();
                        }
                        next = true;
                    }
                    if (songListIterator.hasNext()) {
                        System.out.println("Now listening to " + songListIterator.next().toString());
                    } else {
                        System.out.println("Playlist over");
                        next = false;
                    }
                    break;
                case 3:
                    if (next) {
                        if (songListIterator.hasPrevious()) {
                            songListIterator.previous();
                        }
                        next = false;
                    }
                    if (songListIterator.hasPrevious()) {
                        System.out.println("Now listening to " + songListIterator.previous().toString());
                    } else {
                        System.out.println("Starting playlist...");
                        next = true;
                    }
                    break;
                case 4:
                    printPlaylist(playlist);
                    break;
                case 5:
                    printOptions();
                    break;
                case 6:
                    if (next) {
                        if (songListIterator.hasPrevious()) {
                            System.out.println("Now playing " + songListIterator.previous().toString());
                            next = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (songListIterator.hasNext()) {
                            System.out.println("Now replaying " + songListIterator.next().toString());
                            next = true;
                        } else {
                            System.out.println("We are at the end of the playlist");
                        }
                    }
                    break;
                case 7:
                    if (playlist.size() > 0) {
                        songListIterator.remove();
                        if (songListIterator.hasNext()) {
                            System.out.println("Now playing " + songListIterator.next().toString());
                        } else if (songListIterator.hasPrevious()) {
                            System.out.println("Now playing " + songListIterator.previous().toString());
                        }
                    }
                    break;
            }
        }
    }
    private static void printPlaylist(List<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("================");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================");
    }

    private static void printOptions() {
        System.out.println("Available Options:\nPress " +
                "1 to Quit\n" +
                "2 to play next song.\n" +
                "3 to play previous song.\n" +
                "4 to list songs in Playlist.\n" +
                "5 to print Options.\n" +
                "6 to replay song.\n" +
                "7 to delete current song from playlist.");
    }
}
