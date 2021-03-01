 
public class Sport {

    public String homeTeam;
    public String awayTeam;
    public int homePoints;
    public int awayPoints;

    public Sport(String home, String away, int homePoints, int awayPoints) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homePoints = homePoints;
        this.awayPoints = awayPoints;

    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public int getHomePoints() {
        return homePoints;
    }

    public int getAwayPoints() {
        return awayPoints;
    }

    public boolean isWinner(String team) {
        if (team.equals(homeTeam) && homePoints > awayPoints) {
            return true;
        }
        if (team.equals(awayTeam) && awayPoints > homePoints) {
            return true;
        }
        return false;

    }
}
