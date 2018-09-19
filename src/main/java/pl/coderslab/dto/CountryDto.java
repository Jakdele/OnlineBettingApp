package pl.coderslab.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryDto {
    @JsonProperty("Country_id")
    long apiCountryId;
    @JsonProperty("Country")
    String name;
    @JsonProperty("Capital")
    String capital;
    @JsonProperty("Leagues")
    List<LeagueDto> leagues;

    public CountryDto(long apiCountryId, String name, String capital, List<LeagueDto> leagues) {
        this.apiCountryId = apiCountryId;
        this.name = name;
        this.capital = capital;
        this.leagues = leagues;
    }

    public CountryDto() {
    }

    public List<LeagueDto> getLeagues() {
        return leagues;
    }

    public void setLeagues(List<LeagueDto> leagues) {
        this.leagues = leagues;
    }

    public long getApiCountryId() {
        return apiCountryId;
    }

    public void setApiCountryId(long apiCountryId) {
        this.apiCountryId = apiCountryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "CountryDto{" +
                "apiCountryId=" + apiCountryId +
                ", name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", leagues=" + leagues +
                '}';
    }
}
