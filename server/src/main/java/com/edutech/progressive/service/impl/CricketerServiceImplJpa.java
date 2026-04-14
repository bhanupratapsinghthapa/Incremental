package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutech.progressive.entity.Cricketer;
import com.edutech.progressive.repository.CricketerRepository;

@Service
public class CricketerServiceImplJpa  {
    @Autowired
    CricketerRepository cricketerRepository;
    List<Cricketer> list = new ArrayList<>();
 

    public List<Cricketer> getAllCricketers() throws SQLException
    { 
        return cricketerRepository.findAll();  
    }
    public int  addCricketer(Cricketer cricketer)  throws SQLException
    {
        list.add(cricketer);
        cricketerRepository.save(cricketer);
        return -1;
    }
    public List<Cricketer> getAllCricketersSortedByExperience()  throws SQLException
    {
        List<Cricketer> list1 = new ArrayList<>(list);
        Collections.sort(list1);
        return list1;
        
    }
    public void updateCricketer(Cricketer cricketer)  throws SQLException
    {
    }
    public void deleteCricketer(int cricketerId)  throws SQLException
    {
         Cricketer cricketer = cricketerRepository.findById(cricketerId).get();
         cricketerRepository.delete(cricketer);
    }
    public Cricketer getCricketerById(int cricketerId)  throws SQLException
    {
        return cricketerRepository.findById(cricketerId).get();
    }
    public Cricketer getCricketerByTeam(int TeamId)  throws SQLException
    {
        return null;
    }


}