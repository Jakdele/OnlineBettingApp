package pl.coderslab.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Data
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;

    @JsonIgnoreProperties({"players", "league", "teams", "country"})
    @ManyToOne
    private Team team;

}
