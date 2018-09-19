package pl.coderslab.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String name;

    @JsonIgnoreProperties({"players", "league", "teams", "country"})
    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
    private List<League> leagues = new ArrayList<>();

}
