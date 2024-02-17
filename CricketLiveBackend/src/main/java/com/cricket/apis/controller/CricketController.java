package com.cricket.apis.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cricket.apis.entities.Match;
import com.cricket.apis.services.CricketService;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class CricketController {
	
	private CricketService cricketService;

    public CricketController(CricketService cricketService) {
        this.cricketService = cricketService;
    }
    
    @GetMapping("/live")
    public ResponseEntity<?> getLiveMatchScores(){
    	return new ResponseEntity<>(this.cricketService.getLiveMatchScores(), HttpStatus.OK);
    }
    
    @GetMapping("/points-table")
    public ResponseEntity<?> getCWC2023PointTable(){
    	return new ResponseEntity<>(this.cricketService.getCWC2023PointTable(), HttpStatus.OK);
    }
    
    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches() {
        return new ResponseEntity<>(this.cricketService.getAllMatches(), HttpStatus.OK);
    }
}
