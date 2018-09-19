package pl.coderslab.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeagueDto {
    @JsonProperty("League_id")
    long apiLeagueId;

    @JsonProperty("League")
    private String name;

    @JsonProperty("Country")
    private CountryDto country;

    @JsonProperty("Teams")
    private List<TeamDto> teams;

    public LeagueDto(long apiLeagueId, String name, CountryDto country, List<TeamDto> teams) {
        this.apiLeagueId = apiLeagueId;
        this.name = name;
        this.country = country;
        this.teams = teams;
    }

    public LeagueDto() {
    }

    public long getApiLeagueId() {
        return apiLeagueId;
    }

    public void setApiLeagueId(long apiLeagueId) {
        this.apiLeagueId = apiLeagueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CountryDto getCountry() {
        return country;
    }

    public void setCountry(CountryDto country) {
        this.country = country;
    }

    public List<TeamDto> getTeams() {
        return teams;
    }

    public void setTeams(List<TeamDto> teams) {
        this.teams = teams;
    }


    @Override
    public String toString() {
        return "LeagueDto{" +
                "apiLeagueId=" + apiLeagueId +
                ", name='" + name + '\'' +
                ", country=" + country +
                ", teams=" + teams +
                '}';
    }
}
