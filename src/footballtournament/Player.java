package footballtournament;

public class Player {

    private String playerName;
    private int playerAge;
    private String position;
    private Team team;

    public Player() {
    }

    public Player(String playerName, int playerAge, String position, Team team) {
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.position = position;
        this.team = team;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", playerAge=" + playerAge +
                ", position='" + position + '\'' +
                ", team=" + team +
                '}';
    }
}
