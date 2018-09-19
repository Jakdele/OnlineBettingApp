package pl.coderslab.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class League {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @JsonIgnoreProperties({"players", "league", "teams", "country"})
    @OneToMany(mappedBy = "league", fetch =  FetchType.LAZY)
    private List<Game>games = new ArrayList<>();

    @JsonIgnoreProperties({"players", "league", "teams", "country"})
    @OneToMany(mappedBy = "league", fetch = FetchType.LAZY)
    private List<Team> teams = new ArrayList<>();

    @JsonIgnoreProperties({"players", "league", "teams", "country"})
    @ManyToOne
    private Country country;


}
