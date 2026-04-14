package com.edutech.progressive.controller;

import com.edutech.progressive.entity.Cricketer;
import com.edutech.progressive.service.CricketerService;
import com.edutech.progressive.service.impl.CricketerServiceImplJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController @RequestMapping("/{cricketer}")
public class CricketerController {

    @Autowired
    CricketerServiceImplJpa cricketerServiceImplJpa;

    @GetMapping
    public ResponseEntity<List<Cricketer>> getAllCricketers() {
        try {
            return new ResponseEntity<>(cricketerServiceImplJpa.getAllCricketers(),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{cricketerId}")
    public ResponseEntity<Cricketer> getCricketerById(@PathVariable int cricketerId) {
        try {
            return new ResponseEntity<>(cricketerServiceImplJpa.getCricketerById(cricketerId),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    
    public ResponseEntity<Integer> addCricketer(Cricketer cricketer) {
       return null;
    }

    public ResponseEntity<Void> updateCricketer(int cricketerId, Cricketer cricketer) {
        return null;
    }

    public ResponseEntity<Void> deleteCricketer(int cricketerId) {
        return null;
    }

    public ResponseEntity<List<Cricketer>> getCricketersByTeam(int teamId) {
        return null;
    }
}