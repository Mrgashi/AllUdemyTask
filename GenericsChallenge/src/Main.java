public class Main {
    public static void main(String[] args) {

        // Here the Leage is made of FootballTeams, this means in Champions league we cant add a volleball team.
        Leauge<Team<FootballTeam>> championsLeague = new Leauge<>("Champions League");

        Team<FootballTeam> liverpool = new Team<>("Liverpool");
        Team<FootballTeam> manu = new Team<>("Manchester United");
        Team<FootballTeam> ajax = new Team<>("Ajax");
        Team<FootballTeam> juventus = new Team<>("Juventus FC");

        championsLeague.addTeam(liverpool);
        championsLeague.addTeam(manu);
        championsLeague.addTeam(ajax);
        championsLeague.addTeam(juventus);

        championsLeague.matchResults(liverpool, manu, 2,1);

        // this is the NVA, national volleyball league, we cant add a football team here.
        Leauge<Team<VollyballTeam>> NVA = new Leauge<>("National Volleyball League");

        Team<VollyballTeam> turkey = new Team<>("Turkish Women's Volleyball Championship");
        Team<VollyballTeam> istanbul = new Team<>("Istanbul Women's Volleyball League");
        Team<VollyballTeam> slovenia = new Team<>("Slovenian Women's Volleyball League");
        Team<VollyballTeam> polish = new Team<>("Polish Women's Volleyball League");

        NVA.addTeam(turkey);
        NVA.addTeam(istanbul);
        NVA.addTeam(slovenia);
        NVA.addTeam(polish);
        //NVA.addTeam(liverpool);  NVA does not accept Liverpool as it is defined as a football type in line 7.




    }
}
