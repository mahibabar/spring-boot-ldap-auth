package com.mb.springbootldapauth.controller;

import com.mb.springbootldapauth.model.Team;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @GetMapping
    public ResponseEntity<?> getTeams() {
        List<Team> teams = Arrays.asList(new Team(1L, "Chennai Super Kings", "CSK"),
                new Team(2L, "Mumbai Indians", "MI"));
        return ResponseEntity.ok(teams);
    }
}
