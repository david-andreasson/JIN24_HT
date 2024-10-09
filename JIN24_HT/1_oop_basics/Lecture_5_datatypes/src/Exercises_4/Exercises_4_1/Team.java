package Exercises_4.Exercises_4_1;

public class Team {
    private Player[] players;
    private int playerCount;

    public Team(int size) {
        players = new Player[size];
        playerCount = 0;
    }

    public void addPlayer(Player player) {
        if (playerCount < players.length) {
            players[playerCount] = player;
            playerCount++;
        }
    }

    public void listPlayers() {
        for (int i = 0; i < playerCount; i++) {
            System.out.println(players[i].getName());
        }
    }
}
