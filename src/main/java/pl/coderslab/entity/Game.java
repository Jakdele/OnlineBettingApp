package pl.coderslab.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "DATETIME")
    private LocalDateTime startTime;

    private boolean finished;


    @ManyToOne
    @JsonIgnoreProperties({"players", "league", "teams", "country"})
    private Country country;


    @ManyToOne
    @JsonIgnoreProperties({"players", "league", "teams", "country"})
    private Team homeTeam;

    private int homeScore;


    @ManyToOne
    @JsonIgnoreProperties({"players", "league", "teams", "country"})
    private Team awayTeam;

    private int awayScore;


    @ManyToOne
    @JsonIgnoreProperties({"players", "league", "teams", "country"})
    private League league;


    @OneToMany
    @JsonIgnoreProperties({"players", "league", "teams", "country"})
    private List<Player> goalScorer = new ArrayList<>();

}
