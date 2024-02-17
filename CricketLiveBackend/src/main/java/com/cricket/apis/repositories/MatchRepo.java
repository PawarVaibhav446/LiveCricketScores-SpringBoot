package com.cricket.apis.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.apis.entities.Match;

public interface MatchRepo extends JpaRepository<Match, Integer>{
	
	Optional<Match> findByTeamHeading(String teamHeading);
}
