import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //ArrayList<Integer> items = getIntegers();

        //printObjects(items);

        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer dow = new FootballPlayer("Dow");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        BaseballPlayer simon = new BaseballPlayer("Simon");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        SoccerPlayer henry = new SoccerPlayer("Henry");

        Team<FootballPlayer> adeleideCrow = new Team<>("Adeleide Crow");
        adeleideCrow.addPlayer(joe);

        Team<FootballPlayer> downUnder = new Team<>("DownUnder");
        downUnder.addPlayer(dow);

        Team<BaseballPlayer> newYorkSocks = new Team<>("Ny SOCKS!");
        newYorkSocks.addPlayer(pat);

        Team<BaseballPlayer> chicago = new Team<>("Chicago");
        chicago.addPlayer(simon);

        Team<SoccerPlayer> manu = new Team<>("Manchester United");
        manu.addPlayer(beckham);

        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");
        liverpool.addPlayer(henry);

        newYorkSocks.matchResult(chicago, 3,4);
        adeleideCrow.matchResult(downUnder, 3,2);

        manu.matchResult(liverpool, 2,3);
        newYorkSocks.matchResult(chicago, 2,1);


        System.out.println("Rankings: ");
        System.out.println(adeleideCrow.getTeamName() + ": " + adeleideCrow.ranking());
        System.out.println(manu.getTeamName() + ": " + manu.ranking());
        System.out.println(downUnder.getTeamName() + ": " + downUnder.ranking());
        System.out.println(newYorkSocks.getTeamName() + ": " + newYorkSocks.ranking());
        System.out.println(chicago.getTeamName() + ": " + chicago.ranking());
        System.out.println(liverpool.getTeamName() + ": " + liverpool.ranking());


        System.out.println(adeleideCrow.compareTo(downUnder));
        System.out.println(downUnder.compareTo(adeleideCrow));


    }

    private static ArrayList<Integer> getIntegers() {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        return items;
    }

    private static void printObjects(ArrayList<Integer> items) {
        for (int i : items) {
            System.out.println(i * 2);
        }
    }
}
