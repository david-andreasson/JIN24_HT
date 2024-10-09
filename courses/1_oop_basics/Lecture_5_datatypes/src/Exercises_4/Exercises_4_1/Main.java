package Exercises_4.Exercises_4_1;

public class Main {
    public static void main(String[] args) {


        Team team = new Team(3);
        team.addPlayer(new Player("Bobby"));
        team.addPlayer(new Player("Krang"));
        team.addPlayer(new Player("Blitz"));

        team.listPlayers();
    }
}
