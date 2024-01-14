package com.crick.apis.services;

import java.util.List;
import java.util.Map;

import com.crick.apis.entities.Match;

public interface MatchService {

	//get all matches
	List<Match> getAllMatches();
	
	//get live matches
	
	List<Match> getLiveMatches();
	
	//get cwc2023 points table
		
	List<List<String>> getPointTable();
}
