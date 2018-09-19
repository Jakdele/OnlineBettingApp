package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.dto.TeamDto;
import pl.coderslab.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {

}
