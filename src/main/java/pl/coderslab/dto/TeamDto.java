package pl.coderslab.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TeamDto {


    @JsonProperty("Team_id")
    long apiTeamId;
    @JsonProperty("Team")
    String name;




    public TeamDto(long apiTeamId, String name) {
        this.apiTeamId = apiTeamId;
        this.name = name;
    }

    public TeamDto() {
    }

    public long getApiTeamId() {
        return apiTeamId;
    }

    public void setApiTeamId(long apiTeamId) {
        this.apiTeamId = apiTeamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TeamDto{" +
                "apiTeamId=" + apiTeamId +
                ", name='" + name + '\'' +
                '}';
    }
}
