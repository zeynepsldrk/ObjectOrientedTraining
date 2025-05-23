public class FootballPlayer {

    public String name;
    public int minutes;
    public boolean inPlay;
    public int numberOfGoals;
    public int no;

    public void play(int minutesToPlay) {
        minutes = minutes + minutesToPlay;
    }
    public void score() {
        numberOfGoals = numberOfGoals + 1;
    }
}