package pl.coderslab.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchDto {
    @JsonProperty("Match_id")
    private int apiMatchId;
    @JsonProperty("matchDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private String matchDate;
    @JsonProperty("firstTeam")
    private TeamDto homeTeam;
    @JsonProperty("secondTeam")
    private TeamDto awayTeam;
    @JsonProperty("firstPoints")
    private int homeScore;
    @JsonProperty("secondPoints")
    private int awayScore;
    @JsonProperty("League")
    private LeagueDto league;

    public MatchDto(int apiMatchId, String matchDate, TeamDto homeTeam, TeamDto awayTeam, int homeScore, int awayScore, LeagueDto league) {
        this.apiMatchId = apiMatchId;
        this.matchDate = matchDate;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.league = league;
    }

    public MatchDto() {
    }

    public int getApiMatchId() {
        return apiMatchId;
    }

    public void setApiMatchId(int apiMatchId) {
        this.apiMatchId = apiMatchId;
    }

    public String getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(String matchDate) {
        this.matchDate = matchDate;
    }

    public TeamDto getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(TeamDto homeTeam) {
        this.homeTeam = homeTeam;
    }

    public TeamDto getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(TeamDto awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public LeagueDto getLeague() {
        return league;
    }

    public void setLeague(LeagueDto league) {
        this.league = league;
    }

    @Override
    public String toString() {
        return "MatchDto{" +
                "apiMatchId=" + apiMatchId +
                ", matchDate=" + matchDate +
                ", homeTeam=" + homeTeam +
                ", awayTeam=" + awayTeam +
                ", homeScore=" + homeScore +
                ", awayScore=" + awayScore +
                ", league=" + league +
                '}';
    }
}
