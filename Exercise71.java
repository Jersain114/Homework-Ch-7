import java.util.LinkedList;

public class Exercise71 {
    public static void main(String[] args) {

        LinkedList<String> team1 = new LinkedList<String>();
        team1.add("Cowboys");
        team1.add("Lakers");
        team1.add("Astros");

        LinkedList<String> team2 = new LinkedList<String>();
        team2.add("Spurs");
        team2.add("Mavericks");
        team2.add("Rangers");
        team2.add("Heat");

        LinkedList<LinkedList<String>> league = new LinkedList<LinkedList<String>>();
        league.add(team1);
        league.add(team2);

        System.out.println("team1: " + team1);
        System.out.println("team2: " + team2);
        System.out.println("league: " + league);
    }
}