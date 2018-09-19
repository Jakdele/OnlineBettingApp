package pl.coderslab.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerDto {



    @JsonProperty("firstName")
    String firstName;
    @JsonProperty("lastName")
    String lastName;
    @JsonProperty("team_id")
    int teamId;

    public PlayerDto(String firstName, String lastName, int teamId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamId = teamId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public PlayerDto() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "PlayerDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", teamId=" + teamId +
                '}';
    }
}
