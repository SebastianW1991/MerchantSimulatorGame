package pl.central;

public class Player {
    private String playerName;
    protected double playerWealth;

    public double getPlayerWealth() {
        return 20.50;
    }

    public void setPlayerWealth(double playerWealth) {
        this.playerWealth = playerWealth;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
