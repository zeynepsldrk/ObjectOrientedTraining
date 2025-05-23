//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FootballPlayer alex = new FootballPlayer();
        alex.no = 10;
        alex.name = "Alex De Souza";
        alex.minutes = 0;
        alex.inPlay = true;
        alex.numberOfGoals = 0;

        alex.play(90);
        alex.score();
        alex.score();

        System.out.println("Number of goals Alex scored: " + alex.numberOfGoals);
        System.out.println("Alex played totally " + alex.minutes + " minutes so far.");
    }
}