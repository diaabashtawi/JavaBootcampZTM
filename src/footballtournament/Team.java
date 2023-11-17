package footballtournament;

public class Team {

    private String teamName;
    private String playersNames;

    public Team() {
    }

    public Team(String teamName, String playersNames) {
        this.teamName = teamName;
        this.playersNames = playersNames;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getPlayersNames() {
        return playersNames;
    }

    public void setPlayersNames(String playersNames) {
        this.playersNames = playersNames;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", playersNames='" + playersNames + '\'' +
                '}';
    }
}
