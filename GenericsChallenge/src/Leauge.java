import java.util.LinkedList;
import java.util.ListIterator;

public class Leauge<T extends Team> {

    private String name;
    private LinkedList<T> teams = new LinkedList<>();
    private LinkedList<T> rankedList = new LinkedList<>();

    public Leauge(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println("This " + team.getName() + " is already in the League");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " advanced to this League " + this.name);
            return true;
        }
    }

    public int numOfTeamsInLeague() {
        return this.teams.size();
    }

   public void matchResults (T firstTeam, T secondTeam, int firstTeamScore, int secondTeamScore) {
        if (firstTeamScore > secondTeamScore) {
            firstTeam.setWon();
            secondTeam.setLose();
        } else if (firstTeamScore < secondTeamScore) {
            firstTeam.setLose();
            secondTeam.setWon();
        } else {
            firstTeam.setTie();
            secondTeam.setTie();
        }
        setPoint(firstTeam);
        setPoint(secondTeam);
   }

    private void setPoint(T team) {
        team.setScore((team.getWon()*2) + (team.getTie()));
    }

    public void printTheLeague(T team) {
        ListIterator<T> listIterator = this.teams.listIterator();
        while (listIterator.hasNext()) {
            rankTeams(listIterator.next(), this.rankedList);
        }
        System.out.println(rankedList);
    }

    private boolean rankTeams(T team, LinkedList<T> list) {
        ListIterator<T> listIterator = (ListIterator<T>) list.iterator();

        while (listIterator.hasNext()) {
            int compariosn = team.getScore() - listIterator.next().getScore();
            if (compariosn > 0) {
                listIterator.previous();
                listIterator.add(team);
                return true;
            } else if (compariosn == 0 ) {
                listIterator.add(team);
                return true;
            } else {

            }
        }
        listIterator.add(team);
        return false;
    }

}
