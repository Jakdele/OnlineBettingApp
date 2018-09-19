package pl.coderslab.entity;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Data
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String operation;

    @OneToOne
    private Wallet wallet;
//
//    @ManyToOne
//    private User user;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "Datetime default CURRENT_TIMESTAMP")
    private Date created = new Date();
}
