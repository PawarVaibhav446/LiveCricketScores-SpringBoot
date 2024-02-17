package com.cricket.apis.services;

import java.util.List;

import com.cricket.apis.entities.Match;

public interface CricketService {
	
	List<Match> getLiveMatchScores();
	List<List<String>> getCWC2023PointTable();
	List<Match> getAllMatches();
}
