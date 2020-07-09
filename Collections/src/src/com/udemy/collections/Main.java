package src.com.udemy.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Theatre colosseum = new Theatre("Colosseum", 8, 12);

        if (colosseum.reserveSeat("D12")) {
            System.out.println("Please pay for A0");
        } else {
            System.out.println("Seat already reserved");
        }

        if (colosseum.reserveSeat("B13")) {
            System.out.println("Please pay for A0");
        } else {
            System.out.println("Seat already reserved");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(colosseum.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(colosseum.getSeats());
        priceSeats.add(colosseum.new Seat("B00", 13.00));
        priceSeats.add(colosseum.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $ " + seat.getPrice());
        }
        System.out.println();
        System.out.println("===============================");
    }
//    // Slower than a inbuilt collection sort.
//    public static void sortList(List<? extends Theatre.Seat> list) {
//        for (int i = 0; i < list.size() - 1; i++) {
//            for (int j = i+1; j < list.size(); j++) {
//                if (list.get(i).compareTo(list.get(j)) > 0) {
//                    Collections.swap(list, i,j);
//                }
//            }
//        }
//    }
}
