package com.myplantdiary.enterprise;

import com.myplantdiary.enterprise.dto.Specimen;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

@Controller

public class plantDiaryController {

    /**

     * Handle the root (/) endpoints and return a start page

     * @return

     */

    @RequestMapping("/")

    public String index(){

        Specimen specimen = new Specimen();

        specimen.getSpecimenID();

        return "start";

    }

    @GetMapping("/specimen")

    public ResponseEntity fetchAllSpecoimens() {

        return new ResponseEntity(HttpStatus.OK);

    }

    @GetMapping("/specimen/{id}")

    public ResponseEntity fetchSpecimenById(@PathVariable("id") String id) {

        return new ResponseEntity(HttpStatus.OK);

    }

    @PostMapping(value = "/specimen", consumes = "application/json", produces = "/application/json")

    public Specimen createSpecimen(@RequestBody Specimen specimen) {

        return specimen;

    }

    @DeleteMapping("/specimen/{id}")

    public ResponseEntity deleteSpecimen(@PathVariable("id") String id) {

        return new ResponseEntity(HttpStatus.OK);

    }

}