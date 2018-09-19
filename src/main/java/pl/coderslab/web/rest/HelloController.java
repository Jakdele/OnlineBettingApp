package pl.coderslab.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.coderslab.dto.*;
import pl.coderslab.entity.Player;
import pl.coderslab.entity.Team;
import pl.coderslab.repository.PlayerRepository;
import pl.coderslab.repository.TeamRepository;

import java.util.Random;

@Controller
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);
    Random randy = new Random();
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private PlayerRepository playerRepository;


    @RequestMapping("/get-countries")
    public HttpStatus getCountriesAction() {
        String url = "http://localhost:8082/api/fake-countries";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CountryDto[]> responseCountries = restTemplate.getForEntity(
                url, CountryDto[].class);
        CountryDto[] countries = responseCountries.getBody();
        for (CountryDto country : countries) {
            logger.info("countries {}", country);
        }
        return responseCountries.getStatusCode();
    }

    @RequestMapping("/get-leagues")
    public HttpStatus getLeaguesAction() {
        String url = "http://localhost:8082/api/fake-country-leagues";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<LeagueDto[]> responseLeagues = restTemplate.getForEntity(
                url, LeagueDto[].class);
        LeagueDto[] leagues = responseLeagues.getBody();
        for (LeagueDto league : leagues) {
            logger.info("leagues {}", league);
        }
        return responseLeagues.getStatusCode();
    }


    @RequestMapping("/get-results")
    public HttpStatus getEvents() {
        String url = "http://localhost:8082/api/fake-results";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<MatchDto[]> responseMatches = restTemplate.getForEntity(
                url, MatchDto[].class);
        MatchDto[] matches = responseMatches.getBody();
        for (MatchDto match : matches) {
            logger.info("matches {}", match);
        }
        return responseMatches.getStatusCode();
    }


    @RequestMapping("/get-teams")
    @ResponseBody
    public HttpStatus getTeams() {
        String url = "http://localhost:8082/api/fake-teams";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<TeamDto[]> responseTeams = restTemplate.getForEntity(
                url, TeamDto[].class);
        TeamDto[] teams = responseTeams.getBody();
        for (TeamDto team : teams) {
            Team teamG = new Team();
            teamG.setName(team.getName());
            teamRepository.save(teamG);
            logger.info("teams {}", team);
        }


        return responseTeams.getStatusCode();
    }

    @RequestMapping("/get-players")
    @ResponseBody
    public HttpStatus getPLayers() {
        String url = "http://localhost:8082/api/fake-players";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<PlayerDto[]> responsePlayers = restTemplate.getForEntity(
                url, PlayerDto[].class);
        PlayerDto[] players = responsePlayers.getBody();

        for (PlayerDto player : players) {
            Player playerG = new Player();
            playerG.setFirstName(player.getFirstName());
            playerG.setLastName(player.getLastName());

            playerG.setTeam(teamRepository.getOne(player.getTeamId()));


            playerRepository.save(playerG);
            logger.info("players {}", player);
        }


        return responsePlayers.getStatusCode();
    }


}
