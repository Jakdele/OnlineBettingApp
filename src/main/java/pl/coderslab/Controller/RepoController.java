//package pl.coderslab.Controller;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.client.RestTemplate;
//import pl.coderslab.dto.TeamDto;
//
//@Controller
//public class RepoController {
//
//    @RequestMapping("/get-teams")
//    @ResponseBody
//    public HttpStatus getTeams() {
//        String url = "http://localhost:8089/api/fake-teams";
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<TeamDto[]> responseTeams = restTemplate.getForEntity(
//                url, TeamDto[].class);
//        TeamDto[] teams = responseTeams.getBody();
//
//        return responseTeams.getStatusCode();
//    }
//}
