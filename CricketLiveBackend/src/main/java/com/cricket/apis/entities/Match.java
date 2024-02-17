package com.cricket.apis.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cricket_matches")
public class Match {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int matchId;
	
	private String teamHeading;  // India vs Pakistan
	private String matchNumberVenue; // 2nd Today: Rajkot Stadium, Gujarat
	
	private String battingTeam;  // India
	private String battingTeamScore;  // 302-8 (50.0 Overs)
	
	private String bowlingTeam;  // Pakistan
	private String bowlingTeamScore; // 286 - 10 (42.0 Overs)
	
	private String liveText; // India Opted to bat First
	private String textComplete; // India Won
	
	private String matchLink; // Cricbuzz Website
	
	@Enumerated
	private MatchStatus status;
	
	private Date date = new Date();
	
	public Match(int matchId, String teamHeading, String matchNumberVenue, 
			String battingTeam, String battingTeamScore,
			String bowlingTeam, String bowlingTeamScore, 
			String liveText, String textComplete, String matchLink,
			MatchStatus status, Date date) {
		super();
		this.matchId = matchId;
		this.teamHeading = teamHeading;
		this.matchNumberVenue = matchNumberVenue;
		this.battingTeam = battingTeam;
		this.battingTeamScore = battingTeamScore;
		this.bowlingTeam = bowlingTeam;
		this.bowlingTeamScore = bowlingTeamScore;
		this.liveText = liveText;
		this.textComplete = textComplete;
		this.matchLink = matchLink;
		this.status = status;
		this.date = date;
	}
	
	public Match() {
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public String getTeamHeading() {
		return teamHeading;
	}

	public void setTeamHeading(String teamHeading) {
		this.teamHeading = teamHeading;
	}

	public String getMatchNumberVenue() {
		return matchNumberVenue;
	}

	public void setMatchNumberVenue(String matchNumberVenue) {
		this.matchNumberVenue = matchNumberVenue;
	}

	public String getBattingTeam() {
		return battingTeam;
	}

	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}

	public String getBattingTeamScore() {
		return battingTeamScore;
	}

	public void setBattingTeamScore(String battingTeamScore) {
		this.battingTeamScore = battingTeamScore;
	}

	public String getBowlingTeam() {
		return bowlingTeam;
	}

	public void setBowlingTeam(String bowlingTeam) {
		this.bowlingTeam = bowlingTeam;
	}

	public String getBowlingTeamScore() {
		return bowlingTeamScore;
	}

	public void setBowlingTeamScore(String bowlingTeamScore) {
		this.bowlingTeamScore = bowlingTeamScore;
	}

	public String getLiveText() {
		return liveText;
	}

	public void setLiveText(String liveText) {
		this.liveText = liveText;
	}

	public String getTextComplete() {
		return textComplete;
	}

	public void setTextComplete(String textComplete) {
		this.textComplete = textComplete;
	}

	public String getMatchLink() {
		return matchLink;
	}

	public void setMatchLink(String matchLink) {
		this.matchLink = matchLink;
	}

	public MatchStatus getStatus() {
		return status;
	}

	public void setStatus(MatchStatus status) {
		this.status = status;
	}
	
	public void setMatchStatus() {
		if(this.textComplete.trim().isBlank()) {
			this.status = MatchStatus.LIVE;
		}else {
			this.status = MatchStatus.COMPLETED;
		}
	}

}
