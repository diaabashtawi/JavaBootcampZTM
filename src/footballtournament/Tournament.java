package footballtournament;

public class Tournament {

    private String name;
    private Team teams;
    private String matches;

    public Tournament() {
    }

    public Tournament(String name, Team teams, String matches) {
        this.name = name;
        this.teams = teams;
        this.matches = matches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeams() {
        return teams;
    }

    public void setTeams(Team teams) {
        this.teams = teams;
    }

    public String getMatches() {
        return matches;
    }

    public void setMatches(String matches) {
        this.matches = matches;
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "name='" + name + '\'' +
                ", teams=" + teams +
                ", matches='" + matches + '\'' +
                '}';
    }
}
