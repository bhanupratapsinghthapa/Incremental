package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.edutech.progressive.entity.Match;
import com.edutech.progressive.repository.MatchRepository;

public class MatchServiceImplJpa  {

      @Autowired
    MatchRepository matchRepository;
    List<Match> list = new ArrayList<>();
 

    public List<Match> getAllMatches() throws SQLException
    { 
        return matchRepository.findAll();  
    }
    public int  addMatch(Match match)  throws SQLException
    {
        list.add(match);
        matchRepository.save(match);
        return -1;
    }
    public List<Match> getMatchById(int matchId)  throws SQLException
    {
        return null;
        
    }
    public void updateMatch(Match match)  throws SQLException
    {
    }
    public void deleteMatch(int matchId)  throws SQLException
    {
         Match match = matchRepository.findById(matchId).get();
         matchRepository.delete(match);
    }
    public Match getAllMatchesStatus(String status)  throws SQLException
    {
          return null;
    }
   

}