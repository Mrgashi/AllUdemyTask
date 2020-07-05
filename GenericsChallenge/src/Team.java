public class Team<T extends Team>{

    private String name;
    private int won = 0;
    private int lose = 0;
    private int tie = 0;
    private int score = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWon() {
        return won;
    }

    public void setWon() {
        this.won ++;
    }

    public int getLose() {
        return lose;
    }

    public void setLose() {
        this.lose ++;
    }

    public int getTie() {
        return tie;
    }

    public void setTie() {
        this.tie ++;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", won=" + won +
                ", lose=" + lose +
                ", tie=" + tie +
                ", score=" + score +
                '}';
    }
}
